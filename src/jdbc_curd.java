import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc_curd extends connection_query
{
    public void add_data(String username , int age, String gender , String mobile, String email, String doj,
                         String source, String destination , String price , String seat_preference)
    {
        String query="Insert into ticketbookingtb ( username,age,gender,mobile,email,doj,source,destination," +
                "ticketprice,seatpreference) values(?,?,?,?,?,?,?,?,?,?) ";

        try {
            PreparedStatement ps=connection.prepareStatement(query);
            ps.setString(1,username);
            ps.setInt(2,age);
            ps.setString(3,gender);
            ps.setString(4,mobile);
            ps.setString(5,email);
            ps.setString(6,doj);
            ps.setString(7,source);
            ps.setString(8,destination);
            ps.setString(9,price);
            ps.setString(10,seat_preference);
            ps.execute();
            JOptionPane.showMessageDialog(null,"Data Add Successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void delete_data(int idd) {
            String deletequery="delete from ticketbookingtb where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(deletequery);
            ps.setInt(1,idd);
            ps.execute();
            JOptionPane.showMessageDialog(null,"1 record is deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void fetch_data(int  idd) {
        String fetch_query = "Select* from ticketbookingtb where id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(fetch_query);
            ps.setInt(1, idd);
            ResultSet re = ps.executeQuery();
            while (re.next()) {
                JOptionPane.showMessageDialog(null, "Id = " + re.getString(1) + "\n" + "Username  =  " + re.getString(2) + "\n"
                        + "Age  =  " + re.getString(3) + "\n" + "Gender  =  " + re.getString(4) + "\n" + "Mobile  =  " + re.getString(5) + "\n"
                        + "Email  =  " + re.getString(6) + "\n" + "DOJ  =  " + re.getString(7) + "\n" + "Source  =  " + re.getString(8) + "\n" +
                        "Destination  =  " + re.getString(9) + "\n" + "Ticket_Price  =  " + re.getString(10) + "\n" + "Seat_Preference  =  " + re.getString(11));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void update_data(String username , int age, String gender , String mobile, String email, String doj,
                            String source, String destination , String price , String seat_preference,int id)
    {
        String updatequery = "update ticketbookingtb set username=?,age=?,gender=?,mobile=?,email=?,doj=?,source=?" +
                ",destination=?,ticketprice=?,seatpreference=? where id=? ";
        try {
            PreparedStatement ps=connection.prepareStatement(updatequery);
            ps.setString(1,username);
            ps.setInt(2,age);
            ps.setString(3,gender);
            ps.setString(4,mobile);
            ps.setString(5,email);
            ps.setString(6,doj);
            ps.setString(7,source);
            ps.setString(8,destination);
            ps.setString(9,price);
            ps.setString(10,seat_preference);
            ps.setInt(11,id);
            ps.execute();
            JOptionPane.showMessageDialog(null,"Data Update Successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
