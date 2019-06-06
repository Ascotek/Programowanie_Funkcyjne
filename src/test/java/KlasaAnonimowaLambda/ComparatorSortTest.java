package KlasaAnonimowaLambda;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class ComparatorSortTest {
    ComparatorSort lista;

    @Before
    public void setUp(){
    lista = new ComparatorSort(Arrays.asList("Stoi", "na", "stacji", "lokomotywa"));
    }

    @Test
    public void shouldSortLista(){
        lista.sort();
        assertList();
    }



    @Test
    public void shouldSortListaWithLambda(){
        lista.sortWithLambda();
        assertList();

    }

    private void assertList() {
        List<String> sortedList = lista.getLista();
        assertEquals("lokomotywa", sortedList.get(0));
        assertEquals("na", sortedList.get(1));
        assertEquals("stacji", sortedList.get(2));
    }

}