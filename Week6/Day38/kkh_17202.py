phoneA = [int(a) for a in str(input())]
phoneB = [int(a) for a in str(input())]
fullNum = []
possibility = []

for i in range(0, len(list(phoneA))): 
    fullNum.append(phoneA[i])
    fullNum.append(phoneB[i])

while (len(fullNum) > 2) : 
	for i in range(0, len(fullNum)-1):
		num = fullNum[i] + fullNum[i+1]
		if num >= 10:
			num -= 10
		possibility.append(num)
	fullNum = possibility
	possibility = []
   
print(*fullNum, sep='')
## 잘해 아주~
