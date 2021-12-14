# -- coding: utf-8 --
# Дана строка, состоящая ровно из двух слов, разделенных пробелом. Переставьте эти слова местами


def swap_string():
    s = str(input("Введите строку из 2-х слов: "))
    c = s.find(' ') + 1
    str_second = s[:c]
    str_first = s[-(len(s) - c):]
    print(str_first + ' ' + str_second)


swap_string()
