/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Honza
 */
public class Account
{

    private int accountNumber;
    private int dayLimit;
    private Customer owner;

    public Account(int accountNumber, int dayLimit, Customer owner)
    {
        this.accountNumber = accountNumber;
        this.dayLimit = dayLimit;
        this.owner = owner;
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

}
