import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Perty on 10-Nov-18.
 */
public class task6 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    double a_side = Double.parseDouble(reader.readLine());
    double b_side = Double.parseDouble(reader.readLine());
    double c_side = Double.parseDouble(reader.readLine());
    System.out.println(Square(a_side,b_side,c_side));
    if (IsRectangular(a_side,b_side,c_side))
      System.out.println("Triagle is rectangular");
    else System.out.println("Triagle isn't rectangular");

  }

  private static double Square (double a, double b, double c){
    double p = 0;
    p = (a + b + c)/2;
    return Math.sqrt(p*(p - a) * (p - b) * (p - c));
  }

  private static boolean IsRectangular(double a, double b, double c){
    boolean rectang = true;
    double max =  MaxValue(a, b, c);
  if (max == a)
    rectang = (Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2));
  if (max == b)
    rectang = (Math.pow(b,2) == Math.pow(a,2) + Math.pow(c,2));
  if (max == c)
    rectang = (Math.pow(c,2) == Math.pow(b,2) + Math.pow(a,2));
    return rectang;
  }

  private static double MaxValue(double a, double b, double c){
    double max = Integer.MIN_VALUE;
      if (a > max)
        max = a;
        if (b > max)
          max = b;
           if (c > max)
            max = c;
    return max;
  }
}
