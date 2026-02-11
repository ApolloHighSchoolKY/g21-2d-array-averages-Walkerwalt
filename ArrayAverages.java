import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    //Double since division happens (running total)
    double avg = 0;

    //Traditional for in row major to accumulate the sum
    for(int row = 0; row < ray.length; row ++)
      {
        for(int col = 0; col < ray[row].length; col ++)
        {
          avg += ray[row][col];
        }
        
    //Divide by the length of columns
      avg /= ray[0].length;
      
    //Print the average
      System.out.println("Row " + row + " average: " + avg);

    //Reset the variable
      avg = 0;
      }

  }

  public void columnAverages(){
    //Column major order
    //   Take each column and go through all of the rows
    //   Top down and Left to Right

    //Double since division happens (running total)
    double avg = 0;

    //Traditional for in row major to accumulate the sum
    for(int col = 0; col < ray[0].length; col ++)
      {
        for(int row = 0; row < ray.length; row ++)
        {
          avg += ray[row][col];
        }
        
    //Divide by the length
      avg /= ray.length;
      
      System.out.println("Column " + col + " average: " + avg);

      avg = 0;
      }
  }

  public void arrayAverage(){
    double avg = 0;
    for(int row = 0; row < ray.length; row ++)
      {
        for(int col = 0; col < ray[row].length; col ++)
        {
          avg += ray[row][col];
        }
      }
      avg /= ray.length * ray[0].length;

      System.out.println("Array average: " + avg);
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
