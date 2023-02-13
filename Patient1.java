import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Patient1 {
    String name ;
    int id ;
    Map< String , Integer>PDetails = new HashMap<String , Integer>();
    Patient1(String Pname , int Pid)
    {
        this.name = Pname;
        this.id = Pid;
        // PDetails.put("Vishal", 101);
        // PDetails.put("Suyash" , 102);
        // PDetails.put("Krish" , 103);
        // PDetails.put("Ashu" , 104);
        PDetails.put(Pname , Pid);

    }
    void display(){
        System.out.println(PDetails);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the name of pateint");
        Patient1.id =  s.nextInt();
        Patient1.name = s.nextLine();
        Patient1 details = new Patient1(name, id);
        details.display();
        s.close();
    }
}
