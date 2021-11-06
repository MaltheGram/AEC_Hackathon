import java.util.ArrayList;

public class Main
{
    final static double minRoomHeight=2.3;
    public static void main(String[] args){
        ArrayList<Wall> walls=getWalls();
        //ArrayList<Pipe> pipes=getPipes();

    }
    public static ArrayList<Wall> getWalls(){
        String filePath="/Users/Thor/IdeaProjects/AEC_Hackathon/Hackathon app/src/AEC_Hackathon_Fix Revit.csv";
        ArrayList<String> fileLines=FileReader.fileToStringList(filePath);
        ArrayList<Wall> walls=new ArrayList<>();
        fileLines.remove(0);
        for(String line:fileLines) {
            Wall wall=Converter.stringToWall(line);
            //System.out.println(wall);
            walls.add(wall);
        }
        return walls;
    }
    public static ArrayList<Pipe> getPipes(){
        String filePath="/Users/Thor/IdeaProjects/AEC_Hackathon/Hackathon app/src/AEC hackathon Piping data .csv";
        ArrayList<String> fileLines=FileReader.fileToStringList(filePath);
        ArrayList<Pipe> pipes=new ArrayList<>();
        fileLines.remove(0);
        for(String line:fileLines) {
            Pipe pipe=Converter.stringToPipe(line);
            //System.out.println(pipe);
            pipes.add(pipe);
        }
        return pipes;
    }
}
