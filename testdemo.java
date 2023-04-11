class testdemo{
  int id ;
  String name ;
  int age ;
  testDemo(int id , String name)
  {
    id = id ;
    name = name ;
  }
  testDemo(int id , String name , int age)
  {
    age = age ;
    this(id ,name);
  }
  void detail(){
   System.out.println(name + ","+id+","+ age);

  }
  public static void main(String[] args) {
    testDemo(int id , String name , int age)
    {
      testDemo t = new testDemo(34, "Shruti",10);
      t.detail();
    }
  }
}