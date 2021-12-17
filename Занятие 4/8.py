# -- coding: utf-8 --
# Дана строка, в которой буква h встречается как минимум два раза. Разверните последовательность символов

def invert_h():
    s = str(input("Введите строку: "))
    first_h = s.find('h')
    second_h = s.rfind('h')
    s = s[first_h + 1:second_h]
    print(s[::-1])


invert_h()
