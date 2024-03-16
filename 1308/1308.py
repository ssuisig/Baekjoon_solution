import sys

def calc_day(y, m, d):
    arrDay =[0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    day = 0
    for i in range(1, y):
        day += (365+is_leaf(i))
        
    for i in range(1, m):
        if(i == 2):
            day += is_leaf(y)
        day += arrDay[i]
    
    return day+d

def is_gg(dy, dm, dd, ty, tm, td):
    if dy-ty > 1000 or (dy-ty==1000 and (dm-tm > 0 or (dm-tm==0 and dd-td >= 0))):
        return True
    else:
        return False

def is_leaf(y):
    if y % 400 == 0 or (y % 4 == 0 and y % 100 != 0):
        return 1
    else:
        return 0
    
today = sys.stdin.readline().strip()
dday = sys.stdin.readline().strip()

toYear, toMonth, toDay = map(int, today.split()) 
dYear, dMonth, dDay = map(int, dday.split()) 

toDiffDay = 0
dDiffDay = 0

if is_gg(dYear, dMonth, dDay, toYear, toMonth, toDay):
    print("gg")
else:
    dDiffDay = calc_day(dYear, dMonth, dDay)
    toDiffDay = calc_day(toYear, toMonth, toDay)
    print("D-%d"%(dDiffDay-toDiffDay))


