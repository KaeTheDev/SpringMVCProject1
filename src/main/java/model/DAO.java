package model;

import com.test.util.Item;
import com.test.util.Users;
import org.springframework.web.servlet.ModelAndView;

import java.sql.*;
import java.util.ArrayList;

public class DAO
{
    public static ModelAndView addUserInfo()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection mysqlConnection;
            mysqlConnection = DriverManager.getConnection(
                    DBCredentials.DB_ADDRESS,
                    DBCredentials.USERNAME,
                    DBCredentials.PASSWORD);

            //create the db statement
            String readCustomersCommand = "INSERT firstname, lastname, email, phonenumber, password INTO items";

            //Creates the statement
            Statement readCustomers = mysqlConnection.createStatement();

            //Executes the statement
            readCustomers.executeQuery(readCustomersCommand);

            //Executes the statement
            ResultSet results = readCustomers.executeQuery(readCustomersCommand);

            //arraylist of users
            ArrayList<Users> itemList = new ArrayList<Users>();

            System.out.println("Results acquired ");
            //Map from the ResultSet to the ArrayList
            while (results.next())
            {
                Item temp = new Item (results.getString(1), results.getString(2), results.getInt(3), results.getFloat(4));
                itemList.add(temp);
                //System.out.println(results.getString(1));
            }

            return new ModelAndView("itemView","iList",itemList);
        }
        catch (Exception ex)
        {
            return new ModelAndView("error", "ermsg", ex.toString());

        }
    }



}