import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.util.ArrayList;

public class Main
{
    final static double minRoomHeight=2300;
    static JFrame window;
    public static void main(String[] args){
        //ArrayList<Wall> walls=getWalls();
        //ArrayList<Pipe> pipes=getPipes();
        makeFilereadWindow();
        //makeMessageWindow();
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

    public static void makeFilereadWindow(){

        JLabel label=new JLabel("Enter filepath:");

        JButton checkButton=new JButton();
        checkButton.setText("Check");

        JPanel panel=new JPanel();
        panel.add(label);
        panel.add(new JTextField(20));
        panel.add(checkButton);


        JFrame frame=new JFrame("Check Regulations");
        frame.add(panel);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void makeMessageWindow(){
        JPanel middlePanel = new JPanel ();
        middlePanel.setBorder ( new TitledBorder( new EtchedBorder(), "Messages" ) );
        JTextArea display = new JTextArea ( 16, 58 );
        String allText="";
        for(int i=1;i<=50;i++) allText+=("Error "+i+" ").repeat(15)+"\n";
        display.setText(allText);
        display.setEditable ( false );
        JScrollPane scroll = new JScrollPane ( display );
        scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

        middlePanel.add ( scroll );

        JFrame frame = new JFrame ();
        frame.add ( middlePanel );
        frame.pack();
        frame.setLocationRelativeTo ( null );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible ( true );
    }
}
