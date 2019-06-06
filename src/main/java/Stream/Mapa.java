package Stream;
/*
Stwórz mapę typu <Sting, String>. Następnie za pomocą lambdy
dwuargumentowej wypisz elementy key oraz value
**/

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> arg = new HashMap<>();

        arg.put("Kasia", "Boni");
        arg.put("Basia", "Boni");
        arg.put("Asia", "Boni");
        arg.put("Jola", "Boni");
        arg.put("Monika", "Boni");



        //arg.forEach((key,value)->System.out.println(key + " " + value));


    }
}
