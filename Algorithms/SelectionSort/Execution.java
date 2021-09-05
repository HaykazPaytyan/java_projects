class SelectionSort
{
      private long[] array; 
      private int count; 

      public SelectionSort(int max_value) 
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
             for(int i=0; i<count; i++)
             { 
                     System.out.print(array[i] + " ");
             }
      }

      public void sorting()
      {
          int i, j;
          long temp;
          for(i=0; i < count-1; i++) 
          {
               int min = i;
               for(j=i+1; j<count; j++)
               { 
                    if(array[j] < array[min] )
                    { 
                          min = j; 
                          swap(i,min);
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
               public static void main(String[] args)
               {
                    SelectionSort exec = new SelectionSort(50);
                    exec.push(77); 
                    exec.push(99);
                    exec.push(44);
                    exec.push(55);
                    exec.push(22);
                    exec.push(88);
                    exec.push(11);
                    exec.push(00);
                    exec.push(66);
                    exec.push(33);
                    exec.show(); 
                    exec.sorting(); 
                    System.out.println(" ");
                    exec.show();
                              
               }
} 