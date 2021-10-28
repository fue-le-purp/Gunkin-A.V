# -- coding: utf-8 --
# Дана строка, в которой буква h встречается как минимум два раза. Разверните последовательность символов

def invert_h():

    S = str(input('Введите строку: '))
    first_h = S.find('h')
    second_h = S.rfind('h')
    S = S[first_h + 1:second_h]
    print(S[::-1])

invert_h()