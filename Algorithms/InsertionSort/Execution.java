class InsertionSort
 {
     private long[] array; 

     private int count;

     public InsertionSort(int max_value) 
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
                
                 InsertionSort insert = new InsertionSort(50); 
                 insert.push(77); 
                 insert.push(99);
                 insert.push(44);
                 insert.push(55);
                 insert.push(22);
                 insert.push(88);
                 insert.push(11);
                 insert.push(00);
                 insert.push(66);
                 insert.push(33);
                 insert.show(); 
                 insert.sorting(); 
                 System.out.println(" ");
                 insert.show(); 
             }
}
