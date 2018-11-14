import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Perty on 12-Nov-18.
 */
public class Task7 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int sides[] = new int[3];
    for (int i = 0; i < 3; i++) {
      sides[i] = Integer.parseInt(reader.readLine());
    }
    int maxSideIndex = maxValuePositionInArray(sides);
    kindOfTriangle(sides, maxSideIndex);
    typeOfAngle(sides, maxSideIndex);
  }

  private static void typeOfAngle(int[] sidesArray, int maxSideIndex) {
    if (isPossibleToBuild(sidesArray, maxSideIndex)) {
      if (sidesArray[maxSideIndex] == sidesArray[0]) {
        if (Math.pow(sidesArray[0], 2) < Math.pow(sidesArray[1], 2) + Math.pow(sidesArray[2], 2)) {
          System.out.println("Triangle has acute angle.");
        } else {
          System.out.println("Triangle is obtuse.");
        }
      }

      if (sidesArray[maxSideIndex] == sidesArray[1]) {
        if (Math.pow(sidesArray[1], 2) < Math.pow(sidesArray[0], 2) + Math.pow(sidesArray[2], 2)) {
          System.out.println("Triangle has acute angle.");
        } else {
          System.out.println("Triangle is obtuse.");
        }
      }
      if (sidesArray[maxSideIndex] == sidesArray[2]) {
        if (Math.pow(sidesArray[2], 2) < Math.pow(sidesArray[1], 2) + Math.pow(sidesArray[0], 2)) {
          System.out.println("Triangle has acute angle.");
        } else {
          System.out.println("Triangle is obtuse.");
        }
      }
    }
  }

  private static void kindOfTriangle(int[] sidesArray, int maxSideIndex) {
    if (isPossibleToBuild(sidesArray, maxSideIndex)) {
      System.out.println("It's possible to build triangle.");
      if (sidesArray[0] != sidesArray[1] && sidesArray[0] != sidesArray[2] && sidesArray[1] != sidesArray[2]) {
        System.out.println("All sides are differ.");
      } else {
        if (sidesArray[0] == sidesArray[1] && sidesArray[1] == sidesArray[2]) {
          System.out.println("Triangle is equilateral.");
        } else {
          System.out.println("Two sides has the same length.");
        }
      }
    } else {
      System.out.println("It's not possible to build triangle.");
    }
  }

  private static boolean isPossibleToBuild(int[] sidesArray, int maxSideIndex) {
    int sideSummary = 0;
    boolean isPossibleToBuild = true;
    for (int i = 0; i < 3; i++) {
      if (maxSideIndex != i) {
        sideSummary = sidesArray[i] + sideSummary;
      }
    }
    if (sideSummary - sidesArray[maxSideIndex] <= 0) {
      isPossibleToBuild = false;
    }
    return isPossibleToBuild;
  }

  private static int maxValuePositionInArray(int[] sidesArray) {
    int max = Integer.MIN_VALUE, maxPositionInArray = 0;
    for (int i = 0; i < 3; i++) {
      if (sidesArray[i] > max) {
        max = sidesArray[i];
        maxPositionInArray = i;
      }
    }
    return maxPositionInArray;
  }
}
