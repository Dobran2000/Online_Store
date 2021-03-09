import java.util.*;

public class Client extends Magazin
{
    private String nume;
    private int an;
    public ArrayList<Produs> produse = new ArrayList<>();
    public String getNume()
    {
        return this.nume;
    }
    
    private void setNume(String nume)
    {
        this.nume=nume;
    }    
    
    public int getAn()
    {
        return this.an;
    }
    private void setAn(int an)
    {
        this.an=an;
        
    }
    
    Client()
    {
    }
    Client(String nume, int an)
    {
        this.nume=nume;
        this.an=an;
        produse= new ArrayList<>();
    }
    
    public void adaugaProdus(String nume,String TipProdus, int stoc, int pret, String producator, int ValoareProprie1,int ValoareProprie2)
      {
      if(TipProdus.equals("Laptop"))
            {
            
            produse.add(new Laptop(stoc,pret,producator,ValoareProprie1,ValoareProprie2));
               numarProduse++;
             
                if (ValoareProprie2==1)
          
             {
               System.out.println("S-a adaugat un laptop cu touch in cosul clientului cu numele "+ nume);
              
             }
            
           else if(ValoareProprie2==2)
          
              System.out.println("S-a adaugat un laptop fara touch in cosul clientului cu numele "+ nume);
            
           }
          else if(TipProdus.equals("Telefon"))
           {
            produse.add(new Telefon(stoc,pret,producator,ValoareProprie1,ValoareProprie2));
             numarProduse++;
             stoc--;
  
           }
          else if(TipProdus.equals("Televizor"))
          {
             produse.add(new Televizor(stoc,pret,producator,ValoareProprie1,ValoareProprie2));
            numarProduse++;
            stoc--;
              if(ValoareProprie2==3){
            System.out.println("S-a adaugat un televizor smart in cosul clientului cu nume " + nume);
     
            
            }
            else if(ValoareProprie2==4)
            System.out.println("S-a adaugat un televizor care nu e smart in cosul clientului cu nume " + nume);
         
         }

    }
    
        
    public void afisareCos()
   {
        for(int i=0; i< produse.size();i++)
        {
         System.out.println(produse.get(i));
       
        }
        
    }
      
 
    
   public int getCostOfCart() 
   {
       int PretTotal = 0;
       if (produse != null) 
       {
           for(int i=0; i< produse.size();i++)
           {
               PretTotal +=  produse.get(i).getPret();
           }
       }
   
       return PretTotal;
   }
   
   
   public void printTotal() 
   {
      int pret=getCostOfCart();
       if (produse == null || produse.size() == 0) 
       {
           System.out.println("Cosul este gol");
           return;
       }

       for(int i=0; i< produse.size();i++)
       {
           produse.get(i).PretTotal();
       }
       if  (an < 2018)
       { 
          pret=(pret *9)/10;
       }
       
       System.out.println(pret);
       
      return;
    

    }
   
    public void removeItem(String itemName) 
   {
       if (produse != null) 
       {
            for(int i=0; i < produse.size();i++)
           {
               if (itemName.equals(produse.get(i).getTipProdus())) 
               {
                   produse.remove(produse.get(i));
                   return;
               }
               
           }
       }
    
    
    }
    
    
    
    
    
    @Override
    public String toString()
    {
     return "Numele Clientului este "+ this.nume + "si anul inregistrarii" +this.an + "produsele din cos " +this.produse ;   
        
    }
    
 }
