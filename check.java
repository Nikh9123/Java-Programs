import java.util.Scanner;
class check {
    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int x =  s.nextInt();
        if(x%2 == 0)
        {
            System.out.println(x + " is even");
        }
        else 
        {
            System.out.println(x + " 2");
        }
        s.close();
    }
}
