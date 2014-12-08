/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import interfaces.IStorage;

/**
 *
 * @author Honza
 */
public abstract class Storage
{

    public static IStorage STORAGE;

    public static final IStorage getInstance()
    {
        if (STORAGE == null)
        {
            STORAGE = new OracleDbStorage();
        }
        return STORAGE;
    }

}
