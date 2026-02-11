public class Gee21{
  public static void main(String[] args){

    int[][] ray = new int[7][7];

    //Populate the array with sequential numbers
    /*
      1  2  3  4  5  6  7
      8  9  10 11 12 13 14
      15 16 17 18 19 20 21
      22 23 24 25...
      */
  
      //Used as a holder to know what value to add
      int popularGuy = 1;

      //Traditional for in row major order 
      for(int row = 0; row < ray.length; row ++)
      {
        for(int col = 0; col < ray[row].length; col ++)
        {
          //popularGuy started at 1 so add him the the array first then increase his value
          ray[row][col] = popularGuy;
          popularGuy++;
        }
      }

    ArrayAverages twoDee = new ArrayAverages(ray);

    System.out.println(twoDee);
    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
