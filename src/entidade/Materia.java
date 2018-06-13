
package entidade;

public class Materia
{
    private int id;
    private String materia;

    public Materia(Integer _id, String _materia)
    {
        this.id = _id;
        this.materia = _materia;
    }
    
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getMateria()
    {
        return materia;
    }

    public void setMateria(String materia)
    {
        this.materia = materia;
    }    
    
    @Override
    public String toString()
    {
        return this.materia;
    }
}
