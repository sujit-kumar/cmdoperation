import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sujit
 * Date: 7/22/13
 * Time: 3:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class KeywordJavaProgram {
  static List key;
  static String[] keyWordStringArray = {"abstract","assert","boolean","break","byte","case","catch","char","class","const","continue","default","do","double","else","enum","extends","final","finally","float","for","goto","if","implements","import","instanceof","int","interface","long","native","new,package","private","protected","public","return","short","static","strictfp","super","switch","synchronized","this","throw","throws","transient","try","void","volatile","while"};

    public static void main(String ar[]){
    List<String> keyWord = Arrays.asList(keyWordStringArray);
    Set<String> myKeyword = new HashSet<String>();
        try {
            String sReadLine = null;
            BufferedReader br=new BufferedReader(new FileReader("d:\\MyFirstProgram.txt"));
            while ((sReadLine=br.readLine())!=null) {
            String[] tokonizePart =  sReadLine.split("\\s");
                for (String tokonizePartInsideFor : tokonizePart ){
                    if(keyWord.contains(tokonizePartInsideFor)){
                       myKeyword.add(tokonizePartInsideFor);
                    }
                }

            }
            for(String my : myKeyword){
                System.out.println(my +" is a key word");
            }
            br.close();
        }
        catch (Exception e){

        }

    }




}
