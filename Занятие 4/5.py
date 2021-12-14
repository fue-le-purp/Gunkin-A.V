# -- coding: utf-8 --
# Дана строка. Если в этой строке буква f встречается только один раз, выведите её индекс.

def f_count():
    s = str(input("Введите строку: "))
    count_l = s.count('f')
    if count_l > 1:
        print(s.find('f'), s.rfind('f'))
    if count_l == 1:
        print(s.find('f'))
    else:
        None


f_count()
