package Stream;

import java.util.Random;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Pattern.compile(",").splitAsStream("Ala,ma,kota").forEach(System.out::println);

        new Random().longs().limit(10).forEach(System.out::println);
    }
}
