public class Produs
{
    static int stoc;
    private int pret;
    private String producator;
    private String tipProdus;
    
    
    public String getTipProdus()
    {
        return this.tipProdus;
    }
    public void setTipProdus(String tipProdus)
    {
       
        this.tipProdus=tipProdus;
        
    }
    
    
     public int getPret()
    {
        return this.pret;
    }
   public void setPret(int pret)
    {
     this.pret=pret;   
        
    }
   public int getStoc()
    {
        return this.stoc;
        
    }
  public void setStoc(int stoc)
    {
        this.stoc=stoc;
    }
    
    
    private String getProducator()
    {return this.producator;
    }
    Produs()
    {
    }
    Produs(int stoc,int pret, String producator)
    {
        this.stoc=stoc;
        this.pret=pret;
        this.producator=producator;
        
    }
 
    
    
   public void PretTotal() 
    {
       int subtotal = pret;
       System.out.println(tipProdus + " " + stoc + " @ $" + pret + " = $" + subtotal);
    }
    
   @Override
    public String toString()
    {
     return "Stocul din acest produs este "+this.stoc + ",pretul "+this.pret+", producator "+this.producator;   
        
    }
   
    
    
}
