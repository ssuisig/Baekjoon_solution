import sys 

n = int(sys.stdin.readline())
lst =[]

for i in range(n):
    lst.append(sys.stdin.readline().strip())

s = set(lst)
lst = list(s)

lst.sort()
lst.sort(key=len)

for i in lst:
    print(i)