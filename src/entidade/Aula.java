
package entidade;

import java.util.Date;

public class Aula
{
    private int id;
    private Date dtAula;
    private Materia materia;
    private Professor professor;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Date getDtAula()
    {
        return dtAula;
    }

    public void setDtAula(Date dtAula)
    {
        this.dtAula = dtAula;
    }

    public Materia getMateria()
    {
        return materia;
    }

    public void setMateria(Materia materia)
    {
        this.materia = materia;
    }

    public Professor getProfessor()
    {
        return professor;
    }

    public void setProfessor(Professor professor)
    {
        this.professor = professor;
    }    
}
