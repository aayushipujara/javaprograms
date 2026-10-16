import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
class u5p1
{ 
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            Statement stmt=cn.createStatement();
            Scanner sc=new Scanner(System.in);
            int grno = 0;
            String name;
            System.out.print("Enter grno.");
            grno=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name");
            name=sc.nextLine();
            
            try
            {
                int x=stmt.executeUpdate("insert into stud values("+grno+",'"+name+"')");
                System.out.println("No of row inserted:"+x);
            }
            catch(Exception e)
            {
                System.out.println("Exception:"+e);
            }
            cn.close();
        }
        catch (Exception e) 
        { 
            System.out.println(e);
        }
    }
}
