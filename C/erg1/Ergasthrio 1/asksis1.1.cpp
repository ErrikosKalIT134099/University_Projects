#include <stdio.h>
#include <stdlib.h>

//double f(int x){
   //    double res;
       
  //     res=1/(x*x+1);
       
   //    return res; 
    //   }

int main()
{
    float a=0,b=1;
    float x ;
    double h=0.1;
    double y;
    x=a;
    printf("Oi arithmoi pou edwses einai: %f %f %d \n",a,b,h);
    while(x<b){            
    y=1/(x*x+1);
    x=x+h;
    printf("To X einai: %lf kai To Y einai: %d \n",x,y);


}
    system("Pause");
  
}
