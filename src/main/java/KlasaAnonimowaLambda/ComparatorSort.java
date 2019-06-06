package KlasaAnonimowaLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;

public class ComparatorSort {

    public static void main(String[] args) {

        Predicate<String> predicate = slowa -> slowa.length() > 5;

        System.out.println(predicate.test("kot"));


        Function<String, Integer> converter = String::length;

        System.out.println(converter.apply("kot"));
        System.out.println(converter.apply("Mysz"));

        Object o = new Object();
        IntSupplier supplier = o::hashCode;

        System.out.println(supplier.getAsInt());
    }


    private List<String> lista = new ArrayList<String>();

    public ComparatorSort(List<String> lista) {
        this.lista = lista;
    }

    public void sort() {
        lista.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
    }

    public void sortWithLambda() {
        lista.sort((o1, o2) -> o1.compareToIgnoreCase(o2));
    }

    public List<String> getLista() {
        return lista;
    }
}
