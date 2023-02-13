// import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

// import java.io.*;
class Patient{
    String Pname ;
    int Page ;
    long PCno ;
    

    Patient(String Name , int age , int Cno){
        this.Pname = Name ;
        this.Page = age ;
        this.PCno = Cno;
    }
    void Display(){
        System.out.println("pateint name : " + Pname + "\n age : " + Page + " \n con. no :" + PCno);

    }
    public static void main(String[] rk ) {
       Patient details = new  Patient("Raj" , 30 , 12100798);
       details.Display();
    }
}