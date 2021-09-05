class BinarySearchLinear
 {
        private long[] array; 
        private int count;

        public BinarySearchLinear(int max_value) 
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
 
        public int find(long searchKey)
        {
               int start = 0;
               int end = count-1;
               int middle;
         
                  while(true)
                  {
                          middle = (start + end) / 2;
                                  if(array[middle] == searchKey)
                                  {
                                         return middle; 
                                  }
                                    else if(start > end)
                                    {
                                             return count; 
                                    }
                                     else 
                                     {
                                             if(array[middle] < searchKey)
                                             {
                                                 start = middle + 1; 
                                             }
                                               else
                                              {
                                                     end = middle - 1; 
                                              }
                                      }
                   }
         }
 
         public void show() 
         {
              for(int i=0; i<count; i++)
              System.out.print(array[i] + " "); 
              System.out.println("");
         }
 
 }

class Execution
{
              public static void main(String[] args)
              {
                    BinarySearchLinear exec = new BinarySearchLinear(100);
                    for(int i =1; i<101; i++)
                    {
                           exec.push(i);
                    }
                    exec.show();
                    System.out.print(exec.find(16));
              }
}
