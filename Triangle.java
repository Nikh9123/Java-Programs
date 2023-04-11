
import java.util.*;

class InvalidTriangleError extends Exception {
  public InvalidTriangleError(String e) {
    super(e);
  }
}

public class Triangle {
  int a;
  int b;
  int c;

  Triangle(int a, int b, int c) throws InvalidTriangleError {
    this.a = a;
    this.b = b;
    this.c = c;
    if (c > a + b)
      throw new InvalidTriangleError("Error");
    else{
      throw new InvalidTriangleError("Not an Error");
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int d = s.nextInt();
    int g = s.nextInt();
    int f = s.nextInt();

    try {
      Triangle triangle1 = new Triangle(d, g, f);
    } catch (InvalidTriangleError e) {
      System.out.println(e);
    }
  }
}
