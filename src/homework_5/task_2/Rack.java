package homework_5.task_2;

// +
public class Rack {
    private int shelf;
    private int length;
    private int height;
    private String content;

    public Rack(int shelf, int length, int height, String content) {
        this.shelf = shelf;
        this.length = length;
        this.height = height;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Rack{" +
                "shelf=" + shelf +
                ", length=" + length +
                ", height=" + height +
                ", content='" + content + '\'' +
                '}';
    }
}
