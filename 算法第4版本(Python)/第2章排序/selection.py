'''
选择排序
将a[i] 和a[i+1....N]中的最小值交换
'''

from myutils import myutil

def selection(a):
	n = len(a)
	for i, element in enumerate(a):
		min = i
		for j in range(i+1,n):
			if a[j] < a[min]:
				min = j
		a[i], a[min] = a[min], a[i]
	print('排序后：',a)


a = list('SORTEXAMPLE')
b = myutil.randomList(12)
selection(a)
selection(b)


