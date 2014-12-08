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
public class Customer implements IEntity
{

    private long id;
    private String name;
    private String lastName;
    private String email;
    private String passWord;

    public Customer(long id, String name, String lastName, String email, String passWord)
    {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.passWord = passWord;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName new value of lastName
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Get the value of passWord
     *
     * @return the value of passWord
     */
    public String getPassWord()
    {
        return passWord;
    }

    /**
     * Set the value of passWord
     *
     * @param passWord new value of passWord
     */
    public void setPassWord(String passWord)
    {
        this.passWord = passWord;
    }

    @Override
    public String toString()
    {
        return lastName + " " + name; //To change body of generated methods, choose Tools | Templates.
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    @Override
    public String getTableName()
    {
        return "CustomerTable";
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

}
