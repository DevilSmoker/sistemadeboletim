
package dao;

import entidade.Materia;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MateriaDAO extends DAO
{
    public MateriaDAO()
    {
        super();
    }
    
    public boolean salvarMateria(Materia m) throws Exception
    {
        String query = "INSERT INTO MATERIA(MATERIA) VALUES(?)";
                
        try
        {
            return this.getDb().executeCommand(query,m.getMateria()) > 0;
        }
        catch(Exception ex)
        {
            throw ex;
        }
        finally
        {
            this.getDb().close();
        }
    }
    
    public Materia materiaById(Integer id) throws Exception
    {
        Materia materia = null;
        String query = "SELECT ID,MATERIA FROM MATERIA WHERE ID = ?";
        try
        {
            ResultSet rs = this.getDb().executeQuery(query,id);
            
            if(rs.next())
            {
                materia = new Materia(rs.getInt("ID"),rs.getString("MATERIA"));
            }
            rs.close();
            
            return materia;
        }
        catch(Exception ex)
        {
            throw ex;
        }
        finally
        {
            this.getDb().close();
        }
    }
    
     public List<Materia> todasMaterias() throws Exception
    {
        List<Materia> materias = new ArrayList<Materia>();
        String query = "SELECT ID,MATERIA FROM MATERIA";
        try
        {
            ResultSet rs = this.getDb().executeQuery(query);
            
            while(rs.next())
            {
                materias.add(new Materia(rs.getInt("ID"),rs.getString("MATERIA")));
            }
            rs.close();
            
            return materias;
        }
        catch(Exception ex)
        {
            throw ex;
        }
        finally
        {
            this.getDb().close();
        }
    }
}
