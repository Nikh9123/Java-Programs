class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      outer:
      for(int i=0; i < 5;i++){
        System.out.println("outer: " + i );
        inner:
        for(int j = 0 ; j < 3 ; j++)
          {
            System.out.println("inner: " + j );
            if(i == j+1){
            System.out.println(" i == j+1 " + i +" "+j );
              break outer ;
            }
            System.out.println("bye");
          }
      }
    }
  }