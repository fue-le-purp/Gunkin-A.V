# -- coding: utf-8 --
# Дана строка. Если в этой строке буква f встречается только один раз, выведите её индекс.

def f_count():
    line = str(input("Введите строку: "))
    count_l = line.count('f')
    if count_l > 1:
        print(line.find('f'), line.rfind('f'))
    if count_l == 1:
        print(line.find('f'))


f_count()
