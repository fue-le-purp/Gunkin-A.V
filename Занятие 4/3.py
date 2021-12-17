# -- coding: utf-8 --
# Дана строка. Разрежьте ее на две равные части

def cut_string():
    line = str(input("Введите строку: "))
    line_first = line[(len(line) + 1) // 2:]
    line_second = line[:(len(line) + 1) // 2]
    print(line_first + line_second)


cut_string()
