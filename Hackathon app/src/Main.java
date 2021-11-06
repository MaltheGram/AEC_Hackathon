import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        String filePath="/Users/Thor/IdeaProjects/AEC_Hackathon/Hackathon app/src/AEC_Hackathon_Fix Revit.csv";
        ArrayList<String> fileLines=FileReader.fileToStringList(filePath);
        ArrayList<Wall> walls=new ArrayList<>();
        fileLines.remove(0);
        for(String line:fileLines) {
            Wall wall=Converter.stringToWall(line);
            System.out.println(wall);
            walls.add(wall);
        }
    }
}
