package com.anderfred;

import java.io.*;

public class WriteInFile {
    public void write(){
        File file = new File("file.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            String line;
            while (!(line = bufferedReader.readLine()).equals("exit")) {
                bufferedWriter.write(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
