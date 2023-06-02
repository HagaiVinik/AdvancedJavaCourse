public class Cashier
{
    private double balance;
    private Bill bill;
    public Cashier(){}

    public Cashier(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void startBill()
    {
        bill = new Bill();
    }

    public void addToBill(BuyItem buyItem)
    {
        if (bill != null)
        {
            bill.addToBill(buyItem);
        }
    }

    public void printBill()
    {
        System.out.println(bill);
    }
    public double getPayment(double amount)
    {
        System.out.println("Got payed:    " + Double.toString(amount));
        balance = balance + bill.getTotalCost();

        if (amount > bill.getTotalCost())
        {
            double change = amount - bill.getTotalCost();
            System.out.println("Change is:    " + Double.toString(change));
            return change;
        }

        bill = null;
        return 0;
    }

}
