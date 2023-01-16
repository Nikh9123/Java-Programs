public class   VaribleDemo {
    int x ;  //Instance 
    static int y ; //class vatriable
    public static void main(String args[])
    {
        int z ; //locla variable 
        z = 10 ;
        VaribleDemo ob1 = new VaribleDemo();
        VaribleDemo ob2 = new VaribleDemo();
        ob1.x = 5 ;
        ob2.y = 7 ;
        System.out.print(ob2.x);
        System.out.print(ob2.y);
        System.out.print(z);
    }

}

