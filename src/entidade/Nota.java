
package entidade;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Nota
{
    private int id;

    public Nota(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Aluno getFk_aluno() {
        return fk_aluno;
    }

    public void setFk_aluno(Aluno fk_aluno) {
        this.fk_aluno = fk_aluno;
    }

    public Materia getFk_materia() {
        return fk_materia;
    }

    public void setFk_materia(Materia fk_materia) {
        this.fk_materia = fk_materia;
    }
    private Aluno fk_aluno;
    private Materia fk_materia;
    private float nota1;
    private float peso1;
    private float nota2;
    private float peso2;
    private float media;
    private float notaf;
    private float mediaf;

    

    public Nota() {
         
    }

   
    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        float d = nota1;
        BigDecimal bd = new BigDecimal(d).setScale(3, RoundingMode.HALF_EVEN); // ARREDONDANDO
        
        this.nota1 = bd.floatValue();
    }

    public float getPeso1() {
        return peso1;
    }

    public void setPeso1(float peso1) {
        this.peso1 = peso1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        
        float d = nota2;
        BigDecimal bd = new BigDecimal(d).setScale(3, RoundingMode.HALF_EVEN); // ARREDONDANDO
                
        this.nota2 = bd.floatValue();
    }

    public float getPeso2() {
        return peso2;
    }

    public void setPeso2(float peso2) {
        this.peso2 = peso2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getNotaf() {
        return notaf;
    }

    public void setNotaf(float notaf) {
        this.notaf = notaf;
    }

    public float getMediaf() {
        return mediaf;
    }

    public void setMediaf(float mediaf) {
        this.mediaf = mediaf;
    }
    
    

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Aluno getAluno()
    {
        return fk_aluno;
    }

    public void setAluno(Aluno aluno)
    {
        this.fk_aluno = aluno;
    }

    public Materia getMateria()
    {
        return fk_materia;
    }

    public void setMateria(Materia materia)
    {
        this.fk_materia = materia;
    }

  
   
}
