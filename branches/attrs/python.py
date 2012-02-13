while a<b:
	while c<d:
		while e<f:
			print "ciao"
		print "fine while innestato"
	print "something else"
print "fin"

def funzione1():
	c= "gigi la trottola"
	print c

def funzione2(a, b=1):
	c= a+b;
	print c	

if a>0:
	print "a > 0"
elif a == 0:
	print 'a == 0'
else:
	print 'a < 0'

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
		a/=2
		c=a-4*80
		c*=18
		print "prova"

