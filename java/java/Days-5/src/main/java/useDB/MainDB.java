package useDB;

import models.Customer;

import java.util.ArrayList;

public class MainDB {

    public static void main(String[] args) {

        CustomerService service = new CustomerService();


        //int addStatus = service.customerAdd("Selin", "selin@mail.com", "12345");
        //System.out.println(addStatus);

        // Delete
        int deleteStatus = service.customerDelete(4);
        System.out.println(deleteStatus);

        // List
        ArrayList<Customer> ls = service.customerList();
        for ( Customer item : ls ) {
            System.out.println(item);
        }

    }

}
