#include <stdio.h>
#include <stdlib.h>


int main(){
    
 float a,b,h;
 
 double y;
 
 printf("Dwse timi gia to a: ");
 scanf("%f",&a);
 printf("Dwse timi gia to b: ");
 scanf("%f",&b);
 printf("Dwse timi gia to h: ");
 scanf("%f",&h);
 
printf("Plhktrologises tis times: a=%f b=%f h=%f \n",a,b,h);
float x=a; 
do{
           
     y=(1/((x*x)+1));
    printf("To X einai: %f       To Y einai: %f \n",x,y);
   
     x=x+h;         
     }while(x<b);
 
  system("Pause");
 return(0);   
}
