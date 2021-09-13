#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int factorial(int n);

int main()
{
    int x,n;
    float myexp;
    double oros;
    printf("Dwse to x kai to n :");  
    scanf("%i %i",&x,&n);
    printf("Oi ari8moi pou plhktrologises einai :x=%i n=%i \n",x,n);  
    
    for(int i=0;i<=n;i++){
            oros=(pow(x,i)/factorial(i));
            myexp=(oros+myexp);
    }
   
    printf("\nx=%i myexp(%i)=%f exp(%i)=%f \n",x,x,myexp,x,exp(x));        
    system("Pause");
    return(0);
}

int factorial(int n)
{
    double par;
    int j;
    par =1;
    for (j=1;j<=n;j++){
        par = par *j;   
    }
    return par;  
}
