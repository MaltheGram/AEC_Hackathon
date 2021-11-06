public class Wall
{
    private String type;
    private int id;
    private double length;
    private Point startPoint;
    private Point endPoint;

    public Wall(String type, int id, Point startPoint, Point endPoint, double length)
    {
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
}

