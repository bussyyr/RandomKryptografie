package crypto;

import java.io.*;

public class VigenereCipher {
    public static void main(String[] args) throws IOException {
        String input = "/Users/buseokcu/Downloads/RandomKryptografie/src/main/java/krypto/input.txt";
        String output = "/Users/buseokcu/Downloads/RandomKryptografie/src/main/java/krypto/vigenere_cipher_output.txt";
        String keyword = "BUS";

        try(BufferedReader reader = new BufferedReader(new FileReader(input))){
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));
            String read;

            while((read = reader.readLine()) != null){
                String encryptedLine = encryptLine(read, keyword);
                writer.write(encryptedLine);
                writer.newLine();
            }
            System.out.println("Successfully encrypted!");
            writer.close();
        }
    }

    private static String encryptLine(String line, String key){
        StringBuilder encrypted = new StringBuilder();
        int keywordIndex = 0;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                char k = key.charAt(keywordIndex % key.length());
                char shifted = (char) ((c - 'A' + (k - 'A')) % 26 + 'A');
                encrypted.append(shifted);
                keywordIndex++;
            }else if(c >= 'a' && c <= 'z') {
                char k = key.charAt(keywordIndex % key.length());
                char shifted = (char) ((c - 'a' + (Character.toUpperCase(k) - 'A')) % 26 + 'a');
                encrypted.append(shifted);
                keywordIndex++;
            }else{
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }
}
