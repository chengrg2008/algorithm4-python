'''
希尔排序
将整个集合分为多个大小为h的小数组 然后再将整个排序
'''
from myutils import myutil
def less(x,y):
	return x < y

def shell(a):
	N = len(a) # 总的长度
	h = 1
	while h < N / 3:
		h = 3*h + 1 # 计算分组的最大值
	while h >= 1:
		for i in range(h, N):
			j = i
			# 对每个分组执行插入排序
			while j >= h:
				if less(a[j], a[j-h]):
					a[j], a[j-h] = a[j-h], a[j]
				j -= h
		# 将h 逐渐缩小知道等于1 这时整个集合都排序完成了
		h = h // 3
	print('排序后：',a)


a = list('SORTEXAMPLE')
b = myutil.randomList(13)
shell(a)
shell(b)