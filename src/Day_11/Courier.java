package Day_11;

public class Courier implements Worker{
    private String name;
    private int salary;
    private Warehouse warehouse;
    private static final String TYPE = "Курьер";

    public String getName() {
        return name;
    }

    public String getType() {
        return TYPE;
    }

    public int getSalary() {
        return salary;
    }

    public Courier(String name) {
        this.name = name;
    }

    public void assignToWarehouse(Warehouse warehouse){
        this.warehouse = warehouse;
        this.warehouse.assignWorker(this);
    }

    @Override
    public void doWork() {
        this.salary = this.salary+100;
        warehouse.setBalance(warehouse.getBalance()+1000);
    }

    @Override
    public void bonus() {

    }
}
