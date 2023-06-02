import java.util.ArrayList;

public class Bill
{
    private ArrayList<BuyItem> list;

    public Bill()
    {
        list = new ArrayList<>();
    }

    void addToBill(BuyItem buyItem)
    {
        list.add(buyItem);
    }

    double getTotalCost()
    {
        double total = 0;
        for (int i = 0; i < list.size(); i++)
        {
            total += list.get(i).getCost();
        }

        return total;
    }

    @Override
    public String toString()
    {

        String output = "";
        output = output.concat("\n--------------------\n");
        output = output.concat("Bill:");
        output = output.concat("\n--------------------\n");
        output = output.concat("Name:      Cost:\n");

        for (int i = 0; i < list.size(); i++)
        {
            output = output.concat(list.get(i).getItemName() + "       " + Double.toString(list.get(i).getCost()) + "\n");
        }

        output = output.concat("\n--------------------\n");
        output = output.concat("Total cost :  " + this.getTotalCost());
        output = output.concat("\n--------------------\n");
        return output;
    }
}
