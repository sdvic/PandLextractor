package org.jointheleague.robocamp2016roombabaseline;

/**
 * Created by VicMini on 3/31/16.
 */
import android.os.SystemClock;

import ioio.lib.api.IOIO;
import ioio.lib.api.exception.ConnectionLostException;
import org.jointheleague.erik.irobot.IRobotCreateAdapter;
import org.jointheleague.erik.irobot.IRobotCreateInterface;
import org.jointheleague.iaroc.sensors.UltraSonicSensors;

public class Brain extends IRobotCreateAdapter {
    private final Dashboard dashboard;
    public UltraSonicSensor sonar;

    public Brain(IOIO ioio, IRobotCreateInterface create, Dashboard dashboard)
            throws ConnectionLostException {
        super(create);
        sonar = new UltraSonicSensor(ioio, dashboard);
        this.dashboard = dashboard;
    }

    /* This method is executed when the robot first starts up. */
    public void initialize() throws ConnectionLostException {
        dashboard.log("Initialize complete");
    }
    /* This method is called repeatedly. */
    public void loop() throws ConnectionLostException, InterruptedException
    {
        try
        {
            sonar.readRight();
            dashboard.log(sonar.getRightDistance() + "");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        SystemClock.sleep(500);
    }
}
