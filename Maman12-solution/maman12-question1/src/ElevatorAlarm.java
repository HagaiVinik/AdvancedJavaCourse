public class ElevatorAlarm extends Alarm
{
    private int floor;
    public ElevatorAlarm(String address, int floor)
    {
        super(address, "");

        this.floor = floor;
    }

    @Override
    public void action()
    {
        super.action();
        System.out.println("floor: " + floor);
    }

    void reset()
    {
        this.floor = 0;
    }
}
