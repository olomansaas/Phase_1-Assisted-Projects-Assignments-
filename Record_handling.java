package CRUD;
 
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
     
public class Record_handling {    
 
         public static void main(String[] args) throws ClassNotFoundException {
        // TODO Auto-generated method stub
        //Select query 
        String select_query = "select * from employee_details";
         
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        //Connecting to Oracle DB
        try(Connection conn =
 DriverManager.getConnection("jdbc:oracle:thin:system/pass123@localhost:1521:X
E"))
        {
                //Creating DatabaseMetaData object
                DatabaseMetaData dbmd = conn.getMetaData();
                //Checking whether the driver supports scroll 
sensitive type and concur updatable
                boolean isSupportResultSetType = 
dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE,
 ResultSet.CONCUR_UPDATABLE);
                if(isSupportResultSetType == true)
                {
                // Creating prepared Statement
                PreparedStatement pstatemnt1 = 
conn.prepareStatement(select_query,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.
CONCUR_UPDATABLE);
                ResultSet rs = pstatemnt1.executeQuery();
                //Moving the cursor to point first row
                rs.first();
                System.out.println("FIRST ROW \n EMP NUM = " + 
rs.getInt("empNum") + "\n LAST NAME = "+ rs.getString(2)+"\n FIRST NAME = " + rs.getString(3));
                //Moving the cursor to point last row       
         
                                rs.last();
                System.out.println("LAST ROW \n EMP NUM = " +
 rs.getInt("empNum") + "\n LAST NAME = "+ rs.getString(2)+"\n FIRST NAME = " + rs.getString(3));
                //Moving the cursor to point before first row
                 
                                rs.beforeFirst();
                System.out.println("Cursor is pointing at before the
 first row. Use next() to move in forward direction");
                //Moving the cursor to point first row using next()             
                                 
                                rs.next();
                System.out.println("FIRST ROW \n EMP NUM = " +
 rs.getInt("empNum") + "\n LAST NAME = "+ rs.getString(2)+"\n FIRST NAME = " + rs.getString(3));
                //Moving the cursor to point after last row 
 
                    rs.afterLast();
                System.out.println("Cursor is pointing at after the last row. Use previous() to move in backward direction");
                //Moving the cursor to point last row  using previous() 
 
                    rs.previous();
                System.out.println("LAST ROW \n EMP NUM = " + 
rs.getInt("empNum") + "\n LAST NAME = "+ rs.getString(2)+"\n FIRST NAME = " + rs.getString(3));
                //Moving the cursor to point third row              
 
                               rs.absolute(3);
                System.out.println("Cursor is pointing at 3rd row");
                System.out.println("THIRD ROW \n EMP NUM = " +
 rs.getInt("empNum") + "\n LAST NAME = "+ rs.getString(2)+"\n FIRST NAME = " + rs.getString(3));
                //Moving the cursor to point previous row of third row              
 
                               rs.relative(-1);
                System.out.println("Cursor is pointing to the 1 row previous to the 3rd row");
                System.out.println("Second ROW \n EMP NUM = " + rs.getInt("empNum") + "\n LAST NAME = "+
 rs.getString(2)+"\n FIRST NAME = " + 
rs.getString(3));
                //Moving the cursor to point 4th row after the 2nd row              
 
                                rs.relative(4);
                System.out.println("Cursor is pointing to the 4th row after the 2nd row");
                System.out.println("SIXTH ROW \n EMP NUM = " +
 rs.getInt("empNum") + "\n LAST NAME = "+ rs.getString(2)+"\n FIRST NAME = " + rs.getString(3));
                //Moving the cursor to point current row                
 
                                System.out.println(" Current Row = " + rs.getRow());
                 
                }
                 
        }
         
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}