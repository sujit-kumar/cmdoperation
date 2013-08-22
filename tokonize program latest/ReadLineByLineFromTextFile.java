import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: sujit
 * Date: 7/29/13
 * Time: 9:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReadLineByLineFromTextFile {
   static ArrayList<String> containAllLines = new ArrayList<String>();
   static final String MY_WORD_CONTAIN_SYSTEM = "^System";
   static final String MY_LINE_CONTAIN_COMMENT_LINE = "^[//]";
   static int i = 1;
   static ArrayList storeAlltheLine(){
        try
        {
            String readLine = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("d:\\dd.txt"));
            while ((readLine = bufferedReader.readLine()) != null){
            readLine = readLine.trim();
            containAllLines.add(readLine);
            }
            bufferedReader.close();
        }
        catch (Exception e){

        }
        return containAllLines;
    }


    public static void main(String ar[])throws IOException {
        Pattern pattern = Pattern.compile(MY_WORD_CONTAIN_SYSTEM);
        Pattern pattern1 = Pattern.compile(MY_LINE_CONTAIN_COMMENT_LINE);

     ArrayList<String> myTextFileLine1 =  storeAlltheLine();
     for (String myTextFileLine : myTextFileLine1){
         Matcher matcher =  pattern.matcher(myTextFileLine.trim());
         Matcher matcher1 = pattern1.matcher(myTextFileLine.trim());
         if(matcher.find() || myTextFileLine.isEmpty() || matcher1.find() )   {
         System.out.println("Line No :-"+i+myTextFileLine +" is either blank line or comment line or sys out line ");
         i++;
         }
         else  {
         System.out.println("Line No :- " + i +"  "+ myTextFileLine);
         MySymbolClass.findMySymbol(myTextFileLine);
         i++;
         }
       }
    }

}
