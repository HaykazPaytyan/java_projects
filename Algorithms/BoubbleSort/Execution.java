class BoubbleSort
{
    private  long[] array;

    private int count;

    public BoubbleSort(int max_value)
    {
        array = new long[max_value];
        count = 0;
    }

    public void push(long value)
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

    public void sorting()
    {
        int i,j;

        long temp;

        for (i = count - 1; i > 1; i--)
        {
            for (j = 0; j < count; j++)
            {
                if( array[j] > array[j+1] )
                {
                    swap(j,j+1);
                }
            }
        }
    }

    private void swap(int one, int two)
    {
          long temp = array[one];
          array[one] = array[two];
          array[two] = temp;
    }


}


class Execution
{
    public  static void main(String[] args)
    {
           BoubbleSort exec = new BoubbleSort(15);

           exec.push(23);

           exec.push(12);

           exec.push(43);

           exec.push(876);

           exec.push(432);

           exec.push(212);

           exec.push(456);

           exec.push(891);

           exec.push(786);

           exec.push(11234);

           exec.show();

           exec.sorting();

           System.out.println(" ");

           exec.show();
    }
}