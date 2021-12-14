# -- coding: utf-8 --

k = int(input("Количество чисел: "))
n = int(input("Номер: "))
t = n
summa = 0
result = 0
rang = k + n
first = 0
second = 1
for i in range(0, rang - 1):
    summa = first + second
    if t >= n:
        result += summa - first
    t += 1
    first = second
    second = summa
    print(summa)
print(result + 1)
