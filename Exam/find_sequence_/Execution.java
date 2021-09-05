class Sequence
{
    private long[] array;
    private int count;

    public Sequence(int max_value)
    {
        array = new long[max_value];
        count++;
    }

    public void push(long value)
    {
       array[count] = value;
       count++;
    }

    public void getSum()
    {
         int i; 

         for(i = 0; i<count; i++)
         { 
              if(array[i] < 0)
              {
                 
                 System.out.println(array[i] + " ");
              }   
         }

    }

}

class Execution
{

          public static void main(String[] args)
         {
               
             Sequence exec = new Sequence(15);
             exec.push(2);
             exec.push(3);
             exec.push(-6);
             exec.push(-1);
             exec.push(-9);
             exec.push(-1);
             exec.push(6);
             exec.push(4);
             exec.push(-8);
             exec.push(8);

            exec.getSum();
      
         }
} 