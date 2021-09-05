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


    public void doubleDuple()
    {  
         
        int max_count = 1, res = array[0];
        int curr_count = 1;
         
        for (int i = 1; i < count; i++)
        {
            if (array[i] == array[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = array[i - 1];
                }
                curr_count = 1;
            }
        }
     
        
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = array[count - 1];
        }
     
        System.out.print(res);  
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
        exec.push(2);
        exec.push(5);
        exec.push(2);
        exec.push(6);
        exec.push(8);
        exec.show();
        exec.sorting();
        System.out.println(" ");
        exec.doubleDuple();
    }

}