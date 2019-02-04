package snackbarApp;

public class Customer{
    private static int maxId = 0;
    private int id;
    private string name;
    private double cashOnHand;


    public Customer(String name, double cashOnHand){
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getName(){
        return name;
    }

    public void addCash(double cash){
        this.cashOnHand += cash;
    }

    public void purchase(double cash){
        this.cashOnHand -= cash;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }
}