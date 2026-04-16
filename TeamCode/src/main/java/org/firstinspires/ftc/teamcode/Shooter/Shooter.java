package org.firstinspires.ftc.teamcode.Shooter;

import com.qualcomm.robotcore.hardware.HardwareMap;

/*
This class will represent the shooter object
We use a class to encapsulate subsystems because it is more organized and easier to use
Instead of having all our robots code in one OpMode,
We can simply call shooter.update() to take care the shooter logic
 */
public class Shooter {
    // TODO: Add the motor objects for the shooter


    private double targetVelocity;
    private double currentVelocity;

    public Shooter(HardwareMap hardwareMap) {
        // TODO: Instantiate the shooter objects using hardwareMap

        // TODO: Set the correct mode for the shooter motors to use setVelocity
    }

    // We will call this method inside the loop() method in our TeleOp programs
    public void update() {
        // TODO: Update the velocity for both motors using the targetVelocity variable
    }

    // TODO: Update the targetVelocity instance variable, you may need to add parameters to this method!
    public void setTargetVelocity() {

    }

    // TODO: Return the targetVelocity of the shooter
    public double getTargetVelocity() {
        return 0.0;
    }

    // TODO: Return the current velocity of the shooter, you may need to average out values
    public double getCurrentVelocity() {
        return 0.0;
    }
}
