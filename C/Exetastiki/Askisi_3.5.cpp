#include <stdio.h>
#include <stdlib.h>

float horner2(int n,float p[],float q[],float ksi){
       q[0]=p[0];
      //ypologizoume tis times toy pilikou  Q(x) ston pinaka q
    //simfona me to horner
    for(int i=1;i<n;i++){
            q[i]=p[i]+q[i-1]*ksi;
            }
    //epistrofi apotelesmatos          
    for(int i=1;i<n-1;i++){
             return q[i];
            }
     
      }
      
int main()
{
    
  int n=0;  
  float p[n];
  float q[n];
  float r[n];
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
    
    //emfanisi upoloipou diaireseis
    horner2(n,p,q,ksi);
    printf("\nTo ypolipo einai  q[%d]: %f \n",n-1,q[n-1]);
    
    //emfanisi suntelestwn
     for(int i=0;i<n-1;i++){
          printf("Oi timi toy sunteleste q[%i]=%f\n",i,q[i]);  
        }
        
     //emfanisi thn timi upoloipou gia n-1
     horner2(n-1,q,r,ksi);
     
     //emfanisi syntelestwn neou pilikou
      for(int i=0;i<n-1;i++){
          printf("Oi timi toy sunteleste r[%i]=%f\n",i,r[i]);  
        }
    
    system("Pause");
    return(0);
}
