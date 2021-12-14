# -- coding: utf-8 --
n = int(input())
first = 0
second = 1
result = 0
for i in range(0, n - 1):
    summa = first + second
    result += summa - first
    first = second
    second = summa
print(result)
