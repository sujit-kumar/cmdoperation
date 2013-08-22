import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: sujit
 * Date: 7/29/13
 * Time: 9:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class ValidateEachLine {
   static String[] keyWordStringArray = {"abstract","assert","boolean","break","byte","case","catch","char","class","const","continue","default","do","double","else","enum","extends","final","finally","float","for","goto","if","implements","import","instanceof","int","interface","long","native","new,package","private","protected","public","return","short","static","strictfp","super","switch","synchronized","this","throw","throws","transient","try","void","volatile","while","String","package"};
    public static final String MY_DIGIT_PATTERN = "[\\d]+" ;
   static void parsedLine(String parsedLine)throws IOException {
       List<String> keyWord = Arrays.asList(keyWordStringArray);
       byte buf[] = parsedLine.getBytes();
       ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf) ;
       PushbackInputStream pushbackInputStream = new PushbackInputStream(byteArrayInputStream) ;
       int no;
       String s1 = OnlyPrograMConstant.SPACE;
       System.out.println();
       while ((no = pushbackInputStream.read())!=-1){
           s1 = s1+Character.toString((char)no);
           s1= s1.trim();
           if(keyWord.contains(s1)){
               System.out.println(s1+ " :- is a keyword");
               parsedLine = parsedLine.replaceAll(s1,OnlyPrograMConstant.SPACE);
               parsedLine = parsedLine.trim();
               s1 = OnlyPrograMConstant.SPACE;

           }
       }
         CheckItContainDigit(parsedLine);
       //MySymbolClass.findMySymbol(parsedLine.trim());

    }
    static void CheckItContainDigit (String parsedLINE){
        Pattern pattern = Pattern.compile(MY_DIGIT_PATTERN);
        Matcher matcher = pattern.matcher(parsedLINE);
        while (matcher.find()){
            System.out.println(matcher.group()+" "+" is a digit");
        }

    }
}
