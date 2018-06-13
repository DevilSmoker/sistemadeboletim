package entidade;

import java.util.Date;

public class Aluno
{
    private int id;
    private String nome;
    private Date dtNascimento;
    
    public Aluno(Integer _id, String _nome, Date _dtNascimento)
    {
        this.id = _id;
        this.nome = _nome;
        this.dtNascimento = _dtNascimento;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Date getDtNascimento()
    {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento)
    {
        this.dtNascimento = dtNascimento;
    }
    
    @Override
    public String toString()
    {
        return this.nome;
    }
}
