

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class UsePrintStream
{
    public static void main (String ar[])throws IOException {

            FileOutputStream fileOutputStream = new FileOutputStream("d:\\mytextfile.txt");
            PrintStream  printStream = new PrintStream(fileOutputStream);
            printStream.println("Hello World ");
            printStream.close();
            fileOutputStream.close();
    }
}