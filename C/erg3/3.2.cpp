#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
	int n=0;
	float p[n],q[n];
	float ksi;
	
	printf("Dwse ton vathmo tou poluonumou: ");
	scanf("%i",&n);
	printf("O vathmos tou poluonymou einai: %i",n);
	
	for(int i=0;i<n;i++){
		printf("\nDwse ton suntelesth toy p[%i]:",i);
		scanf("%f",&p[i]);
	}
	
	for(int i=0;i<n;i++){
		printf("\nO suntelesths suntelesth toy p[%i]=%f",i,p[i]);
	}
	
	printf("\nDwse to ksi: ");
	scanf("%f",&ksi);
	
	printf("Ksi=%f",ksi);
	
	for(int i=0;i<n;i++){
		q[0]=p[0];
		q[i] = p[i] + q[i-1]*ksi;
	}
	
	for(int i=0;i<n;i++){
		printf("\nQ[%i]=%f",i,q[i]);
	}
	
	 printf("\nTo ypolipo einai  q[%i]: %f \n",n-1,q[n-1]); 
	
	system("Pause");
	return(0);
}
