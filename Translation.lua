while a<b do 
	while c<d do 
		while e<f do 
			print ("ciao")
			
		end
		print ("fine while innestato")
		
	end
	print ("something else")
	
end
print ("fin")
function funzione1()

	c="gigi la trottola"
	print (c)
	
end
function funzione2(a,b)
	local b=b or 1

	c=a+b;
	print (c)
	
end
if a>0 then 
	print ("a > 0")
	
elseif a==0 then 
	print ('a == 0')
	
else 
	print ('a < 0')
	
end
a=0
while a<15 do 
	a=a+1
	if a>5 and a<=10 then 
		print (a, " > ", 5)
		
	elseif a<5 then 
		print (a, " < ", 5)
		
	elseif a>10 then 
		print ("Troppo grande for me")
		print ("funzione2 (passo un parametro): ")
		funzione2(a)
		print ("funzione2 (passo due parametri): ")
		funzione2(a,4)
		break ;
		
	else 
		a=a/2
		c=a-4*80
		c=c*18
		print ("prova")
		
	end
	
end
