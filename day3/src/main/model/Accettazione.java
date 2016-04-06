package main.model;

import java.util.ArrayList;

/**
 * Created by mspiaggi on 4/6/16.
 */
public class Accettazione {

    int max=60;
    int current=0;
    ArrayList<Prenotazione> list= new ArrayList<>();

    public Accettazione() {

    }

    public boolean inserisciPrenotazione(Prenotazione p){

        if (p.getNumeroPersone()<max-current)
        {
            list.add(p);
            System.out.println("Prenotazione a nome "+p.getNominativo()+" per "+p.getNumeroPersone()+"persone");
            current+=p.getNumeroPersone();
            return true;
        }
        else{ System.out.println("Numero massimo di persione raggiunto");
        return false;
        }


    }
}
