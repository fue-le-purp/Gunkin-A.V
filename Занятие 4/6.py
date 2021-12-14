# -- coding: utf-8 --
# Дана строка. Найдите в этой строке второе вхождение буквы f, и выведите индекс этого вхождения.

def f_second():
    s = str(input("Введите строку: "))
    count_f = s.count('f')
    if count_f >= 2:
        arrange = s.find('f') + 1
        f_scope = s.find('f', arrange)
        print(f_second)
    else:
        if count_f == 1:
            print(-1)
        else:
            print(-2)


f_second()
