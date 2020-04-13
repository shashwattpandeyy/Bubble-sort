public class arrayBUb {
    private long[] a;           // create the reference array
    private int nElem;             // create the size of array
    
    public arrayBUb(int size) {
        a = new long[size];                 // create the size of array
        nElem = 0;
    }
     public void insert(long value){        // Add insert method to insert value in the array.
                a[nElem] = value;
                nElem++;
        }
      
      public void display() {

          for (int i = 0; i < nElem; i++)
              System.out.print(a[i] + " ");         //display the array
          System.out.println(" ");
      }
      public void bubbleSort(){
              for (int j = 0; j < nElem-1 ; j++)            // Add inner and outer loop
                  for (int k = 0; k < nElem - j - 1; k++)
                      if(a[k] > a[k+1]){
                          int temp = (int) a[k];        // swap the numbers which is biggest.
                          a[k] = a[k+1];
                          a[k+1] = temp;
                        }



      }



    }
