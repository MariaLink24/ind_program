package ru.miet.smirnovammpin31d;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try
        {
            Path file = Paths.get("src/ru/miet/smirnovammpin31d/test.txt");
            BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(file)));
            String line = "", oldtext = "";
            while((line = reader.readLine()) != null)
            {
                oldtext += line + "\r\n";
            }
            reader.close();
            String newtext = oldtext.replaceAll("\\b([A-Z]\\w*?)\\b | [0-9].*", "[censored]");
            FileWriter writer = new FileWriter("file.txt");
            writer.write(newtext);writer.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}