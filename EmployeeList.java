//program by using Serialization
import java.io.FileInputStream;
import java.io.*;
import java.util.Scanner;
import java.io.ObjectInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: sujit
 * Date: 7/28/13
 * Time: 10:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeList implements Serializable {
    String name ;
    int id ;
    int salary ;
     EmployeeList(String name,int id,int salary){
      this.name = name;
      this.id  = id;
      this.salary = salary;
    }
    void display(){
        System.out.print(name+" "+id+" "+salary);
    }
    static EmployeeList loadData( ){
        Scanner s = new Scanner(System.in) ;
        System.out.println("Enter Employee name ");
        String name = s.nextLine();
        System.out.println("enter employee id");
        int id = s.nextInt();
        System.out.println("Enter employee salary ");
        int salary = s.nextInt();
        EmployeeList employeeList = new EmployeeList(name,id,salary);
        return employeeList;
    }
    public static void main(String ar[])throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many object ");
		
		// Serialization done here
        FileOutputStream fileInputStream = new FileOutputStream("d:\\readmyfile.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileInputStream) ;
        int n = scanner.nextInt();
        for(int i= 1 ; i<=n;i++){
           EmployeeList employeeList = EmployeeList.loadData();
           objectOutputStream.writeObject(employeeList);

        }
		
		// DeSerialization done here
        FileInputStream fileInputStream = new FileInputStream("d:\\readmyfile.txt") ;
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream) ;

        try
        {
         EmployeeList employeeList;
         while ((employeeList = (EmployeeList) objectInputStream.readObject())!=null){
             System.out.print("sujit");
              employeeList.display();
        }
        }
        catch (Exception e){

        }
    }

}
