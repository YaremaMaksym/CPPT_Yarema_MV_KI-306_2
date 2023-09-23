##################################################################################
# Copyright (c) 2023 Lviv Polytechnic National University. All Rights Reserved.
#
# This program and the accompanying materials are made available under the terms
# of the Academic Free License v. 3.0 which accompanies this distribution, and is
# available at https://opensource.org/license/afl-3-0-php/
#
# SPDX-License-Identifier: AFL-3.0
##################################################################################
import os
import struct
import math 
import sys

def writeResTxt(fName, result):
     with open(fName, 'w') as f:
         f.write(str(result))

def readResTxt(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
                result = f.read()
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        # See https://docs.python.org/3/library/struct.html
        f.write(struct.pack('f', result))

def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                # See https://docs.python.org/3/library/struct.html
                result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

def calculate(x):
    return math.sin(x) /(x + math.tan(x))

if __name__ == "__main__":
    data = float(input("Enter data: "))
    result = calculate(data)
    print(f"Result in python is : {result}")
    try:
        writeResTxt("textRes.txt", result)
        writeResBin("binRes.bin", result)
        print("Result in txt is: {0}".format(readResBin("binRes.bin")))
        print("Result in bin is: {0}".format(readResTxt("textRes.txt")))
    except FileNotFoundError as e:
        print (e)
        sys.exit(1)