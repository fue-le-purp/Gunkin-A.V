# -- coding: utf-8 --
# Дана строка, состоящая из слов, разделенных пробелами.

def count_words():
    s = str(input("Введите строку: "))
    n = s.count(' ')
    print(n + 1)


count_words()
