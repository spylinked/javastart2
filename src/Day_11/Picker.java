package Day_11;

public class Picker implements Worker{
    private String name;
    private int salary;
    private Warehouse warehouse;
    private static final String TYPE = "Сборщик";

    public String getName() {
        return name;
    }

    public String getType() {
        return this.TYPE;
    }

    public int getSalary() {
        return salary;
    }

    public Picker(String name) {
        this.name = name;
    }

    public void assignToWarehouse(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        this.salary = this.salary+80;
        warehouse.setCountOrder(warehouse.getCountOrder()+1);
        //System.out.println(this.getName() + " поработал.");
    }

    @Override
    public void bonus() {
        this.salary = this.salary*3;
    }
}
