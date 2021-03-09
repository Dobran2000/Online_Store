public class Telefon extends Produs
{
    int dimensiuneBaterie;
    int nrMegapixeli;
    public int getDimensiuneBaterie()
    {
        return this.dimensiuneBaterie;
        
    }
    public void setDimensiuneBaterie(int dimensiuneBaterie)
    {
        this.dimensiuneBaterie=dimensiuneBaterie;
    }
    
    public int getNrMegapixeli()
    {
     return this.nrMegapixeli;   
    }
    public void setNrMegapixeli()
    {
        this.nrMegapixeli=nrMegapixeli;
    }
    
    Telefon()
    {
    }
    Telefon(int stoc,int pret, String producator,int dimensiuneBaterie,int nrMegapixeli)
    {
        super(stoc,pret,producator);
        this.dimensiuneBaterie=dimensiuneBaterie;
        this.nrMegapixeli=nrMegapixeli;
        
  }
  @Override
  public String toString()
  {
      return super.toString() + ", dimensiunea bateriei ="+this.dimensiuneBaterie + "si numarul de Megapixeli = "+this.nrMegapixeli;
      
  
    }
    
  
  }
