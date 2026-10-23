import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
class u5p7
{ 
    public static void main(String args[])
    {
        try
        {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            String sql="update stud2 set name=? where grno=?";
            PreparedStatement pstmt=cn.prepareStatement(sql);
            Scanner sc=new Scanner(System.in);
            int grno = 0;
            String name ="";
            System.out.print("Enter grno. to be updated");
            grno=sc.nextInt();
            System.out.println("Enter new name");
            name=sc.next();

            pstmt.setString(1,name);
            pstmt.setInt(2,grno);
            int x=pstmt.executeUpdate();
            System.out.println("No of Rows affected:"+x);
            
              cn.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}