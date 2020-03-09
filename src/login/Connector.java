package login;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dawid
 */
public class Connector 
{
    
    private static String nazwaSerwera = "localhost";
    private static String nazwaUzytkownika = "root";
    private static String nazwaBazyDanych = "users_datab";
    private static Integer numerPortu = 3306;
    private static  String Haslo = "";
    
    
    public static Connection getConnection()
    {
        Connection sql = null;

        MysqlDataSource datasource = new MysqlDataSource();

        datasource.setServerName(nazwaSerwera);
        datasource.setUser(nazwaUzytkownika);
        datasource.setPassword(Haslo);
        datasource.setDatabaseName(nazwaBazyDanych);
        datasource.setPortNumber(numerPortu);

            try 
            {
                sql = datasource.getConnection();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
            }

            return sql;
    }
    
}
