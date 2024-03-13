import sys

s = list(sys.stdin.readline())
list = []

for i in range(2,len(s)-1):
    for j in range(1, i):
        s1 = s[0:j]
        s2 = s[j:i]
        s3 = s[i:-1]

        s1.reverse()
        s2.reverse()
        s3.reverse()

        list.append(s1+s2+s3)

list.sort()
result = ''.join(list[0])

print(result)