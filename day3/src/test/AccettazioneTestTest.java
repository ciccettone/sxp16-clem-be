package test;

import main.model.Accettazione;
import main.model.Prenotazione;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by mspiaggi on 4/6/16.
 */
public class AccettazioneTestTest {

    @Test
    public void testInserisciPrenotazione(){

        Accettazione a= new Accettazione();

        Prenotazione p= new Prenotazione();
        p.setNominativo("Marco");
        p.setNumeroPersone(10);
        Prenotazione p1= new Prenotazione();
        p1.setNominativo("Luigi");
        p1.setNumeroPersone(49);
        Prenotazione p3= new Prenotazione();
        p3.setNominativo("Eric");
        p3.setNumeroPersone(2);

        boolean b= a.inserisciPrenotazione(p);
        Assert.assertThat(b,is(true));
        boolean b2= a.inserisciPrenotazione(p1);
        Assert.assertThat(b2,is(true));
        boolean b3= a.inserisciPrenotazione(p3);
        Assert.assertThat(b3,is(false));



    }

}