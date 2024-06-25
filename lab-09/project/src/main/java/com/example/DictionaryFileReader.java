package com.example;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DictionaryFileReader {
    private String filePath;
    public DictionaryFileReader(String filePath){
        this.filePath = filePath;
    }
    public String getRawFileData()throws IOException {
        Path path = Paths.get(filePath);

        String read = Files.readString(path);
        return read;
    }
    public List<DictionaryValue> getDictionaryValues() throws IOException {
        List<DictionaryValue> lista = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            int id = Integer.parseInt(parts[0]);
            int intKey = Integer.parseInt(parts[1]);
            String stringKey = parts[2];
            String value = parts[3];
            String enumerationName = parts[4];
            DictionaryValue dictionaryValue = new DictionaryValue(id, intKey, stringKey, value, enumerationName);
            lista.add(dictionaryValue);
        }
        return lista;
    }
}
