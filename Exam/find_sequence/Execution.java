class Sequence
{
    private  int[] array;

    private int count;

    public Sequence(int max_value)
    {
        array = new int[max_value];
        count = 0;
    }

    public void push(int value)
    {
        array[count] = value;
        count++;
    }

    public void show()
    {
        for (int i =0; i<count;i++)
        {
            System.out.print(array[i]+ " ");
        }
    }


    public void noDuple()
    {  
        int current = array[0];
        boolean found = false;

        for (int i = 0; i < count; i++) 
        {
            if (current == array[i] && !found) 
            {
                    found = true;
            } else if (current != array[i]) 
              {
                   System.out.print(" " + current);
                   current = array[i];
                   found = false;
              }
        }
           System.out.print(" " + current);     
     }

        public void sorting()
        {
            int i, j,temp;
            
 
            for(i=1; i<count; i++) 
            {
                 temp = array[i]; 
                 j = i;
 
                 while(j>0 && array[j-1] >= temp) 
                 {
                    array[j] = array[j-1]; 
                    --j; 
                 }
                    array[j] = temp; 
            }
         }

}

class Execution
{
   
    public static void main(String[] args)
    {
        Sequence exec = new Sequence(15);
        exec.push(3);
        exec.push(2);
        exec.push(3);
        exec.push(4);
        exec.push(2);
        exec.push(2);
        exec.push(4);
        exec.show();
        exec.sorting();
        System.out.println(" ");
        exec.noDuple();
    }

}