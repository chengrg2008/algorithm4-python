import random
def randomList(len):
	a = []
	while len >0:
		a.append(random.randint(1,100))
		len -= 1

	print('排序前：',a)
	return a