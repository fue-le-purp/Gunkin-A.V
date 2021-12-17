# -- coding: utf-8 --
# Дана строка, состоящая из слов, разделенных пробелами.

def count_words():
    line = str(input("Введите строку: "))
    count = line.count(' ')
    print(count + 1)


count_words()
