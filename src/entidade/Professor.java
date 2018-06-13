
package entidade;

public class Professor
{
    private int id;
    private String nome;
    
    public Professor(Integer _id,String _nome)
    {
        this.id = _id;
        this.nome = _nome;
    }
    
    public Professor()
    {
    
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
    
    @Override
    public String toString()
    {
        return this.nome;
    }
}
