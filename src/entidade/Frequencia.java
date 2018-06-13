
package entidade;

public class Frequencia
{
    private Aula aula;
    private Aluno aluno;
    private boolean presente;

    public Aula getAula()
    {
        return aula;
    }

    public void setAula(Aula aula)
    {
        this.aula = aula;
    }

    public Aluno getAluno()
    {
        return aluno;
    }

    public void setAluno(Aluno aluno)
    {
        this.aluno = aluno;
    }

    public boolean isPresente()
    {
        return presente;
    }

    public void setPresente(boolean presente)
    {
        this.presente = presente;
    }
}
