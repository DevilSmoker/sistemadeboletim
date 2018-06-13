/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Nota;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KSL
 */
public class NotaDAO extends DAO{
    public NotaDAO(){
        super();
    }
    public boolean salvarNota(Nota n) throws Exception
    {
        String query = "INSERT INTO NOTA(FK_ALUNO,FK_MATERIA,NOTA1,PESO1,NOTA2,PESO2,MEDIA,NOTAF,MEDIAF) VALUES(?,?,?,?,?,?,?,?,?)";
                
        
        try
        {
            return this.getDb().executeCommand(query,n.getAluno().getId(),n.getMateria().getId(),n.getNota1(),n.getPeso1(),n.getNota2(),n.getPeso2(),n.getMedia(),n.getNotaf(),n.getMediaf()) > 0;
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
    public Nota notaById(Integer id) throws Exception{
        Nota nota = null;
        String query = "SELECT ID,NOTA FROM NOTA WHERE ID = ?";
        try
        {
            ResultSet rs = this.getDb().executeQuery(query,id);
            
            if(rs.next())
            {
                nota = new Nota(rs.getInt("ID"),rs.getString("NOTA"));
            }
            rs.close();
            
            return nota;
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
    public List<Nota> todasNotas() throws Exception
    {
        List<Nota> notas = new ArrayList<Nota>();
        String query = "SELECT ID,NOTA FROM NOTA";
        try
        {
            ResultSet rs = this.getDb().executeQuery(query);
            
            while(rs.next())
            {
                notas.add(new Nota(rs.getInt("ID"),rs.getString("NOTA")));
            }
            rs.close();
            
            return notas;
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
