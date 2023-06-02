public class SmokeAlarm extends Alarm
{
    public SmokeAlarm(String address, String operatorName) throws BadAlarm {
        super(address, operatorName);

        if (address == null)
        {
            //throw BadAlarm
            throw new BadAlarm("Address is null");
        }
    }
}
