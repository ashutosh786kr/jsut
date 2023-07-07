import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class q3 {

    public static void main(String[] args) throws IOException {
        String inputFilePath = "input.txt"; // replace with your input file path
        String outputFilePath = "output.txt"; // replace with your output file path

        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        FileWriter writer = new FileWriter(outputFilePath);

        String line = reader.readLine();
        while (line != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (!word.isEmpty()) {
                    char firstChar = Character.toUpperCase(word.charAt(0));
                    String capitalizedWord = firstChar + word.substring(1);
                    writer.write(capitalizedWord + " ");
                }
            }
            writer.write("\n");
            line = reader.readLine();
        }

        reader.close();
        writer.close();
    }
}