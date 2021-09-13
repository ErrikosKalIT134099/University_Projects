#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define f(x,num) ( pow(x,2) - num )
#define g(x,num) ((1/3)*(2*x+ num/x))




double sqrtdpr(double num)
{
		double x;
		x = num; 
		int i=0;
			
		while(fabs(f(x,num))>pow(10,-15))
		{
		    	printf("fabs=%lf\n",fabs((f(x,num))));
			x=g(x,num);
				printf("g(x,num)=%lf\n",x);
			i=i+1;
			
		}
	
	printf("i=%d",i);
}


double sqrtnr(double num)
{
	double x;
	x=num;
	int i=0;
	while(fabs(f(x,num))>pow(10,-15))
	{
		x= x-f(x,num)/(2*x);
		i=i+1;
		
		
	}
	return x;
	 printf("Oi epanalipseis egia to sqrtn=%d\n",i);
}

double sqrtdix(double num)
{
	
}





int main()
{
	double num;
	do{
	
		
	printf("dwse thetiki timi gia to num\n");
	scanf("%lf",&num);
} while(num<=0);
	
	
	printf("\nMenu epilogon\n\n1. Methodos Dixotomisis\n2. Methodos Diadoxikon Proseggiseon\n3.Methodos Newton-Raphson\n4.Telos");
	
	
		int epil;
	do
	{
	
	printf("dwse tin epilogi sou\n");
	scanf("%d",&epil);
	if(epil==1)
	{
		sqrtdix(num);
	}
	else if(epil==2)
	{
		sqrtdpr(num);
	    
	}
	else if(epil==3)
	{
		
	    printf("sqrtnr(num)=%.16lf\n",sqrtnr(num));
		printf("sqrt(num)=%.16lf\n",sqrt(num));
		printf("sqrtnr(num)=%.16lf-sqrt(num)=%.16lf\n",sqrtnr(num)-sqrt(num)); // den ginete i aferesi swsta 
	}
	else
	{
		printf("Telos programmatos\n");
	}
	
		}while(epil!=4);
	
	system("pause");
	
}
