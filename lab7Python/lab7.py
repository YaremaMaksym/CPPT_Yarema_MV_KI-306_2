import sys

rows_num = int(input("Введіть розмір квадратної матриці: "))
lst = []
filler = input("Введіть символ-заповнювач: ")

for i in range(rows_num):
    lst.append([])
    for j in range(rows_num - i):
        if len(filler) == 1:
            lst[i].append(ord(filler))
            print(chr(lst[i][j]), end=" ")
        elif len(filler) == 0:
            print("Не введено символ-заповнювач")
            sys.exit(1)
        else:
            print("Забагато символів-заповнювачів")
            sys.exit(1)
    print()