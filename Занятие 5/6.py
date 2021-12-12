x = int(input())
n = 0
s = 0
while x != 0:
    n += 1
    s += x
    x = int(input())
    result = s / n
print(result)