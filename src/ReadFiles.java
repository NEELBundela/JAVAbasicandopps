import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args) {
        //BufferedReader + FileReader : best for reading text files line-by-line

        String filepath = "C:\\Users\\Neel\\OneDrive\\Desktop\\test2.txt";


        try(BufferedReader reader = new BufferedReader(new FileReader(filepath));){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("That file exists");
        }
        catch (FileNotFoundException e){
            System.out.println("could not locate file");
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong");
        }
    }
}
