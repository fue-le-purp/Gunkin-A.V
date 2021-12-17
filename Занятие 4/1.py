# -- coding: utf-8 --
# Дана строка Hi

def string():
    line = str(input("Введите строку: "))
    print(line[2])
    print(line[-2])
    print(line[:5])
    print(line[:-2])
    print(line[0::2])
    print(line[1::2])
    print(line[::-1])
    print(line[-1::-2])
    print(len(line))


string()
