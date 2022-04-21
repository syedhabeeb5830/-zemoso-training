package Assignment_11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class ReadWrite {
    static HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    public static void read(String str) throws IOException {
        FileReader fileReader = new FileReader(str);
        int i;
        while ((i = fileReader.read()) != -1) {
            if (!Character.isWhitespace((char) i)) {
                    map.put((char)i,map.getOrDefault((char)i, 0)+1);
            }
        }
    }
    public static void write() throws IOException {
        File file = new File("/home/syedU/Desktop/result.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(map.toString());
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        String readFile =args[0];
        read(readFile);
        write();
    }

}




