public class FireAlarm extends Alarm
{
    private boolean active;
    public FireAlarm(String address, String operatorName)
    {
        super(address, operatorName);
        this.active = true;

    }

    @Override
    public void action()
    {
        super.action();
        this.active = false;
    }
}
