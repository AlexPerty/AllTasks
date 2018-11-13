import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Perty on 12-Nov-18.
 */
public class Task7 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int intArray[] = new int[3];
    for (int i = 0; i < 3; i++) {
      intArray[i] = Integer.parseInt(reader.readLine());
    }
    int maxSide = maxValuePositionInArray(intArray);
    kindOfTriangle(intArray, maxSide);

  }

  private static void kindOfTriangle(int[] intArray, int maxSide) {
    if (isPossibleToBuild(intArray, maxSide)) {
      System.out.println("It's possible to build triangle.");
      if (intArray[0] != intArray[1] && intArray[0] != intArray[2] && intArray[1] != intArray[2]) {
        System.out.println("All sides are differ.");
      } else {
        if (intArray[0] == intArray[1] && intArray[1] == intArray[2]) {
          System.out.println("Triangle is equilateral.");
        } else {
          System.out.println("Two sides has the same length.");
        }
      }
    } else {
      System.out.println("It's not possible to build triangle.");
    }
  }

  private static boolean isPossibleToBuild(int[] array, int maxSide) {
    int sideSummary = 0;
    boolean isPossibleToBuild = true;
    for (int i = 0; i < 3; i++) {
      if (maxSide == i) {
      } else {
        sideSummary = array[i] + sideSummary;
      }
    }
    if (sideSummary - array[maxSide] <= 0) {
      isPossibleToBuild = false;
    }
    return isPossibleToBuild;
  }

  private static int maxValuePositionInArray(int[] array) {
    int max = Integer.MIN_VALUE, maxPositionInArray = 0;
    for (int i = 0; i < 3; i++) {
      if (array[i] > max) {
        max = array[i];
        maxPositionInArray = i;
      }
    }
    return maxPositionInArray;
  }
}
