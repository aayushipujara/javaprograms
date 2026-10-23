import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
class u5p8
{ 
    public static void main(String args[])
    {
        try
        {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            String sql="delete from stud2 where grno=?";
            PreparedStatement pstmt=cn.prepareStatement(sql);
            Scanner sc=new Scanner(System.in);
            int grno = 0;
            System.out.print("Enter grno. to be deleted");
            grno=sc.nextInt();
            pstmt.setInt(1,grno);
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