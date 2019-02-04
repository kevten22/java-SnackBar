package snackbarApp;

public class Main{
    private static void customerInteraction(){
       Customer c1 = new Customer("Jane", 45.25);
       Customer c2 = new Customer("Bob", 33.14);

       VendingMachine v1 = new VendingMachine("Food");
       VendingMachine v2 = new VendingMachine("Drink");
       VendingMachine v3 = new VendingMachine("Office");

       Snack s1 = new Snack("Chips", 36, 1.75, v1.id);
       Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.id);
       Snack s3 = new Snack("Pretzel", 30, 2.00, v1.id);
       Snack s4 = new Snack("Soda", 24, 2.50, v2.id);
       Snack s5 = new Snack("Water", 20, 2.75, v2.id);

       System.out.println("*** Customer Interaction ***")

       c1.purchase(s4.totalCost(4));
       s4.buySnack(4);
       System.out.println("Customer 1 buys 3 of snack 4."
                            + c1.getName() + "remaining cash: " + c1.getCashOnHand()
                            + " " + s4.getName() + "remaining: " + s4.getQuantity() + "\n");

       c1.purchase(s3.totalCost(1));
       s3.buySnack(1);
       System.out.println("Customer 1 buys 1 of snack 3."
                            + c1.getName() + "remaining cash: " + c1.getCashOnHand()
                            + " " + s3.getName() + "remaining: " + s3.getQuantity() + "\n");

       c2.purchase(s4.totalCost(2));
       s4.buySnack(2);
       System.out.println("Customer 2 buys 2 of snack 4."
                            + c2.getName() + "remaining cash: " + c2.getCashOnHand()
                            + " " + s4.getName() + "remaining: " + s4.getQuantity() + "\n");

       c1.addCash(10.00);
       System.out.println(c1.getName() + " found $10 and now has $" + c1.getCashOnHand() + "\n");

       c1.purchase(s2.totalCost(1));
       s2.buySnack(1);
       System.out.println("Customer 1 buys 1 of snack 2."
                            + c1.getName() + "remaining cash: " + c1.getCashOnHand()
                            + " " + s2.getName() + "remaining: " + s2.getQuantity() + "\n");

       s3.addQuantity(12);
       System.out.println(s3.getName() " added 12 more and now has " + s3.getQuantity());

       c2.purchase(s3.totalCost(3));
       s3.buySnack(3);
       System.out.println("Customer 2 buys 3 of snack 3."
                            + c2.getName() + "remaining cash: " + c2.getCashOnHand()
                            + " " + s3.getName() + "remaining: " + s3.getQuantity() + "\n");


    }
    public static void main(String[] args){
        customerInteraction();
    }
}