package homework_5.task_2;

import java.util.Arrays;

// +
public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(new Rack[]{
                new Rack(2, 1, 2, "book"),
                new Rack(5, 2, 2, "box"),
                new Rack(4, 3, 2, "things")
        });
        System.out.println(Arrays.toString(warehouse.getArray()));
    }
}
