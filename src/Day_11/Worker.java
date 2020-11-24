package Day_11;

public interface Worker {
    public void doWork();
    public void bonus();
    public String getName();
    public String getType();
    public int getSalary();
    public void assignToWarehouse(Warehouse warehouse);
}
