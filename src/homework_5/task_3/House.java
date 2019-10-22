package homework_5.task_3;

public abstract class House implements Immovables {
    protected String street;
    protected int houseNumber;
    protected int apartmentNumber;
    protected int numOfFloor;
    protected int numOfTenants;

    public House(String street, int houseNumber, int apartmentNumber, int numOfFloor, int numOfTenants) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.numOfFloor = numOfFloor;
        this.numOfTenants = numOfTenants;
    }

    @Override
    public int getNumOfFloor() {
        return numOfFloor;
    }

    @Override
    public void onHeater() {
        System.out.println("warm as in summer");
    }

    @Override
    public int getNumOfCitizen() {
        return numOfTenants;
    }

    @Override
    public String toString() {
        return "House{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", apartmentNumber=" + apartmentNumber +
                ", numOfFloor=" + numOfFloor +
                ", numOfTenants=" + numOfTenants +
                '}';
    }
}
