/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappers;

import data.Storage;
import entity.Customer;
import interfaces.IStorage;
import java.util.List;

/**
 *
 * @author Honza
 */
public class CustomerMapper extends Mapper<Customer>
{

    public static Customer tryLogin(String name, String passWord)
    {
        IStorage is = Storage.getInstance();

        return null;
    }

    public List<Customer> selectAll()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Customer customer;

    public CustomerMapper(Customer customer)
    {
        this.customer = customer;
    }

    @Override
    public void insert()
    {
        IStorage is = Storage.getInstance();
        is.insert(customer);
    }

    @Override
    public void update()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer findById(long id)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
