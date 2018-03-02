'''
插入排序
将a[i] 与a[i-1]、a[i-2]、a[i-3].....a[0]比较 找到合适的位置插入
'''
from myutils import myutil

def less(x,y):
	return x < y

def insertion(a):
	n = len(a)
	for i in range(1, n):
		j = i
		while j > 0:
			if less(a[j], a[j-1]):
				a[j], a[j-1] = a[j-1], a[j]
			j -= 1
	print('排序后：',a)
	
a = list('SORTEXAMPLE')
b = myutil.randomList(14)
insertion(a)
insertion(b)
