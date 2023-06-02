import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Alarm> alarmsArr = new ArrayList<Alarm>();
        try
        {
            alarmsArr.add(new SmokeAlarm("Rotchild 17, Tel Aviv", "Hagai"));
            alarmsArr.add(new SmokeAlarm("Bialik 17, Ramat Gan", "David"));
            alarmsArr.add(new SmokeAlarm("shazar 5, Givataim", "Moshe"));
        }
        catch (BadAlarm ex)
        {
            System.out.println(ex.getMessage());
        }

        alarmsArr.add(new ElevatorAlarm("Yahalom 10 Petach Tikva", 4));
        alarmsArr.add(new ElevatorAlarm("Hatavor 12 Rishon Lezion", 2));
        alarmsArr.add(new ElevatorAlarm("Yona Hanavi 4 Rehovot", 5));

        alarmsArr.add(new FireAlarm("Adar 7, Haifa", "Hagai"));
        alarmsArr.add(new FireAlarm("Herzel 3, Hadera", "Hagai"));

        TestAlarms.process(alarmsArr);
    }
}