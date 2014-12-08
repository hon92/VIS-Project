/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.IEntity;

/**
 *
 * @author Honza
 */
public interface IStorage
{

    public void insert(IEntity o);

    public void update(IEntity o);

    public void delete(IEntity o);

    public IEntity findById(long id);

}
