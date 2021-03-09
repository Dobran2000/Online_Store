import java.util.Comparator;

public class NumeComparator implements Comparator<Client> 
{
    
    public int compare(Client client1, Client client2) 
    {
        //0 daca filmele sunt egale
        //>0 daca film1 > film2
        //<0 daca film1 < film2
        String numeClient1 = client1.getNume();
         String numeClient2 = client2.getNume();
        return  numeClient1.compareTo(numeClient2);
        
    }   
}
