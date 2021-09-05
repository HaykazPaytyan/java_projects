class TriangleNumber
{

   public int getNumber(int number)
   {
      int total = 0;
      
      while(number > 0)
      {
            total = total + number;
            --number;
      }

      return total;

   }

}

class Execution
{    
      public static void main(String[] args)
      {
           int variable;
           TriangleNumber exec = new TriangleNumber();
           variable = exec.getNumber(4); 
           System.out.println(variable);
      }
}