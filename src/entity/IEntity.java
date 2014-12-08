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
public interface IEntity
{

    public String getTableName();

    public HashMap<String, Object> decode();

    public IEntity encode();
}
