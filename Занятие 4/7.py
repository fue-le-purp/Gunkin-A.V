# -- coding: utf-8 --
# Дана строка, в которой буква h встречается минимум два раза.

def delete_h():
    s = str(input("Введите строку: "))
    first_h = s.find('h')
    second_h = s.rfind('h')
    delete = s[first_h:second_h + 1]
    print(s.replace(delete, '', 1))


delete_h()
