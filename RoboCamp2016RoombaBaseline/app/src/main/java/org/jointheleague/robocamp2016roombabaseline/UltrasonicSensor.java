package org.jointheleague.robocamp2016roombabaseline;

/**
 * Created by VicMini on 3/31/16.
 */
/**************************************************************************
 * Simplified version 140512A by Erik  Super Happy Version
 * version 150624A AndroidStudio version for original Create Ultrasonics works
 * by Vic  Requires tri-state fix and ultrasonic jumpers for 4 pin ultrasonics
 **************************************************************************/

import ioio.lib.api.DigitalOutput;
import ioio.lib.api.IOIO;
import ioio.lib.api.PulseInput;
import ioio.lib.api.PulseInput.PulseMode;
import ioio.lib.api.exception.ConnectionLostException;
import android.os.SystemClock;


/**
 * An UltraSonicSensors instance is used to access three ultrasonic sensors
 * (leftInput, frontInput, and rightInput) and read the measurements from these
 * sensors. version 140427...modified by Vic...ultrasonics works using Ytai's
 * suggestions...cleaned up formatting
 *
 * @author Erik Colban
 */
public class UltraSonicSensor
{
    private static final float CONVERSION_FACTOR = 17280.0F; // cm/s
    private static int LEFT_ULTRASONIC_INPUT_PIN = 35;
    private static int FRONT_ULTRASONIC_INPUT_PIN = 36;
    private static int RIGHT_ULTRASONIC_INPUT_PIN = 18;
    private static final int LEFT_STROBE_ULTRASONIC_OUTPUT_PIN = 15;
    private static final int FRONT_STROBE_ULTRASONIC_OUTPUT_PIN = 16;
    private static final int RIGHT_STROBE_ULTRASONIC_OUTPUT_PIN = 17;
    private DigitalOutput leftStrobe;
    private DigitalOutput frontStrobe;
    private DigitalOutput rightStrobe;
    private volatile int leftDistance;
    private volatile int frontDistance;
    private volatile int rightDistance;
    private IOIO ioio;
    private PulseInput leftInput;
    private PulseInput frontInput;
    private PulseInput rightInput;
    private Dashboard dashboard;

    /**
     * Constructor of a UltraSonicSensors instance.
     *
     * @param ioio the IOIO instance used to communicate with the sensor
     * @throws ConnectionLostException
     */
    public UltraSonicSensor(IOIO ioio, Dashboard dashboard) throws ConnectionLostException
    {
        this.ioio = ioio;
        this.dashboard = dashboard;
        //this.leftStrobe = ioio.openDigitalOutput(LEFT_STROBE_ULTRASONIC_OUTPUT_PIN);
        //this.rightStrobe = ioio.openDigitalOutput(RIGHT_STROBE_ULTRASONIC_OUTPUT_PIN);
        this.rightStrobe = ioio.openDigitalOutput(15, DigitalOutput.Spec.Mode.NORMAL, true);
        //this.frontStrobe = ioio.openDigitalOutput(FRONT_STROBE_ULTRASONIC_OUTPUT_PIN);
        this.rightInput = ioio.openPulseInput(35, PulseMode.POSITIVE);
        dashboard.log("ioio constructor complete");
    }


    /**
     * Makes a reading of the ultrasonic sensors and stores the results locally.
     * To access these readings, use {@link #getLeftDistance()},
     * {@link #getFrontDistance()}, and {@link #getRightDistance()}.
     *
     * @throws ConnectionLostException
     * @throws InterruptedException
     */
    public void read() throws ConnectionLostException, InterruptedException
    {
//		leftDistance = read(leftStrobe, LEFT_ULTRASONIC_INPUT_PIN, leftInput);
//		frontDistance = read(frontStrobe, FRONT_ULTRASONIC_INPUT_PIN, frontInput);
        rightDistance = read(rightStrobe, RIGHT_ULTRASONIC_INPUT_PIN, rightInput);
    }


    private int read(DigitalOutput strobe, int inputPin, PulseInput input)
            throws ConnectionLostException, InterruptedException  // Order of following  statements is very important...do not change
    {
        int distance = 0;
        ioio.beginBatch();
        input = ioio.openPulseInput(inputPin, PulseMode.POSITIVE);
        strobe.write(false);
        strobe.write(true);
        strobe.write(false);
        distance = (int) (input.getDuration() * CONVERSION_FACTOR);
        ioio.endBatch();
        input.close();
        return distance;
    }

    public void readRight() throws ConnectionLostException, InterruptedException
    {//This code works with the 4-pin sensor...don't change anything!
        rightStrobe.write(true);
        SystemClock.sleep(10);
        rightStrobe.write(false);
        rightDistance = (int) (rightInput.getDuration() * CONVERSION_FACTOR);
    }

    public int getLeftDistance()
    {
        return leftDistance;
    }

    public int getFrontDistance()
    {

        return frontDistance;
    }

    public int getRightDistance()
    {
        return rightDistance;
    }
}

