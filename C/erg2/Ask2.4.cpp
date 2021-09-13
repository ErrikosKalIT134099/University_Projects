#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double  myexp(int x){
      int i=1;
      double oros=1;
      double sum=1;
      
      while(oros>pow(10,-15)){
        oros=oros*x/i;
        sum=sum+oros; 
       i=i+1;                      
      }
      return sum;
      }

int main()
{
    int x=3;

   myexp(x);
    printf("x=%i // myexp=%f // exp(%i)=%f",x,exp(x),x,exp(x));
    
    system("Pause");
    return(0);
}


