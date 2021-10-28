# -- coding: utf-8 --
# Дана строка, состоящая ровно из двух слов, разделенных пробелом. Переставьте эти слова местами


def swap_string():

    S = str(input('Введите строку из 2-х слов: '))
    c = S.find(' ') + 1
    str_second = S[:c]
    str_first = S[-(len(S) - c):]
    print(str_first + ' ' + str_second)

swap_string()