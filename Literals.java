class Literals {
public static void main(String[] args) {
    //for integral letarls type of literals :
//    int x = 10 ; //10 is decimal literal
//    int y = 010 ; //octal literals always starts with prefix 0
//    int z = 0x10;  //prefix with 0x ; base  16 (1 to 9 and a to f )
  
// int x=0777; //(valid) 
//  int y=0786; //C.E:integer number too large: 0786(invalid) 
//  int t=0xFACE;// (valid) 
//  int d=0xbeef;// (valid) 
// // int e= 0xBeer; //C.E:';' expected(invalid) //:int x=0xBeer; ^// ^ 
// int f=0xabb2cd;//(valid
//    System.out.println(x +" "+f + " "+t) ;
int x = 10 ;
long l = 10l;
// int x = 10l; //C.E. data is long type assigned to int 

// byte b = 10 ;
// byte b = 127;
// byte b = 128 ;  error: found int requires byte 

//short type 
short s = 32767 ;
// short s = 32728;error found int requires short 

System.out.println(x +" "+ l+" "+s);
} 

}
