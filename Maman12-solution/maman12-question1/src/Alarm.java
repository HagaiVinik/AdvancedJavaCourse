import java.util.Date;

public class Alarm
{
    private String address;
    private String operatorName;
    private Date startingAlarmDate;

    public Alarm(String address, String operatorName)
    {
        this.address = address;
        this.operatorName = operatorName;
        this.startingAlarmDate = new Date();
    }

    public void action()
    {
        System.out.println("Alarm Details:");
        System.out.println("Address: " + this.address);
        System.out.println("Date: " + this.startingAlarmDate.toString());
        System.out.println("Operator Name: " + this.operatorName);
    }

}
