#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int x,n;
    int oros=1;
    float myexp=1;
    printf("Dwse 2 akeraious ari8mous: ");
    scanf("%i %i",&x,&n);
    printf("To x=%i kai to n=%i \n",x,n);
    
    for(int i=1;i<n;i++){
          
          oros=oros*x/i;
          myexp=myexp+oros;
    }
    
    printf("x=%i // myexp=%f // exp(%i)=%f \n",x,myexp,x,exp(x));
    
    system("Pause");
    return(0);
}
