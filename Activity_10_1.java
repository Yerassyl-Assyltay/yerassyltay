import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
public class ex20_1 {

    public static void main(String... args) {
        ex20_1 exercise2001 = new ex20_1();
        File file = new File("Yerassyl.txt");
        try {
            file = exercise2001.getFileFromResources();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(":(" + " " + e.getLocalizedMessage());
        }

        List<String> words = new ArrayList<>();

        try (Scanner fileInput = new Scanner(file)) {
            while (fileInput.hasNext()) {
                words.add(fileInput.next());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(words);
        System.out.println(words);
    }

    private File getFileFromResources() throws URISyntaxException, FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resourceFile = classLoader.getResource("Yerassyl.txt");
        if (resourceFile == null) {
            System.out.println("File Not Found");
            throw new FileNotFoundException("File not found");
        }
        return new File(resourceFile.toURI());
    }
}
