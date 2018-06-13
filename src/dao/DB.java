package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.naming.NamingException;
import javax.xml.bind.JAXBException;

public class DB 
{
    private final String JDBC_DRIVER;
    private final String DB_URL;
    private final String USER;
    private final String PASSWORD;
    private Connection conn = null;

    public DB(String driver, String url, String user, String pass)
    {
        this.JDBC_DRIVER = driver;
        this.DB_URL = url;
        this.USER = user;
        this.PASSWORD = pass;
    }

    DB(String _url, String _user, String _pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void open() throws SQLException, NamingException, ClassNotFoundException, JAXBException
    {
        if (this.conn == null || this.conn.isClosed())
        {
                //Class.forName(this.JDBC_DRIVER);
                conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                conn.setAutoCommit(true);
        }
    }

    private void setParameters(PreparedStatement ps, Object[] data) throws SQLException
    {
        for (int i = 0; i < data.length; i++)
        {
            Object parameterObj = data[i];
            int parameterIndex = (i + 1);

            if (parameterObj == null)
            {
                    ps.setNull(parameterIndex, java.sql.Types.OTHER);
            }
            else if (parameterObj instanceof String)
            {
                    ps.setString(parameterIndex, (String) parameterObj);
            }
            else if (parameterObj instanceof Integer)
            {
                    ps.setInt(parameterIndex, ((Integer) parameterObj).intValue());
            }
            else if (parameterObj instanceof Float)
            {
                    ps.setFloat(parameterIndex, ((Float) parameterObj).floatValue());
            }
            else if (parameterObj instanceof java.sql.Date)
            {
                    ps.setDate(parameterIndex, (java.sql.Date) parameterObj);
            }
            else if (parameterObj instanceof Boolean)
            {
                    ps.setBoolean(parameterIndex, ((Boolean) parameterObj).booleanValue());
            }
            else if (parameterObj instanceof java.util.Date)
            {
                    ps.setTimestamp(parameterIndex, new Timestamp(((java.util.Date) parameterObj).getTime()));
            }
        }
    }

    public void close() throws SQLException
    {
            if (this.conn != null && !this.conn.isClosed())
            {
                    this.conn.close();
            }
    }

    public int executeCommand(String query) throws Exception
    {
        this.open();

        Statement stat = conn.createStatement();

        return stat.executeUpdate(query);
    }

    public int executeCommand(String query, Object... data) throws Exception
    {
        this.open();

        PreparedStatement ps = conn.prepareStatement(query);

        this.setParameters(ps, data);

        return ps.executeUpdate();
    }

    public ResultSet executeQuery(String query) throws Exception
    {
        this.open();

        Statement stat = conn.createStatement();

        return stat.executeQuery(query);
    }

    public ResultSet executeQuery(String query, Object... data) throws Exception
    {
        this.open();

        PreparedStatement ps = conn.prepareStatement(query);

        this.setParameters(ps, data);

        return ps.executeQuery();
    }
}
