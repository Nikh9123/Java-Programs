import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class FileManipulation {
  public static void main(String[] args) throws IOException, FileNotFoundException{
    File ob1 = new File("abc.txt");
    File ob2 = new File("xyz.txt");
    FileInputStream fin = new FileInputStream(ob1);
    FileOutputStream fout = new FileOutputStream(ob2);
    int i = 0;
    do {
      i = fin.read();
      if (i != -1) {
        fout.write(i);
      }
    } while (i != -1);
  }
}
