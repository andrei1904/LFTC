import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Reader {

    public List<String> readLexicalAtomsFromFile(String fileName) {

        List<String> result = new ArrayList<>();

        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String[] data = reader.nextLine().split(" ");
                for (String element : data) {
                    if (!element.equals("")) {
                        result.add(element);
                    }
                }
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found!");
        }

        return result;
    }
}
