package cwiczenia;

public class SmsMain {
    public static void main(String[] args) {
        Sms sms = new Sms("Dzisiaj, jest sobota, imieniny kota.");

        sms.odczyt();

        System.out.println(sms.zmien(sms.sms));


    }
}

