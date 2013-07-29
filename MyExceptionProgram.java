/**
 * Created with IntelliJ IDEA.
 * User: sujit
 * Date: 7/28/13
 * Time: 12:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyExceptionProgram {
    void vaalidate(int no){
        try{
        if(no > 100)
            throw new CoustomException();
        }
        catch (CoustomException e){
            System.out.print("number should be less than 100");
        }

    }
    public static void main(String ar[]){
        MyExceptionProgram myExceptionProgram = new MyExceptionProgram();
        myExceptionProgram.vaalidate(145);
    }
}
