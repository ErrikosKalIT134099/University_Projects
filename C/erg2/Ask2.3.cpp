#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
   int x=3,n=3,i=1;
   double oros=1;
   float myexp=1;
   
   while(oros>pow(10,-15)){
   
     oros=oros*x/i;
          myexp=myexp+oros;
          printf("x=%i // myexp=%f // exp(%i) \n#include <stdio.h>",x,myexp,x,exp(x));   
           	i=i+1;                
   }
    
 
    
    system("Pause");
    return(0);
}
