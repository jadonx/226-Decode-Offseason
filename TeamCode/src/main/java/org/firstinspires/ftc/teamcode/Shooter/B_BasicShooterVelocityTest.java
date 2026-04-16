package org.firstinspires.ftc.teamcode.Shooter;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Config
@TeleOp(name="BasicShooterVelocityTest")
public class B_BasicShooterVelocityTest extends OpMode {
    // TODO: Create two DcMotor objects for the two shooter motors


    // TODO: Create a public static variable named targetVelocity, we will change this in FtcDashboard


    FtcDashboard dashboard;
    TelemetryPacket packet;

    @Override
    public void init() {
        // TODO: Initialize the two shooter motors with hardwareMap.get()


        // TODO: Set the mode of the motor to RUN_USING_ENCODER
        // This allows the motor to use its internal encoder to its position/speed
        // Hint: Search up "how to use setvelocity ftc"



        dashboard = FtcDashboard.getInstance();
        packet = new TelemetryPacket();
    }

    @Override
    public void loop() {
        // TODO: Add the lines to set the velocity of shooter1 and shooter2 using the "targetVelocity" variable


        // TODO: Change the packet.put() methods to send the correct velocities to FtcDashboard
        packet.put("shooter1 current vel ", 0);
        packet.put("shooter2 current vel ", 0);
        dashboard.sendTelemetryPacket(packet);
    }
}
