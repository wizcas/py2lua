#Questo documento contine degli esempi di definizione di funzioni
#Inoltre dei cicli while per fare delle prove

def funzione1():
	c= "gigi la trottola"
	print c

def funzione2(a, b=1):
	c= a+b;
	print c

def funzione3 (a=4,f=18,*aaa):
	c = a*f
	print c
	for k in aaa:
		print k
a = 0
while a < 15:
	a = a + 1
	if (a > 5)&(a<=10):
		print a," > ",5
	elif a < 5:
		print a," < ",5
	elif a > 10:
		print "Troppo grande for me"
		print "funzione2 (passo un parametro): ",
		funzione2(a) 
		print "funzione2 (passo due parametri): ",
		funzione2(a,4)
		break;
	else:
		b=a**2
		c=a
		c*=2
		print "Hello 5 il quadrato e' ", b, "il doppio e' ", c
		print "funzione1: ",funzione1()
print "Salutamu"

for i in [4,5,6,7,8]:
	print i

dic = {"c":1,"d":2,"e":5}
for i in dic:
	print i, dic[i]
	dic[i] += 20


