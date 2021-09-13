#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define f(x,num) ( pow(x,2) - num )



int main()
{ 
    float result;
    float num;
    float x,oldx;
   //Diavazoume tis metavlites num, x, oldx 
    printf("Dwse timi gia tin metavliti num=");
    scanf("%f",&num);
    x=num/2;
    oldx=num;
    
    //emfanizoume ta periexomena twn metavlitwn num, x ,oldx
    printf("Num=%f \n",num);
    printf("X=%f \n",x);
    printf("oldX=%f \n",oldx);
   //emfanisi timis ta num kai tis rizas toy
    result = sqrt (num);
    printf ("sqrt(%f) = %f\n",num, result);
    
    while (fabs(x-oldx)>pow(10,-15)) 
{
    x=oldx;
    x = x - f(x,num)/(2*x);
   printf("x: %f   oldx: %f",x,oldx);   
}
                    
    system("Pause");
    return(0);
}
