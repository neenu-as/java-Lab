import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Read{
    public static void main(String[] args){
        try {
            FileWriter writer =new FileWriter("Read.txt",true);
            writer.write("new file is created");
            writer.close();
            FileReader reader=new FileReader("Read.txt");
            BufferedReader br=new BufferedReader(reader);
            String line;
            System.out.println("data read from the file");
            while ((line=br.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
         } catch (IOException e) {
             System.out.println("error.....");
         }
    }
}               
