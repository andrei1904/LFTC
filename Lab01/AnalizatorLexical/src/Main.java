import java.util.List;

public class Main {
    public static void main(String[] args) {

        Reader reader = new Reader();

        List<String> result = reader.readLexicalAtomsFromFile("C:\\Fac\\Sem5\\LFTC\\Lab01\\suma.txt");

        result.forEach(System.out::println);

    }
}
