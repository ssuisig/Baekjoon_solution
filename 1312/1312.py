import sys

str = sys.stdin.readline()

a, b, c = map(int, str.split())

result = (a%b) * 10

for i in range(1, c):
    result %= b
    result *= 10

result //= b

print(result)