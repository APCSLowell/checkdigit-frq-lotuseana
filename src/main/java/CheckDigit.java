public class CheckDigit 
{   
  
   public static int getCheck(int num) 
   {  
     int numDig = getNumberOfDigits(num);
     int sum=0;
     for (int i =0; i<=numDig; i++){
       sum+= getDigit(num,i)*(7-i);
     }
     return sum%10;
   }
 
     
   public static boolean isValid(int numWithCheckDigit)    
   {      
     if (getCheck(numWithCheckDigit/10)==numWithCheckDigit%10){
       return true;
     }    
     return false;
   }    
      
   public static int getNumberOfDigits(int num)    
   {      
    if(num < 10)
      return 1;
    return 1 + getNumberOfDigits(num/10);    
   }    
   
     
    public static int getDigit(int num, int n)    
    {      
      int pos = getNumberOfDigits(num)-n+1;
      while(pos > 1){
        num/=10;
        pos--;
      }
      return num%10;
    }     

}
