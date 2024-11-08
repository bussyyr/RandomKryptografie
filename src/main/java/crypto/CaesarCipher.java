package crypto;

import java.io.*;

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        String input = "/Users/buseokcu/Downloads/RandomKryptografie/src/main/java/text_files/input.txt";
        String output = "/Users/buseokcu/Downloads/RandomKryptografie/src/main/java/results/caesar_cipher_output.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(input))){
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));
            String read;

            while((read = reader.readLine()) != null){
                String encryptedLine = encryptLine(read, 3);
                writer.write(encryptedLine);
                writer.newLine();
            }
            System.out.println("Successfully encrypted!");
            writer.close();
        }
    }

    private static String encryptLine(String line, int shift){
        StringBuilder encrypted = new StringBuilder();

        for (char c : line.toCharArray()) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                char base = (c >= 'A' && c <= 'Z') ? 'A' : 'a';
                char shifted = (char) ((c - base + shift) % 26 + base);
                encrypted.append(shifted);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }
}
