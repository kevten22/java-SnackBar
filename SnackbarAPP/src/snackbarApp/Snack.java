package snackbarApp;

public class Snack{
    private static int maxId = 0;
    private int id;
    private string name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId ){
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantiy;
        this.cost = cost;
        this vendingMachineId = vendingMachineId;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getQuantity(){
        return quantity;
    }

    public void addQuantity(int quantity){
        this.quantiy += quantity;
    }

    public void buySnack(int quantity){
        this.quantity -= quantity;
    }

    public double getTotalCost(int quantity){
        return quantity*cost;
    }
}