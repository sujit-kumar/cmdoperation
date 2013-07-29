import java.io.*;

class UsingBufferReaderAndBufferWriter {
    public static void main(String ar[])throws IOException {

        FileReader fileReader = new FileReader("d:\\ranpurCollage.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("d:\\mywritefile.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String no;
        while ((no=bufferedReader.readLine())!=null){
            bufferedWriter.write(no);
        }

        bufferedReader.close();
        fileReader.close();
        bufferedWriter.close();
        fileWriter.close();

    }
}