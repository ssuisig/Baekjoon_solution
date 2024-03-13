import sys

n = int(sys.stdin.readline())

preCount = 0
count = 1

while True:
    if n <= preCount + count:
        if count % 2 == 0:
            print("%d/%d"%((n-preCount), (count-(n-preCount-1))))
            break
        else:
            print("%d/%d"%((count-(n-preCount-1)), (n-preCount)))
            break
    else:
        preCount += count
        count += 1
    

