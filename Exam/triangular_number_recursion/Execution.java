class TriangularNumberRecursion
{

     public int getNumber(int number)
     {

          if(number == 1)
          {
               return 1;

          }else{
         
              return( number + getNumber(number - 1) );
          }

      }
}

class Execution
{

    public static void main(String[] args)
    {
        int variable;
        TriangularNumberRecursion exec = new TriangularNumberRecursion();
        variable = exec.getNumber(4);
        System.out.println(variable);
    }
}       