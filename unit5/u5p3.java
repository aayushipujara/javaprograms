import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
class u5p3
{ 
    public static void main(String args[])
    {
        try
        {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            Statement stmt=cn.createStatement();
            Scanner sc=new Scanner(System.in);
            int grno = 0;
            String name ="";
            System.out.print("Enter grno. to be updated");
            grno=sc.nextInt();
            System.out.println("Enter new name");
            name=sc.next();
            try {
                int x=stmt.executeUpdate("Update stud set name='"+name+"'where grno="+grno);
                System.out.println("No of Rows affected:"+x);
                }
            catch (Exception e)
              {
                System.out.println(e);
              }
              cn.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
