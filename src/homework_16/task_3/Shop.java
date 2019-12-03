package homework_16.task_3;

public class Shop {
    private String name;
    private int numOfToys;

    public Shop(String name) {
        this.name = name;
    }

    // многовато пробелов между словами
    public  synchronized  void putToy(){
        numOfToys++;
    }

    public int getNumOfToys() {
        return numOfToys;
    }
}
