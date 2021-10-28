# -- coding: utf-8 --
# Дана строка, состоящая из слов, разделенных пробелами.

def count_words():

    S = str(input('Введите строку: '))
    n = S.count(' ')
    print(n + 1)

count_words()