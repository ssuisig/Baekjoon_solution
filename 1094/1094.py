stick = 64;
x = int(input())
count = 0

while(x > 0):
    if stick > x:
        stick /= 2
    else:
        x -= stick
        count += 1
print(count)