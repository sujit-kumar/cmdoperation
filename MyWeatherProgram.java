import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyWeatherProgram {

    public static void reader()throws Exception{
        String regexPattern = "^[\\s]*[\\d]{1,2}[\\s]+[\\d]{1,2}[\\s]+[\\d]{1,2}";
        BufferedReader br ;
        int diff;
        String sCurrentLine;
        int[][] mapTable = new int[30][2];
        br = new BufferedReader(new FileReader("D://weather (1).dat"));
        int count =0;
        while ((sCurrentLine = br.readLine()) != null) {
            sCurrentLine=sCurrentLine.replace("*", " ");
            Pattern pattern=Pattern.compile(regexPattern);
            Matcher matcher=pattern.matcher(sCurrentLine);
            if (matcher.find()){
                String line= matcher.group();
                String[] data=(line.trim()).split("\\s+");
                int day = 0;
                day = Integer.parseInt(data[0]);
                int temp1 = Integer.parseInt(data[1]);
                int temp2 = Integer.parseInt(data[2]);
                diff = (temp1 > temp2  ? temp1 - temp2:temp2 - temp1);
                mapTable[count][0] = day;
                mapTable[count][1] = diff;
                count++;
            }
        }
        sortTable(mapTable,count);
    }
    public static void main(String[] arg)throws Exception{
        reader();
    }
    public static void sortTable(int [][] mapTable,int count){
        int temp = 0;
        for (int j = 0;j < count;j++){
            for (int k = 0;k<count-j-1;k++){
                int temp1 = mapTable[k][1];
                int temp2 = mapTable[k+1][1];
                if (temp1 > temp2){
                    temp = temp1;
                    mapTable[k][1] = temp2;
                    mapTable[k+1][1] = temp;
                    temp =  mapTable[k][0];
                    mapTable[k][0] = mapTable[k+1][0];
                    mapTable[k+1][0] = temp;
                }
            }
        }
        System.out.println("Highest temp difference is :"+mapTable[count-1][1]+" on "+mapTable[count-1][0]+" day");
        System.out.println("lowest temp difference is :"+mapTable[0][1]+" on "+mapTable[0][0]+" day");
    }
}