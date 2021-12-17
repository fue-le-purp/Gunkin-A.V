# -- coding: utf-8 --
# Дана строка. Найдите в этой строке второе вхождение буквы f, и выведите индекс этого вхождения.

def f_second():
    line = str(input("Введите строку: "))
    count_f = line.count('f')
    if count_f >= 2:
        arrange = line.find('f') + 1
        f_scope = line.find('f', arrange)
        print(f_scope)
    else:
        if count_f == 1:
            print(-1)
        else:
            print(-2)


f_second()
