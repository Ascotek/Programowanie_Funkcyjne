package cwiczenia;
/*W celu zaoszczędzenia ilości znaków w SMSachnie
piszesię spacji, akażdywyraz rozpoczynasię wielką
literą.
• Wczytaj treść SMSa z konsoli wprogramie
(System.in) i tam też wyświetlrezultat.
• Przykład:
• Wejście: Dzisiajjest sobota, imieniny kota.
• Wyjście: DzisiajJestSobota,ImieninyKota*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Sms {

    String sms;

    public Sms(String sms) {
        this.sms = sms;
    }

    public String getSms() {
        return sms;
    }

    @Override
    public String toString() {
        return "Sms{" +
                "sms='" + sms + '\'' +
                '}';
    }

    public void odczyt() {
        Scanner odczyt = new Scanner(System.in);
        System.out.println();
        sms = odczyt.nextLine();
    }

    public String zmien(String sms) {
        return Arrays.stream(sms.split(" "))
                .map(element -> element.substring(0, 1).toUpperCase() + element.substring(1))
                .collect(Collectors.joining());
    }
}


