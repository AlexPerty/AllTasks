import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

/**
 * Created by Perty on 09-Nov-18.
 */
public class Task3_4 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int intArray[] = new int[3];
    for (int i = 0; i < 3; i++){
      intArray[i] = Integer.parseInt(reader.readLine());
    }
    System.out.println("MIN from three numbers - " + MinValue(intArray));
    System.out.println("MAX from three numbers - " + MaxValue(intArray));
  }
  private static int MinValue (int[] array){
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < 3; i++){
      if (array[i] < min){
        min = array[i];
      }
    }
    return min;
  }

  private static int MaxValue(int[] array){
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < 3; i++){
      if (array[i] > max){
        max = array[i];
      }
    }
    return max;
  }
}
