import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class q4 {

    public static void main(String[] args) throws IOException {
        String filePath = "input.txt"; // replace with your file path

        BufferedReader reader = FileReader(filePath);

        String longestWord = "";
        String line = reader.readLine();
        while (line != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            line = reader.readLine();
        }

        reader.close();

        System.out.println("The longest word in the file is: " + longestWord);
    }
}