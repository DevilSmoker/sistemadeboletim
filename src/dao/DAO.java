
package dao;

public class DAO
{
    private DB db;
            
    public DAO()
    {
        String _driver = "com.mysql.cj.jdbc.Driver";
        String _url = "jdbc:mysql://localhost:3306/boletim?serverTimezone=UTC&useSSL=false";
        String _user = "root";
        String _pass = "root";
        
        this.db = new DB(_driver, _url, _user, _pass);
    }

    public DB getDb()
    {
        return db;
    }

    public void setDb(DB db)
    {
        this.db = db;
    }
}
