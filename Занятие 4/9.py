# -- coding: utf-8 --
# Пользователь вводит строку и символ для удаления. Необходимо удалить этот символ из всей строки.

def del_symbol():
    line = str(input("Введите строку: "))
    symbol = str(input("Введите символ для удаления: "))
    print(line.replace(symbol, ''))


del_symbol()
