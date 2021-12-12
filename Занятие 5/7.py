N = 11
arr = [0]*N
k = 0
result = 0

for i in range(N):
    arr[i] = int(input())
    if arr[i] == 0:
        break

for i in range(N - 1):
    if arr[i] < arr[i + 1]:
        k += 1
        if k > result:
            result = k
    else:
        k = 0

print(result)