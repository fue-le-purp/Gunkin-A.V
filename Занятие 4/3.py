# -- coding: utf-8 --
# Дана строка. Разрежьте ее на две равные части

def cut_string():
    s = str(input("Введите строку: "))
    s_first = s[(len(s) + 1) // 2:]
    s_second = s[:(len(s) + 1) // 2]
    print(s_first + s_second)


cut_string()
