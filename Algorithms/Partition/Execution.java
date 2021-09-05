class Partition
 {
      private long[] array; 
      private int count; 
  
      public Partition(int max_value) 
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

      public void show() 
      {
            
            for(int i=0; i<count; i++)
            {
                    System.out.print(array[i] + " "); 
                    System.out.println("");
            }
      }
 


      public int partitionIt(long pivot)
      {
           int left = 0; 
           int right = count - 1;
 
           while(true)
           {
                   while(left < pivot)
                   {
                         ++left;
                   } 
 
                   while(right > pivot)
                   {
                         --right;
                   }
 
                   if(left >= right)
                   {
                             break;
                   }else
                       { 
                              swap(left, right); 
                       }
           }
                 return left; 
      }

      public void swap(int dex1, int dex2) 
      {
             long temp;
             temp = array[dex1];
             array[dex1] = array[dex2]; 
             array[dex2] = temp; 
      }

 }

class Execution
 {
      public static void main(String[] args)
      {
               Partition exec = new Partition(20);
   
               exec.push(102);
               exec.push(21);
               exec.push(99);
               exec.push(34);
               exec.push(67);
               exec.push(81);
               exec.push(12);
               exec.push(93);
                
               exec.show(); 
               long pivot = 99; 
               System.out.print("Pivot is " + pivot);
               int size = exec.size();
               int partDex = exec.partitionIt(pivot);
               System.out.println(", Partition is at index " + partDex);
               exec.show(); 
      }
 }