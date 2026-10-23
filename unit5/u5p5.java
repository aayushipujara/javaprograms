import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
class u5p5
{ 
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            String sql="insert into stud2 (grno,name) values (?,?)";
            PreparedStatement pstmt=cn.prepareStatement(sql);
            Scanner sc=new Scanner(System.in);
            int grno = 0;
            String name="";
            System.out.print("Enter grno.");
            grno=sc.nextInt();
            System.out.println("Enter name");
            name=sc.next();
            pstmt.setInt(1,grno);
            pstmt.setString(2,name);
            int x=pstmt.executeUpdate();
            System.out.println("No of row inserted:"+x);
            cn.close();
        }
        catch (Exception e) 
        { 
            System.out.println(e);
        }
    }
}

