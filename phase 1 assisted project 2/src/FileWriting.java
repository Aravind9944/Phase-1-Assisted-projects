import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
 
public class FileWriting
{
    public static void main(String arg[])
    {
 
        String fileContent = "Hello Java ";
 
        try 
        {
            Path path = Paths.get("samplefile.txt");
            Files.write(path, fileContent.getBytes());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
