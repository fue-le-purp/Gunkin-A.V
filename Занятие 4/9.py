# -- coding: utf-8 --
# Пользователь вводит строку и символ для удаления. Необходимо удалить этот символ из всей строки.

def del_symbol():

    S = str(input('Введите строку: '))
    symbol = str(input('Введите символ для удаления: '))
    print(S.replace(symbol, ''))

del_symbol()