class Main {
  public static void main(String[] args) {
   //Create a 2D array with [row][column] and automatically fill it with 0's

   int[][] abc = new int[3][4];
   abc[0][0]= 1;
   abc[2][3]=9;

   //loop through all the rows and columns
   for(int r= 0; r<abc.length;r++){
       for(int c= 0; c <abc[0].length;c++){
         System.out.print(abc[r][c]+"\t");
       }
      System.out.println();
   }

   System.out.println("====================");
  //Create and fill an array with an initializer list

  int[][] xyz = {
    {1,2,3,4,5},
    {6,7,8,9,10},
    {11,12,13,14,15}
  };

//loop through all the rows and columns
   for(int r= 0; r<xyz.length;r++){
       for(int c= 0; c <xyz[0].length;c++){
         System.out.print(xyz[r][c]+"\t");
       }
      System.out.println();
   }
  }
}