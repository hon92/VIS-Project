/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.HashMap;

/**
 *
 * @author Honza
 */
public class Account implements IEntity
{

    private long id;
    private int accountNumber;
    private int dayLimit;
    private Customer owner;

    public Account(long id, int accountNumber, int dayLimit, Customer owner)
    {
        this.id = id;
        this.accountNumber = accountNumber;
        this.dayLimit = dayLimit;
        this.owner = owner;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public int getDayLimit()
    {
        return dayLimit;
    }

    public void setDayLimit(int dayLimit)
    {
        this.dayLimit = dayLimit;
    }

    public Customer getOwner()
    {
        return owner;
    }

    public void setOwner(Customer owner)
    {
        this.owner = owner;
    }

    @Override
    public String toString()
    {
        return "AN: " + accountNumber; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<String, Object> decode()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IEntity encode()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTableName()
    {
        return "AccountTable";
    }

}
