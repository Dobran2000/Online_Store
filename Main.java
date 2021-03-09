import java.util.Scanner;
import java.util.*;
import java.lang.String;
import java.util.Comparator;
import java.time.*;

public class Main 
{
 static Scanner scanner = new Scanner(System.in); 
 static Magazin magazin = new Magazin();
 

   public static void main(String[] args) 
    {
        boolean citeste=true;
        
        citesteStart();
        do 
        {
            
           String comanda = scanner.next();
          //ThreadPeriodic thread = new ThreadPeriodic();
           //thread.start();
           // boolean citeste2 = false;
            switch(comanda) 
            { 
                case "ADAUGA_CLIENT": 
                   citesteAdauga();
                   break;
                case "ADAUGA_PRODUS":
                    citesteAdaugaProdus() ;
                    break;
                case "AFISARE_COMPLETA":
                  AfisareCompleta();
                  
                   break;
                case "STERGE_PRODUS":
                   citesteStergeProdus();
                   AfisareCos();
                   break;
                case "AFISARE_COS":
                   AfisareCos();
                   break;
                case "STERGE_TOATE_PRODUSELE":
                   StergeProduse();
                   break;
                  // case "EXIT":
                    //System.out.println("Fabrica s-a oprit :(");
                   // thread.stopThread();
                    //citeste2 = false;
                    //break;
                   
                 default:
                    System.out.println("Comanda introdusa nu exista!");
            }
                
            }while(citeste == true);
    }
    
    static void citesteStart() 
    {
        String comanda = "";
        do {
            System.out.println("Te rog introdu comanda START");
            comanda = scanner.next();
            } while(!comanda.equalsIgnoreCase("START"));
        afiseazaComenzi();
    }
    
    static void citesteAdauga() 
    {
        String nume = scanner.next();
        int an =Integer.parseInt(scanner.next());
        magazin.adaugaClient(nume,an);
       
    }
    
     static void citesteAdaugaProdus() 
    { 
        String numeClient=scanner.next();
        String TipProdus=scanner.next();
        System.out.println("Te rugam introdu detalii despre produs");
        int stoc = Integer.parseInt(scanner.next());
        int pret = Integer.parseInt(scanner.next());
        String producator = scanner.next();
        int ValoareProprie1 = Integer.parseInt(scanner.next()); 
        int ValoareProprie2 = Integer.parseInt(scanner.next());
 
       for(int i=0;i< magazin.clienti.size();i++)
       if (numeClient.equals(magazin.clienti.get(i).getNume()))
        {magazin.clienti.get(i).adaugaProdus(numeClient,TipProdus,stoc,pret,producator,ValoareProprie1,ValoareProprie2);
        }
         if (stoc==0) System.out.println("Produsul nu mai e in stoc");
    } 
     
    static void citesteStergeProdus()
      {
        
        String numeClient=scanner.next();
     
        String TipProdus=scanner.next();
        for(int i=0;i < magazin.clienti.size();i++)
      
        if(numeClient.equals(magazin.clienti.get(i).getNume()))
      {
        magazin.clienti.get(i).removeItem(TipProdus);
       }
    
 
      }
      
      
      static void AfisareCompleta()
      {
         
          magazin.afiseazaClienti();
          for(int i=0;i< magazin.clienti.size();i++)
          magazin.clienti.get(i).printTotal();
          
        }
    
    static void StergeProduse()
    {
        System.out.println("Introduceti numele clientului= ");
        String numeClient=scanner.next();
        for(int i=0;i< magazin.clienti.size();i++)
       if (numeClient.equals(magazin.clienti.get(i).getNume()))
     {
          magazin.clienti.remove(magazin.clienti.get(i).produse);
     } 
        

        
    }
    
    static void AfisareCos() 
    {
     String numeClient= scanner.next();
  for(int i=0;i< magazin.clienti.size();i++)
       if (numeClient.equals(magazin.clienti.get(i).getNume()))
     {
          magazin.clienti.get(i).afisareCos(); 
     }
    }
 static void afiseazaComenzi() 
       {
        System.out.println("Comenzile pe care le poti introduce sunt:");
        System.out.println("ADAUGA_CLIENT<nume>");
        System.out.println("ADAUGA_PRODUS <numeClient> <tipProdus>");
        System.out.println("STERGE_PRODUS <numeClient> <numeProdus>");
        System.out.println("STERGE_TOATE_PRODUSELE <numeClient>");
        System.out.println("AFISARE_CLIENTI");
        System.out.println("AFISARE_COS <numeClient>");
        System.out.println("AFISARE_COMPLETA");
        System.out.println("EXIT");
        
       }

    }
    

