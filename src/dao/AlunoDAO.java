
package dao;

import entidade.Aluno;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import tela.Diario;

public class AlunoDAO extends DAO
{
    public AlunoDAO()
    {
        super();
    }
    
    public boolean salvarAluno(Aluno a) throws Exception
    {
        String query = "INSERT INTO ALUNO(NOME,DT_NASCIMENTO) VALUES(?,?)";
                
        try
        {
            return this.getDb().executeCommand(query,a.getNome(),a.getDtNascimento()) > 0;
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
    
    public Aluno alunoById(Integer id) throws Exception
    {
        Aluno aluno = null;
        String query = "SELECT ID,NOME,DT_NASCIMENTO FROM ALUNO WHERE ID = ?";
        try
        {
            ResultSet rs = this.getDb().executeQuery(query,id);
            
            if(rs.next())
            {
                aluno = new Aluno(rs.getInt("ID"),rs.getString("NOME"),rs.getDate("DT_NASCIMENTO"));
            }
            rs.close();
            
            return aluno;
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
    
    public List<Aluno> todosAlunos() throws Exception
    {
        List<Aluno> alunos = new ArrayList<Aluno>();
        String query = "SELECT ID,NOME,DT_NASCIMENTO FROM ALUNO";
        try
        {
            ResultSet rs = this.getDb().executeQuery(query);
            
            while(rs.next())
            {
                alunos.add(new Aluno(rs.getInt("ID"),rs.getString("NOME"),rs.getDate("DT_NASCIMENTO")));
            }
            rs.close();
            
            return alunos;
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
