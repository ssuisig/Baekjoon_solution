import sys

def checker():
    s = sys.stdin.readline()
    check = []

    check.append(s[0])
    for i in range(1, len(s)):
        if s[i-1] != s[i] and s[i] in check:
            return False
        elif s[i-1] != s[i] and s[i] not in check:
            check.append(s[i])
    
    return True

def checker2():
    s = sys.stdin.readline().strip()
    check = [False for _ in range(26)]
    prev = 0
    
    for i in range(len(s)):
        now = ord(s[i])
        if prev != now:
            if check[now-ord('a')] == False:
                check[now-ord('a')] = True
                prev = now
            else:
                return False
        else:
            continue
    return True

n = int(sys.stdin.readline())
count = 0

for i in range(n):
    if checker2():
        count += 1
print(count)