import java.util.ArrayList;

public class BigInt
{
    private boolean sign;
    private ArrayList<Short> bigNumber;
    public BigInt(String number)
    {
        bigNumber = new ArrayList<Short>();
        int index = 0;

        if (number.charAt(0) == '-')
        {
            this.sign = false;
            index = 1;
        }
        else
        {
            this.sign = true;
        }

        for (int i = index; i < number.length(); i++)
        {
            char digit = number.charAt(i);
            if (!Character.isDigit(digit))
            {
                throw new IllegalArgumentException("The string that was provided is not a number");
            }

            short digitShort = (short)number.charAt(i);
            bigNumber.add(digitShort);
        }
    }

    public void plus()
    {

    }
}
