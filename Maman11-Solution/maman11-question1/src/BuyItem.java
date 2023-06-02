public class BuyItem
{
    final private String itemName;
    final private double cost;

    public BuyItem(String itemName, double cost)
    {
        this.itemName = itemName;
        this.cost = cost;
    }

    public String getItemName()
    {
        return itemName;
    }
    public double getCost() {
        return cost;
    }
}
