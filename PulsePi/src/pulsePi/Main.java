package pulsePi;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.GpioPinInput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Starting PulsePi 3/29/17");
		new Main().getGoing();
	}

	final void getGoing()
	{
		final GpioController gpio = GpioFactory.getInstance();
		final GpioPinDigitalOutput rightStrobe = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02);// pin 13
		final GpioPinInput rightEcho = gpio.provisionDigitalInputPin(RaspiPin.GPIO_05); // Echo...pin
		final GpioPinDigitalOutput leftStrobe = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01);//pin
		final GpioPinInput leftEcho = gpio.provisionDigitalInputPin(RaspiPin.GPIO_04); //pin 16
		final GpioPinDigitalOutput centerStrobe = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00);// pin 11
		final GpioPinInput centerEcho = gpio.provisionDigitalInputPin(RaspiPin.GPIO_03); // Echo...pin
		System.out.println("Starting /strobe");
		while (true)
		{
			try
			{
				System.out.print("c=>");
//				rightStrobe.low();
//				rightStrobe.high();
//				rightStrobe.low();
				// leftStrobe.low();
				// leftStrobe.high();
				// leftStrobe.low();
				 centerStrobe.low();
				 centerStrobe.high();
				 centerStrobe.low();
				Thread.sleep(100);
			}

			catch (InterruptedException e)
			{
				System.out.println("InterruptedException");
			}
		}
	}
}
