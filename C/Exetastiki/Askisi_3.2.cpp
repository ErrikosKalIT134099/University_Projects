#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
  int n=0;  
  float p[n];
  float q[n];
  float ksi;    
    
    //eisagwgh toy vathmou toy poluonimou
    printf("Dwse ton vathmo tou poluonimoy: ");
    scanf("%i",&n);
    
    //eisagwgi dedomenwn sto p[i]
    for (int i=0;i<n;i++){
        printf("Dwse timi gia to p[%i]: ",i);
        scanf("%f",&p[i]);
        
        }
    
    //emfanisi dedomenwn tou p[i]
     for (int i=0;i<n;i++){
         printf("Ta dedomena gia to P[%i]=%f\n",i,p[i]);
        
        }
        
    //timi gia thn metavliti ksi
    printf("Dwse tin timi toy ksi: ");
    scanf("%f",&ksi);
    
    //emfanisi tis timis toy ksi
    printf("KSI:%f\n",ksi);
    
    //ypologizoume tis times toy pilikou  Q(x) ston pinaka q
    //simfona me to horner
    
    q[0]=p[0];
    for(int i=1;i<n;i++){
            q[i]=p[i]+q[i-1]*ksi;
          }
          
    //emfanisi apotelesematwn
    for(int i=0;i<n-1;i++){
          printf("oi timi toy sunteleste q[%i]=%f\n",i,q[i]);  
            }
    //emfanisei upoloipou        
    printf("\n to ypolipo einai  q[%d]: %f \n",n-1,q[n-1]);
    
    system("Pause");
    return(0);
}
