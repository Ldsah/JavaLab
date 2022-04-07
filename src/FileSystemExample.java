import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javafx.collections.*;

public class FileSystemExample {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            String searchString = scanner.nextLine();
            BufferedReader br = new BufferedReader(new FileReader("/home/vlada/тэги"));
            String line = br.readLine();

            while (line != null){
                if(line.contains(searchString)){
                    System.out.println(">>>" + line);
                }
                line = br.readLine();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
