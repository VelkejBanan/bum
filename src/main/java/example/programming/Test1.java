package example.programming;

import ev3dev.sensors.ev3.EV3UltrasonicSensor;
import lejos.hardware.port.SensorPort;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class Test1 {
    public static void main(String[] args) {
        EV3UltrasonicSensor sensor = new EV3UltrasonicSensor(SensorPort.S4);

        float[] pole = new float[sensor.sampleSize()];

        for (int i = 0;i < 50;i++)
        {
            sensor.fetchSample(pole, 0);
            System.out.println("vzdálenost:" + pole[0]);
            Delay.msDelay(500);
        }
    }
}
