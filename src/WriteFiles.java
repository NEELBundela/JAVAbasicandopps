import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {

        //String filepath = "C:\\Users\\Neel\\OneDrive\\Desktop\\test.txt"
        //String textcontent = ""My name is Neel \nMy age is 20"
        String txt = """
                My name is Neel
                I have completed BCA
                My age is 20
                """;

        try(FileWriter writer = new FileWriter("C:\\Users\\Neel\\OneDrive\\Desktop\\test.txt")) {
            writer.write(txt);
            System.out.println("file has been written");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("could not locate file location");
        }
        catch (IOException e)
        {
            System.out.println("could not write file");
        }
    }
}
