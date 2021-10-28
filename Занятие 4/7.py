# -- coding: utf-8 --
# Дана строка, в которой буква h встречается минимум два раза.

def delete_h():

    S = str(input('Введите строку: '))
    first_h = S.find('h')
    second_h = S.rfind('h')
    delete = S[first_h:second_h + 1]
    print(S.replace(delete, '', 1))

delete_h()