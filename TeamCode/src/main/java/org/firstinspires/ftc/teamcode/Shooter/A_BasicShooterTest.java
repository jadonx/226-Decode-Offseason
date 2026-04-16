package org.firstinspires.ftc.teamcode.Shooter;


import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Constants;

@Config // We use @Config so we can access the program in FTCDashboard
@TeleOp(name="BasicShooterTest")
public class A_BasicShooterTest extends OpMode {
    // These are the two shooter motors on the bot
    DcMotor shooter1, shooter2;

    public static double power; // We use public static so FTCDashboard allows to change the variable

    FtcDashboard dashboard;
    TelemetryPacket packet;

    @Override
    public void init() {
        shooter1 = hardwareMap.get(DcMotor.class, Constants.HMMotorShooter1);
        shooter2 = hardwareMap.get(DcMotor.class, Constants.HMMotorShooter2);

        dashboard = FtcDashboard.getInstance();
        packet = new TelemetryPacket();
    }

    @Override
    public void loop() {
        // TODO: Add the lines to set the power of shooter1 and shooter2 using the "power" variable


        packet.put("shooter1 current pos ", shooter1.getCurrentPosition());
        packet.put("shooter2 current pos ", shooter2.getCurrentPosition());
        dashboard.sendTelemetryPacket(packet);
    }
}
