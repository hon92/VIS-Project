/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Customer;
import java.util.List;

/**
 *
 * @author Honza
 */
public interface IAdminController
{

    public List<Customer> searchCustomers(String reg);

    public void editCustomer(Customer c);

    public void createNewCustomer();

    public void addAccount(Customer c);

    public void removeCustomer(Customer selectedCustomer);

    public void showCustomerDetail(Customer selectedCustomer);

    public void logout();
}
