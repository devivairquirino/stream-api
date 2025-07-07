import java.util.Arrays;
import java.util.List;

public class FunctionExample {
    static List<String> nomes= Arrays.asList("ivair","kethellen","emanuel");

    static List<String> nomesUpperCase= nomes.stream().map(n -> n.toUpperCase()).toList();

    public static void main(String[] args) {
        System.out.println(nomesUpperCase);
    }
}
