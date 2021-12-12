n = int(input())
if n >= 2:
    i = 1
    while i <= n:
        i += 1
        if n % i == 0:
            print(i)
            break
