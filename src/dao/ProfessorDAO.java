
package dao;

import entidade.Professor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO extends DAO
{
    public ProfessorDAO()
    {
        super();
    }
    
    public boolean salvarProfessor(Professor p) throws Exception
    {
        String query = "INSERT INTO PROFESSOR(NOME) VALUES(?)";
                
        try
        {
            return this.getDb().executeCommand(query,p.getNome()) > 0;
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
    
    public Professor professorById(Integer id) throws Exception
    {
        Professor professor = null;
        String query = "SELECT ID,NOME FROM PROFESSOR WHERE ID = ?";
        try
        {
            ResultSet rs = this.getDb().executeQuery(query,id);
            
            if(rs.next())
            {
                professor = new Professor(rs.getInt("ID"),rs.getString("NOME"));
            }
            rs.close();
            
            return professor;
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
    
     public List<Professor> todosProfessores() throws Exception
    {
        List<Professor> professor = new ArrayList<Professor>();
        String query = "SELECT ID,NOME FROM PROFESSOR";
        try
        {
            ResultSet rs = this.getDb().executeQuery(query);
            
            while(rs.next())
            {
                professor.add(new Professor(rs.getInt("ID"),rs.getString("NOME")));
            }
            rs.close();
            
            return professor;
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
