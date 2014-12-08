/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entity.IEntity;
import interfaces.IStorage;
import java.util.HashMap;

/**
 *
 * @author Honza
 */
public class OracleDbStorage extends Storage implements IStorage
{

    public OracleDbStorage()
    {

    }

//    @Override
//    public IConnection getConnection()
//    {
//        Connection c = null;
//        try
//        {
//            PoolDataSource pds = PoolDataSourceFactory.getPoolDataSource();
//            pds.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
//            pds.setURL("jdbc:oracle:thin:@dbsys.cs.vsb.cz:1521:oracle");
//            pds.setUser("hom0036");
//            pds.setPassword("DgLA4CGzCd");
//            pds.setInitialPoolSize(5);
//            pds.setMinPoolSize(5);
//            pds.setMaxPoolSize(10);
//
//            c = pds.getConnection();
//
//        }
//        catch (SQLException ex)
//        {
//            Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        finally
//        {
//            if (c != null)
//            {
//                try
//                {
//                    c.close();
//                }
//                catch (SQLException ex)
//                {
//                    Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                c = null;
//            }
//        }
//        return null;
//    }
    @Override
    public void insert(IEntity o)
    {
        HashMap<String, Object> data = o.decode();
        String table = o.getTableName();

    }

    @Override
    public void update(IEntity o)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(IEntity o)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IEntity findById(long id)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
