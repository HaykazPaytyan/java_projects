class Factorial
{

     public static int fact(int n)
     {
       
            if (n == 0)
            {    
                  return 1; 
            }   
             else{
                    return(n * fact(n-1));
                 }
      }

}

class Execution
{
      public static void main(String[] args)
      {
           
         for(int i =0 ; i<7; i++)
         { 
              System.out.print(Factorial.fact(i) + " ");
         }

       }
}  