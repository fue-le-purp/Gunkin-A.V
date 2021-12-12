N = 22
arr = [0]*N
k = 1
result = 0

for i in range(N):
    arr[i] = int(input())
    if arr[i] == 0:
        break

for i in range(N - 1):
    if arr[i] == arr[i + 1]:
        k += 1
        if k > result:
            result = k
    else:
        k = 1

print(result)
