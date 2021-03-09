import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.Collections;
public class Magazin 
{
   public int numarProduse=0;
   private int numarClienti=0;
   public ArrayList<Client> clienti =new ArrayList<>();
    private ArrayList<Produs> produse = new ArrayList<>();
    public void adaugaClient(String nume, int an)
    {
       clienti.add(new Client(nume,an));
       numarClienti++;
    }
    Magazin()
    {
    }
    Magazin(String nume,int an)
    {
        //super(nume,an);
        produse = new ArrayList<>();
        
    }
    public void afiseazaClienti() 
    {  
        NumeComparator numeComparator = new NumeComparator();
       
        Collections.sort(clienti, numeComparator);
          for(Client i : clienti) 
        {
            System.out.println(i);
        }
    }
  
  
}
