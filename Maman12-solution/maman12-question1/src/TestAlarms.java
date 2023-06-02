import java.util.ArrayList;

public class TestAlarms
{
    public static void process(ArrayList<Alarm> alarmsArr)
    {
        int smokeCounter = 0;

        for (Alarm alarm : alarmsArr)
        {
            if (alarm instanceof SmokeAlarm)
            {
                smokeCounter++;
                SmokeAlarm sa = (SmokeAlarm)alarm;
                sa.action();
            }
            else if (alarm instanceof FireAlarm)
            {
                FireAlarm fireAlarm = (FireAlarm)alarm;
                fireAlarm.action();
            }
            else if (alarm instanceof ElevatorAlarm)
            {
                ElevatorAlarm elevatorAlarm = (ElevatorAlarm)alarm;
                elevatorAlarm.action();
                elevatorAlarm.reset();
            }
        }

        System.out.println("Number of smoke alarms: " + smokeCounter);
    }
}
