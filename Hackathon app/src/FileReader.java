import java.util.*;
import java.io.*;
public class FileReader
{
    public static ArrayList<String> fileToStringList(String filePath){
        try{
            Scanner scanner=new Scanner(new File(filePath));
            ArrayList<String> list=new ArrayList<>();
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                list.add(line);
            }
            return list;
        }catch (FileNotFoundException e){
            System.out.println("Error");
        }
        return null;
    }
}