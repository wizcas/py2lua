s=0;
pippo=40;
while s<100:
	pippo=pippo/2;
	ciccio=3
	s=s + ciccio;
	if (s>8) & (pippo<10):
		break;
	elif (s<8) | (pippo<10):
		print "Ciao";
	print s
a = 0
while a < 15:
	a = a + 1
	if (a > 5)&(a<=10):
		print a," > ",5
	elif a < 5:
		print a," < ",5
	elif a > 10:
		print "Troppo grande for me"
		break
	else:
		b=a**2
		c=a
		c*=2
		print "Hello 5 il quadrato e'"
print "Salutamu"


def f(**kargs):
	for k in kargs:
		print k, kargs[k]

dic = {c:11,d:12,e:13}
f(dic)

dic = {"a":2,"b":4}
for i in dic:
	print i,dic[i]

