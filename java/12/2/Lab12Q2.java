import java.io.*;

public class Lab12Q2 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the path of first file: ");
            String firstFilePath = reader.readLine();
            System.out.print("Enter the path of second file: ");
            String secondFilePath = reader.readLine();

            FileInputStream firstFileStream = new FileInputStream(firstFilePath);
            FileInputStream secondFileStream = new FileInputStream(secondFilePath);

            int bytePosition = 0;
            int firstByte, secondByte=0;

            while ((firstByte = firstFileStream.read()) != -1 && (secondByte = secondFileStream.read()) != -1) {
                if (firstByte != secondByte) {
                    System.out.println("Files differ at byte position: " + bytePosition);
                    break;
                }
                bytePosition++;
            }

            if ( firstByte == -1 && secondByte == -1) {
                System.out.println("Files are identical.");
            }

            firstFileStream.close();
            secondFileStream.close();

        } catch (IOException e) {
            System.out.println("An error occurred while comparing the files.");
            e.printStackTrace();
        }
    }
}
