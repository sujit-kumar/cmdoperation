import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class UsingFileReaderAndFileWriter{
    public static void main(String ar[])throws IOException {

        FileReader fileReader = new FileReader("d:\\myreadfile.txt");
        FileWriter fileWriter = new FileWriter("d:\\mywritefile.txt");
        int no;
        while ((no=fileReader.read())!=-1){
            fileWriter.write(no);
        }
        fileReader.close();
        fileWriter.close();

    }
}