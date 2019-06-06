package cwiczenia;

import org.junit.Before;
import org.junit.Test;
import org.assertj.core.api.Assertions;

import static org.junit.Assert.*;

public class BudzetTest {

    Budzet budzet;

    @Before
    public void setUp(){
        budzet = new Budzet();
    }

    @Test
    public void isSumCorrect() {

       Assertions.assertThat(budzet.getSuma()).isEqualTo(19399.52);
    }
}