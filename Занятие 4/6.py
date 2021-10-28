# -- coding: utf-8 --
# Дана строка. Найдите в этой строке второе вхождение буквы f, и выведите индекс этого вхождения.

def second_f():

    S = str(input('Введите строку: '))
    count_f = S.count('f')
    if count_f >= 2:
        arrange = S.find('f') + 1
        second_f = S.find('f', arrange)
        print(second_f)
    else:
        if count_f == 1:
            print(-1)
        else:
            print(-2)

second_f()