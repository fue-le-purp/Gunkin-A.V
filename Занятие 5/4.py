x = int(input())
y = int(input())
n = 1
s = x

while s <= y:
    x *= 1.1
    n += 1
    s += x
print(n)
