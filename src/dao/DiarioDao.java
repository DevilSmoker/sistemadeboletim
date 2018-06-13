/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.GerarDiario;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import tela.Diario;

/**
 *
 * @author mircio
 */
public class DiarioDao extends DAO{
    
     GerarDiario d = new GerarDiario();
    
    public DiarioDao(){
        super();
    }
    
     public List<Diario> gDiario() throws Exception
     {
        
        String query = "select a.NOME, n.NOTA1, n.NOTA2, n.MEDIA, n.NOTAF \n" +
                        "from aluno a join nota n \n" +
                        "on a.ID = n.FK_ALUNO \n" +
                        "order by a.NOME;";
        
        List<Diario> diarios = new ArrayList<>();
        
        try
        {
           
            ResultSet rs = this.getDb().executeQuery(query);
            
            while(rs.next())
            {
                d.setAlunos(rs.getString("NOME"));
                d.setAv1(rs.getFloat("NOTA1"));
                d.setAv2(rs.getFloat("NOTA2"));
                d.setMedia(rs.getFloat("MEDIA"));
                d.setNotaFinal(rs.getFloat("NOTAF"));
                
                diarios.add(d);
            }
            rs.close();
            
            return diarios;
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
