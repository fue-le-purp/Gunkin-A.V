# -- coding: utf-8 --
# Дана строка, в которой буква h встречается минимум два раза.

def delete_h():
    line = str(input("Введите строку: "))
    first_h = line.find('h')
    second_h = line.rfind('h')
    delete = line[first_h:second_h + 1]
    print(line.replace(delete, '', 1))


delete_h()
