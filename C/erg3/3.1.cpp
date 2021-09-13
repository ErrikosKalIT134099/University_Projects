#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define n 3
int main()
{
	float ksi;
	int x=4;
	float p[n];
	float q[n];
	
	for(int i=0;i<x;i++){
		printf("p[%i]: ",i);
		scanf("%f",&p[i]);

	}

	printf("Auta pou plhktrologises eiani : ");
	
    for(int i=0;i<x;i++){
    	printf("\np[%i]=%f ",i,p[i]);
    }
    
    printf("\nDwse timi gia to ksi: ");
    scanf("%f",&ksi);
    
    printf("\nTo ksi einai:%f \n",ksi);
    
    
  
    
    for(int i=1;i<x;i++){
    	  q[0]=p[0];
    q[i] = p[i] + q[i-1]*ksi;
    
    }
    
    
    for(int i=0;i<x-1;i++){
    		printf("\n oi timh toy suntelesti q[%i]: %f",i,q[i]);
    	
    }
    printf("\n to ypolipo einai  q[%d]: %f \n",3,q[3]); 
    
    system("Pause");
    return(0);
}

