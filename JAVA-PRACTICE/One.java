class Main {
   public static void printArray(int[] array){
       for(int i : array)
           System.out.println(i);
   }
   public static void main(String args[]) {
       int[] array = new int[10];
       printArray(array);
   }
}

//Main and PrintArray is the method that will be available in the stack area and as well as the variables declared that will also be in the stack area. 

//And the Object (Integer Array of size 10) we have created, will be available in the Heap area because that space will be allocated to the program during runtime. 