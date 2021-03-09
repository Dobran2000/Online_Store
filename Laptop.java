import java.lang.String;
public class Laptop extends Produs
{
    private int numarProcesoare;
    private int tip;
     private int getNumarProcesoare()
    {
        return this.numarProcesoare;
        
    }
    private void setNumarProcesoare(int numarProcesoare)
    {
     this.numarProcesoare=numarProcesoare;
    }
    private int getTip()
    {
       return this.tip;
    }
    private void setTip(int tip)
    {
        this.tip=tip;
    }
    Laptop()
    {
    }
    Laptop(int stoc, int pret, String producator,int numarProcesoare,int tip)
    {
        super(stoc,pret,producator);
        this.numarProcesoare=numarProcesoare;
        this.tip=tip;
    }
    
    @Override
    public String toString()
    {
        return super.toString() +
        "numarul de procesoare "+this.numarProcesoare +"tipul laptopului este "+ this.tip;
        
    }
}
