package cwiczenia;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class SmsTest {

    Sms sms;

    @Before
    public void setUp() {
        sms = new Sms("Dzisiaj, jest sobota, imieniny kota.");
    }

    @Test
    public void shouldCanChange() {
        Assertions.assertThat(sms.zmien("Dzisiaj, jest sobota, imieniny kota.")).isEqualTo("Dzisiaj,JestSobota,ImieninyKota.");

    }
}