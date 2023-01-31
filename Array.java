import java.util.Scanner;
class Array {
     public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of subjects :" );
        int size = scanner.nextInt();
        int a[] ;
        a = new int[size] ;
        System.out.println("enter the marks of each subjects :" );
        for(int i = 0 ; i < size ; i++){
            int num2 = scanner.nextInt();
            a[i] = num2;
        }
        int avg = 0;
        for(int j = 0 ; j < size ; j++){
            avg = avg+ a[j];
        }
        int ans = (avg/size) * 100;
        System.out.println("your avg marks is :"+ ans );

        scanner.close();

    } 
}
