import java.util.Scanner;
class Converter{
    public static Wall stringToWall(String sourceString){

        Scanner scanner=new Scanner(sourceString);
        scanner.useDelimiter(",");

        String type=scanner.next();
        scanner.next();
        int id=Integer.parseInt(scanner.next());

        String[] startPointInput={scanner.next(),scanner.next(),scanner.next()};
        Point startPoint=stringsToPoint(startPointInput);

        String[] endPointInput={scanner.next(),scanner.next(),scanner.next()};
        Point endPoint=stringsToPoint(endPointInput);

        String[] directionPointInput={scanner.next(),scanner.next(),scanner.next()};
        Point directionPoint=stringsToPoint(directionPointInput);

        double length=stringToLength(scanner.next());

        return new Wall(type,id,startPoint,endPoint,length);
    }
    public static Point stringsToPoint(String[] lines){
        double[] numbers=new double[3];
        for(int i=0;i<3;i++){
            String line=lines[i];
            int startIndex=line.lastIndexOf(""+(char)61)+2;
            String text=line.substring(startIndex,line.length());
            int len = text.length();
            if(text.substring(len-1,len).equals(")"))
                text=text.substring(0,len-1);
            numbers[i]=Double.parseDouble(text);
        }
        return new Point(numbers[0],numbers[1],numbers[2]);
    }
    public static double stringToLength(String line){
        int start=line.indexOf("=")+2;
        String text=line.substring(start,line.length()-2);
        return Double.parseDouble(text);
    }
}