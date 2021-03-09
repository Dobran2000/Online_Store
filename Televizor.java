import java.lang.String;
public class Televizor extends Produs
{
    private int diagonala;
    private int tip;
     private int getDiagonala()
    {
        return this.diagonala;
        
    }
    private void setDiagonala(int diagonala)
    {
     this.diagonala=diagonala;
    }
    private int getTip()
    {
       return this.tip;
    }
    private void setTip(int tip)
    {
        this.tip=tip;
    }
    Televizor()
    {
    }
    Televizor(int stoc, int pret, String producator,int diagonala,int tip)
    {
        super(stoc,pret,producator);
        this.diagonala=diagonala;
        this.tip=tip;
    }
    
    @Override
    public String toString()
    {
        return super.toString() +
        "diagonala"+this.diagonala +"tipul televizorului este "+ this.diagonala;
        
    }
}
