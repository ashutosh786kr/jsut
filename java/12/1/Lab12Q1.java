import java.io.*;

import java.util.*;;

public class Lab12Q1 {
    public static void main(String[] args) {
        try {

            java.util.Scanner sc = new Scanner(System.in);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter source file name: ");
            String sourceFileName = sc.nextLine();
            System.out.print("Enter destination file name: ");
            String destFileName = reader.readLine();
            
            FileReader readerFile = new FileReader(sourceFileName);
            FileWriter writerFile = new FileWriter(destFileName);
            
            int ch;
            while((ch = readerFile.read()) != -1) {
                writerFile.write(ch);
            }
            
            readerFile.close();
            writerFile.close();
            
            System.out.println("File copied successfully.");
        } catch(IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
