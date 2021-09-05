class BinarySearchRecursion 
{
    private long[] array;
    private int count;

    public BinarySearchRecursion(int max_value) 
    {
        array = new long[max_value];
        count = 0;
    }

    public void push(long value) 
    {
        array[count] = value;
        count++;
    }

    public int size() 
    {
        return count;
    }

    public int find(long searchKey, int start, int end) 
    {
        int middle;

        middle = (start + end) / 2;

        if (array[middle] == searchKey) {
            return middle;
        } else if (start > end) {
            return count;
        } else {
            if (array[middle] < searchKey) {
                return find(searchKey, middle + 1, end);
            } else {
                return find(searchKey, start, middle - 1);
            }
        }

    }

    public void show() 
    {
        for (int i = 0; i < count; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }

    public long[] remove(int index) 
    {

        int length = count - 1;
        long[] res = new long[length];
        for (int i = 0; i < index; i++) {
            res[i] = array[i];
        }
        for (int i = index; i < length; i++) {
            res[i] = array[i + 1];
        }

        return res;
    }

}

class Execution 
{
    public static void main(String[] args) 
    {
        int recursion_var;
        long[] new_array;
        BinarySearchRecursion exec = new BinarySearchRecursion(100);
        for (int i = 1; i < 101; i++) 
        {
            exec.push(i);
        }
        exec.show();
        recursion_var = exec.find(16, 1, 100);
        System.out.println(recursion_var);
        new_array = exec.remove(recursion_var);
        for(int i =0; i< new_array.length; i++)
        {
               System.out.print(new_array[i] + " ");
        }

    }
}