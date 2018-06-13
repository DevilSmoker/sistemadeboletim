
package dao;

import entidade.Aluno;
import entidade.Aula;
import java.sql.ResultSet;

public class AulaDAO extends DAO
{
    public AulaDAO()
    {
        super();
    }
    
    public boolean salvarAula(Aula aula) throws Exception
    {
        String query = "INSERT INTO AULA(DT_AULA,FK_MATERIA,FK_PROFESSOR) VALUES(?,?,?)";
        
        try
        {
            int rows = this.getDb().executeCommand(query,aula.getDtAula(),aula.getMateria().getId(),aula.getProfessor().getId());
            
            ResultSet rs = this.getDb().executeQuery("SELECT MAX(ID) FROM AULA");
            rs.next();
            
            aula.setId(rs.getInt(1));
            
            rs.close();
            return rows > 0;
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
    
    public void frequenciaAula(Aula aula, Aluno aluno,Boolean presenca) throws Exception
    {
        String query = "INSERT INTO FREQUENCIA(FK_AULA,FK_ALUNO,PRESENTE) VALUES(?,?,?)";
        
        try
        {
            this.getDb().executeCommand(query,aula.getId(),aluno.getId(),presenca);
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
