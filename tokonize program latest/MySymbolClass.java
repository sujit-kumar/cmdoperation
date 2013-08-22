import com.sun.deploy.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sujit
 * Date: 7/30/13
 * Time: 11:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class MySymbolClass  {
   static final String[] SYMBOL_LIST = {"+" ,"-" , "*" , "/" , "%" , "++" , "--" , "==" , "!=" , ">" , "<" , ">=" , "<=" , "&" , "|" , "^" , "~" , "<<" , ">>" , ">>>" , "&&" , "||" , "!" , "=", "+=" , "-=" , "*=" , "/=" , "%=" , "<<=" , ">>=" , "&=" , "^=" , "|=" , ")" ,"(" ,"{","}","[","]",";","."};
   static void findMySymbol(String parsedLine)throws IOException {
       parsedLine = parsedLine.trim();
       List<String> symbol = Arrays.asList(SYMBOL_LIST);
       byte buf[] = parsedLine.getBytes();
       ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf) ;
       PushbackInputStream pushbackInputStream = new PushbackInputStream(byteArrayInputStream) ;
       ArrayList<String> mySymbolList = new ArrayList<String>();
       int no;
       String s1;
       while ((no = pushbackInputStream.read())!=-1){
           s1 = Character.toString((char)no);
            for (String mySymbol : SYMBOL_LIST){
               if(s1.equals(mySymbol)){
                   mySymbolList.add(s1);
                   parsedLine = parsedLine.replace(s1,OnlyPrograMConstant.SPACE);
                   s1 = OnlyPrograMConstant.SPACE;
               }
            }
       }
       System.out.println();
       for (int i=0;i<mySymbolList.size();i++){
           System.out.println(mySymbolList.get(i)+" :- "+ " is a symbol");
       }
      ValidateEachLine.parsedLine(parsedLine);
       }

    }

