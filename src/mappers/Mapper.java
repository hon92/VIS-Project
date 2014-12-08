/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappers;

import entity.IEntity;
import java.util.List;

/**
 *
 * @author Honza
 */
public abstract class Mapper<T extends IEntity>
{

    public Mapper()
    {
    }

    public abstract void insert();

    public abstract void update();

    public abstract void delete();

    public abstract List<T> selectAll();

    public abstract T findById(long id);

}
