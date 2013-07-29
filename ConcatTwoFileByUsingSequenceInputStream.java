//A SequenceInputStream represents the logical concatenation of other input stream.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: sujit
 * Date: 7/26/13
 * Time: 11:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcatTwoFileByUsingSequenceInputStream {
    public static void main(String ar[]){
        FileInputStream  fileInputStream  = null;
        FileInputStream fileInputStream1Second = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("d:\\readmyfile.txt");
            fileInputStream1Second = new FileInputStream("d:\\mysecondfile.txt");
            fileOutputStream = new FileOutputStream("d:\\writemyfile.txt");
            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream,fileInputStream1Second);

            int readLine ;
            while(( readLine=sequenceInputStream.read())!=-1){
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
