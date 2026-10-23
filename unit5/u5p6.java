import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
class u5p6
{ 
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            String sql="select * from stud2";
            PreparedStatement pstmt=cn.prepareStatement(sql);
            ResultSet rs=pstmt.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt("grno")+" "+rs.getString("name"));
            }
            cn.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}