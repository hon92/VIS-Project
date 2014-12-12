/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Account;
import entity.Customer;
import entity.Employee;
import gui.AccountDialog;
import gui.CustomerDetailDialog;
import gui.CustomerDialog;
import gui.LoginDialog;
import java.util.List;
import javax.swing.JFrame;
import mapper.MapperFactory;

/**
 *
 * @author Honza
 */
public class AdminController implements IAdminController
{

    private final JFrame window;
    private Employee loggedEmployee;

    public AdminController(JFrame window, Employee loggedEmployee)
    {
        this.window = window;
        this.loggedEmployee = loggedEmployee;
    }

    @Override
    public List<Customer> searchCustomers(String reg)
    {
        List<Customer> customers = MapperFactory.getCurrent().getCustomerMapper().selectAll();
        return customers;
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
            MapperFactory.getCurrent().getCustomerMapper().update(customer);
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
        CustomerDialog ncd = new CustomerDialog(window, true, loggedEmployee);
        ncd.setVisible(true);

        Customer c = ncd.getCustomer();

        if (c != null)
        {
            //save to storage INSERT
            c.setOwner(loggedEmployee);
            MapperFactory.getCurrent().getCustomerMapper().insert(c);
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
            MapperFactory.getCurrent().getAccountMapper().insert(newAccount);
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
        MapperFactory.getCurrent().getCustomerMapper().delete(selectedCustomer);
        System.out.println("delete");
    }

    @Override
    public void showCustomerDetail(Customer selectedCustomer)
    {
        CustomerDetailDialog cdd = new CustomerDetailDialog(window, true, selectedCustomer);
        cdd.setVisible(true);
    }

    @Override
    public void logout()
    {
        window.dispose();
        new LoginDialog(null, true).setVisible(true);

    }

}
