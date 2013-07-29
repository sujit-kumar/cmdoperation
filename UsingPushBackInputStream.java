/*:-PushbackInputStream is used on an input stream to allow a byte to be read and then returned to the stream .
:-It is helpful for parser designing .*/

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

class UsingPushBackInputStream{
    public static void main(String ar[])throws IOException {
        String s = "if(a == 4)a = 0";
        byte buf[] = s.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf);
        PushbackInputStream pushbackInputStream = new PushbackInputStream(byteArrayInputStream);
        int no;
        while ((no = pushbackInputStream.read())!= -1){
            switch (no){
                case'=':
                    if ((no = pushbackInputStream.read())== '='){
                       // System.out.print(no);
                    System.out.print("comparison");
                    }
                    else
                    {
                        System.out.print("assignment");
                        pushbackInputStream.unread(no);
                    }
                    break;
                    default:
                        System.out.print((char)no);
            }
        }

    }
}