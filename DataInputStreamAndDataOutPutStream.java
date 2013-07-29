//A DataInputStream lets an application read primitive java data type from an underlying input stream in a machine independent way .
//A DataOutPutStream lets an application write primitive java data type from an underlying input stream in a machine independent way .

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class DataInputStreamAndDataOutPutStream{
    public static void main (String ar[]){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("d:\\readmyfile222.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeInt(100);
            dataOutputStream.writeDouble(5.7);
            dataOutputStream.close();
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream("d:\\readmyfile.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            System.out.println(dataInputStream.readInt()+" "+dataInputStream.readDouble());
            dataInputStream.close();
            fileInputStream.close();
        }
        catch (Exception e){

        }
    }
}