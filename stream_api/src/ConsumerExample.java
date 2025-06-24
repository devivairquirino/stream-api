import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        Consumer<Integer> imprimirNumeroPar = num -> {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        };

        numeros.forEach(num -> {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        });

        // usando Consumer
        numeros.forEach(imprimirNumeroPar);
    }
}
