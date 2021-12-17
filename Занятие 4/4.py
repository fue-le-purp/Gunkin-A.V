# -- coding: utf-8 --
# Дана строка, состоящая ровно из двух слов, разделенных пробелом. Переставьте эти слова местами


def swap_string():
    line = str(input("Введите строку из 2-х слов: "))
    c = line.find(' ') + 1
    line_second = line[:c]
    line_first = line[-(len(line) - c):]
    print(line_first + ' ' + line_second)


swap_string()
