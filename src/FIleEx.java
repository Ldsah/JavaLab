import java.io.FileNotFoundException;
import java.io.FileReader;

public class FIleEx {
    public static void main(String[] args) {
        try{
            System.out.println("Должен вывести на экран");
            FileReader fd = new FileReader("тэги");
            System.out.println("Не должен компилироваться");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
