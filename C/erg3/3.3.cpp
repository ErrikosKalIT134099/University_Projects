#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void horner1(int n,float p[],int ksi){
	float q[n];
	p[0]=q[0];
	
	for(int i=0;i<n;i++){
			q[i] = p[i] + q[i-1]*ksi;  
	}
	
}

int main()
{
	int ksi;
	int n=0;
	float p[n],q[n];
	
	printf("Dwse ton vathmo toy poluonymou: ");
		scanf("%i",&n);
	printf("O Vathmos tou poluonymou einai: %i\n",n);
	
	for(int i=0;i<n;i++){
		printf("Dwse ton syntelesth p[%i]: ",i);
		scanf("%f",&p[i]);
	}
	
	for(int i=0;i<n;i++){
		printf("\nO suntelesths suntelesth toy p[%i]=%f",i,p[i]);
	}
	
	printf("\nDwse to ksi: ");
	scanf("%f",&ksi);
	
	printf("Ksi=%f",ksi);
	
	
	horner1(n,p,ksi);
	

	system("Pause");
	return(0);
}
