//Read a file from a directory and write it in to another file 

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: sujit
 * Date: 7/26/13
 * Time: 11:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReadFileFromDirectory {
    public static void main(String ar[]){
        FileInputStream  fileInputStream  = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("d:\\readmyfile.txt");
            fileOutputStream = new FileOutputStream("d:\\writemyfile.txt");

            int readLine ;
            while(( readLine=fileInputStream.read())!=-1){
              fileOutputStream.write(readLine);
            }
            fileInputStream.close();
           fileOutputStream.close();
        }

        catch (Exception e){
            System.out.print(e);
        }
    }
}
