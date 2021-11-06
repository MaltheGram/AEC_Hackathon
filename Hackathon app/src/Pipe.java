public class Pipe{
    private String type;
    private int id;
    private double length;
    private Point startPoint;
    private Point endPoint;

    public Pipe(String type, int id, Point startPoint, Point endPoint, double length){
        this.type = type;
        this.id = id;
        this.length = length;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", length=" + length +
                ", startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public double getLength() {
        return length;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }
}
