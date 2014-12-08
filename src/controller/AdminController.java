/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Account;
import entity.Customer;
import gui.AccountDialog;
import gui.CustomerDetailDialog;
import gui.CustomerDialog;
import interfaces.IAdminController;
import interfaces.IStorage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Honza
 */
public class AdminController implements IAdminController
{

    private IStorage storage;
    private final JFrame window;

    public AdminController(JFrame window)
    {
        this.window = window;
    }

    @Override
    public List<Customer> searchCustomers(String reg)
    {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("jan", "homola", "j@s.cz", "123"));
        list.add(new Customer("aaa", "bb", "j@s.cz", "1"));
        return list;
    }

    @Override
    public void editCustomer(Customer c)
    {
        CustomerDialog ncd = new CustomerDialog(window, true, c);
        ncd.setVisible(true);

        Customer customer = ncd.getCustomer();

        if (customer != null)
        {
            //save to storage UPDATE
            System.out.println("update");
        }
        else
        {
            System.out.println("Storno");
        }
    }

    @Override
    public void createNewCustomer()
    {
        CustomerDialog ncd = new CustomerDialog(window, true, null);
        ncd.setVisible(true);

        Customer c = ncd.getCustomer();

        if (c != null)
        {
            //save to storage INSERT
            System.out.println("insert");
        }
        else
        {
            System.out.println("Storno");
        }

    }

    @Override
    public void addAccount(Customer c)
    {
        AccountDialog ad = new AccountDialog(window, true, c);
        ad.setVisible(true);
        Account newAccount = ad.getAccount();

        if (newAccount != null)
        {
            //insert new acc to storage
            System.out.println("insert");
        }
        else
        {
            System.out.println("Storno");
        }

    }

    @Override
    public void removeCustomer(Customer selectedCustomer)
    {
        //delete customer from storage
        System.out.println("delete");
    }

    @Override
    public void showCustomerDetail(Customer selectedCustomer)
    {
        CustomerDetailDialog cdd = new CustomerDetailDialog(window, true, selectedCustomer);
        cdd.setVisible(true);
    }

}
