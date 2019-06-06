package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
Stwórz listę napisów
Następnie przy pomocy stream() oraz collect() zrób konkatenację wszystkich
napisów na liście oddzielonych spacją.
Wypisz skonkatenowany napis.

* Dla chętnych listę przekształcić w mapę:
Klucz – wartość napisu
Wartość – ilość wystąpień napisu na liście
*
* */

public class StreamEx {
    public static void main(String[] args) {

        List<String> wykaz = new ArrayList<>();

        wykaz.add("Kupilam chleb i masło");
        wykaz.add("Ala");
        wykaz.add("ser");
        wykaz.add("czekolada");
        wykaz.add("abacus");
        wykaz.add("abacus");
        wykaz.add("bułka");

//        wykaz.stream()
//                .collect(Collectors.toMap((element) -> element, String::length))
//                .forEach((k, v) -> System.out.println(k + ": " + v));

        wykaz.stream()
                .collect(Collectors.groupingBy(element -> element))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, element -> element.getValue().size()))
                .forEach((k, v) -> System.out.println(k + ": " + v));
//grupingBy pozwala na grupowanie na wejsciu ma funkcje element -> element

//        String.join(" ", wykaz);
//        System.out.println(wykaz);


//               wykaz.stream()
//                .filter(w -> w.startsWith("a")|| w.startsWith("A"))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);


//                .sorted()
//                .forEach(w -> System.out.println(w + " "+ w.length()));

    }


}
