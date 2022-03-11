package example.programming;

import ev3dev.actuators.lego.motors.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.utility.Delay;

public class NewBobob {
    public static void main(String[] args) {
        EV3LargeRegulatedMotor motorVLevo = new EV3LargeRegulatedMotor(MotorPort.B);
        EV3LargeRegulatedMotor motorVPravo = new EV3LargeRegulatedMotor(MotorPort.C);

        motorVLevo.setSpeed(200);
        motorVPravo.setSpeed(200);

        motorVLevo.forward();
        motorVPravo.forward();

        //Delay.msDelay(2000);

        motorVLevo.stop();
        motorVPravo.stop();

        double prumerkola = 5.5;
        double obvod = prumerkola * Math.PI;
        double delka = 100;
        double vysledek = delka/obvod;
        double vysledek2 = vysledek * 360;
        motorVLevo.rotate(2081,true);
        motorVPravo.rotate(2081, false);
        motorVLevo.rotate(202, true);
        motorVPravo.rotate(-202, false);

        motorVLevo.rotate(202,true);
        motorVPravo.rotate(-202, false);
        motorVLevo.rotate(2081, true);
        motorVPravo.rotate(2081, false);

        motorVLevo.rotate(202,true);
        motorVPravo.rotate(-202, false);
        motorVLevo.rotate(2081, true);
        motorVPravo.rotate(2081, false);

        motorVLevo.rotate(202,true);
        motorVPravo.rotate(-202, false);
        motorVLevo.rotate(2081, true);
        motorVPravo.rotate(2081, false);
    }
}
