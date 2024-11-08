package crypto;

import java.io.*;

public class SimpleCryptographyWithBuffered{
    public static void main(String[] args) throws IOException {
        String input = "/Users/buseokcu/Downloads/RandomKryptografie/src/main/java/text_files/input.txt";
        String output = "/Users/buseokcu/Downloads/RandomKryptografie/src/main/java/results/simple_cryptography.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(input))){
            BufferedWriter writer = new BufferedWriter(new FileWriter(output));
            String read;

            while((read = reader.readLine()) != null){
                String encryptedLine = encryptLine(read);
                writer.write(encryptedLine);
                writer.newLine();
            }
            System.out.println("Successfully encrypted!");
            writer.close();
        }
    }


    private static String encryptLine(String line){
        StringBuilder encrypted = new StringBuilder();

        for (char c : line.toCharArray()) {
            encrypted.append(encryptCharacter(c));
        }

        return encrypted.toString();
    }

    private static char encryptCharacter(char c){
        switch (c) {
            case 'a': return 'm';
            case 'b': return 'n';
            case 'c': return 'o';
            case 'd': return 'p';
            case 'e': return 'q';
            case 'f': return 'r';
            case 'g': return 's';
            case 'h': return 't';
            case 'i': return 'u';
            case 'j': return 'v';
            case 'k': return 'w';
            case 'l': return 'x';
            case 'm': return 'y';
            case 'n': return 'z';
            case 'o': return 'a';
            case 'p': return 'b';
            case 'q': return 'c';
            case 'r': return 'd';
            case 's': return 'e';
            case 't': return 'f';
            case 'u': return 'g';
            case 'v': return 'h';
            case 'w': return 'i';
            case 'x': return 'j';
            case 'y': return 'k';
            case 'z': return 'l';
            // Büyük harfler
            case 'A': return 'M';
            case 'B': return 'N';
            case 'C': return 'O';
            case 'D': return 'P';
            case 'E': return 'Q';
            case 'F': return 'R';
            case 'G': return 'S';
            case 'H': return 'T';
            case 'I': return 'U';
            case 'J': return 'V';
            case 'K': return 'W';
            case 'L': return 'X';
            case 'M': return 'Y';
            case 'N': return 'Z';
            case 'O': return 'A';
            case 'P': return 'B';
            case 'Q': return 'C';
            case 'R': return 'D';
            case 'S': return 'E';
            case 'T': return 'F';
            case 'U': return 'G';
            case 'V': return 'H';
            case 'W': return 'I';
            case 'X': return 'J';
            case 'Y': return 'K';
            case 'Z': return 'L';
            // Diğer karakterler için değişiklik yapma
            default: return c;
        }
    }
}
