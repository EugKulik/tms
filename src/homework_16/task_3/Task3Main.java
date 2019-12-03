package homework_16.task_3;

// +
public class Task3Main {
    final static int SCOPE_OF_SUPPLY1 = 100;
    final static int SCOPE_OF_SUPPLY2 = 50;

    public static void main(String[] args) {
        Shop shop = new Shop("Baby");
        Runnable provider1 = () -> {
            for (int i = 0; i < SCOPE_OF_SUPPLY1; i++) {
                shop.putToy();
            }
        };
        Runnable provider2 = () -> {
            for (int i = 0; i < SCOPE_OF_SUPPLY2; i++) {
                shop.putToy();
            }
        };

        Thread providerThread1 = new Thread(provider1);
        Thread providerThread2 = new Thread(provider2);

        providerThread1.start();
        providerThread2.start();

        try {
            providerThread1.join();
            providerThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(shop.getNumOfToys());
    }
}
