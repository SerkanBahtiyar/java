package useDB;

import models.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerService {

    public int customerAdd( String name, String email, String password ) {
        DB db = new DB();
        int status = 0;
        try {
            String sql = "insert into customer values(default, ?, ?, ?)";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, email);
            pre.setString(3, password);
            status = pre.executeUpdate();
        }catch (Exception ex) {
            System.err.println("customerAdd error: " + ex);
        }finally {
            db.close();
        }
        return status;
    }


    public ArrayList<Customer> customerList() {
        ArrayList<Customer> ls = new ArrayList<>();
        DB db = new DB();
        try {
            String sql = "select * from customer";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while( rs.next() ) {
                int cid = rs.getInt("cid");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Customer c = new Customer(cid, name, email, password);
                ls.add(c);
            }
        }catch (Exception ex) {
            System.err.println("customerList error: " + ex);
        }finally {
            db.close();
        }
        return ls;
    }


    public int customerDelete( int cid ) {
        DB db = new DB();
        int status = 0;
        try {
            String sql = "delete from customer where cid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, cid);
            status = pre.executeUpdate();
        }catch (Exception ex) {
            System.err.println("delete error: " + ex);
        }finally {
            db.close();
        }
        return status;
    }


}
