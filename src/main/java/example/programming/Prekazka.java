package example.programming;

import ev3dev.actuators.lego.motors.EV3LargeRegulatedMotor;
import ev3dev.sensors.ev3.EV3UltrasonicSensor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.utility.Delay;

public class Prekazka {
   static EV3UltrasonicSensor sensor = new EV3UltrasonicSensor(SensorPort.S4);
   static EV3LargeRegulatedMotor motorVLevo = new EV3LargeRegulatedMotor(MotorPort.B);
   static EV3LargeRegulatedMotor motorVPravo = new EV3LargeRegulatedMotor(MotorPort.C);
    public static void main(String[] args) {

     for (int i = 0;i < 5;i++)
     {
         JedVpred();
        if (JeTamPrekazka()== true)
        {
            ZastavCouvniOtoc();
            motorVLevo.stop();
            motorVPravo.stop();
        }


     }
        motorVLevo.stop();
        motorVPravo.stop();


    }

    private static void JedVpred() {
        motorVLevo.setSpeed(200);
        motorVPravo.setSpeed(200);

        motorVLevo.forward();
        motorVPravo.forward();

    }

    private static boolean JeTamPrekazka() {

        float[] pole = new float[sensor.sampleSize()];


            sensor.fetchSample(pole, 0);
            System.out.println("vzdálenost:" + pole[0]);
        return pole[0] < 15;
    }
    private static void ZastavCouvniOtoc() {
        //motorVLevo.stop();
        //motorVPravo.stop();

        motorVLevo.backward();
        motorVPravo.backward();

        Delay.msDelay(1000);

        motorVLevo.rotate(365, true);
        System.out.println("R1");
        motorVPravo.rotate(-365, false);
        System.out.println("R2");
        //motorVLevo.rotate(202, true);
        //motorVPravo.rotate(-202, false);
        motorVLevo.stop();
        motorVPravo.stop();

    }

}
