package kz.attractor.java.lesson44.FileManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import kz.attractor.java.lesson44.Book;
import kz.attractor.java.lesson44.Employees;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class FileService {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
//    private static Path PATH = Paths.get("src/kz/attractor/java/lesson44/utilities/employees.json");

    public static ArrayList<Employees> readFileEmployee() {
        Path PATH = Paths.get("src/kz/attractor/java/lesson44/utilities/employees.json");
        String json = "";
        try(FileReader fr = new FileReader(String.valueOf(PATH))){

            int c;
            while((c=fr.read()) != -1){

                json += (char)c;

            }
            return GSON.fromJson(json,  new TypeToken<ArrayList<Employees>>(){}.getType());
        }   catch(IOException e){
            e.printStackTrace();
        }
        return new ArrayList<Employees>();
    }
    public static ArrayList<Book> readFileBook() {
        Path PATH_BOOK = Paths.get("src/kz/attractor/java/lesson44/utilities/books.json");
        String json = "";
        try(FileReader fr = new FileReader(String.valueOf(PATH_BOOK))){
            int c;
            while((c=fr.read()) != -1){
                json += (char)c;
            }
            return GSON.fromJson(json,  new TypeToken<ArrayList<Book>>(){}.getType());
        }   catch(IOException e){
            e.printStackTrace();
        }
        return new ArrayList<Book>();
    }
}
