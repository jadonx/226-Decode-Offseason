package org.firstinspires.ftc.teamcode.Spindexer;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

// TODO: Add necessary headers to use this TeleOp program in FTC Dashboard
// Hint: What would a regular TeleOp program have here?
// Hint2: FTC Dashboard documentation (https://acmerobotics.github.io/ftc-dashboard/features)
public class A_BasicSpindexerPIDTest extends OpMode {
    Spindexer spindexer;

    FtcDashboard dashboard;
    TelemetryPacket packet;

    // TODO: Add a static variable named targetAngle which we will change in FTCDashboard (used during PID tuning)


    @Override
    public void init() {
        spindexer = new Spindexer(hardwareMap);

        dashboard = FtcDashboard.getInstance();
        packet = new TelemetryPacket();
    }

    @Override
    public void loop() {
        spindexer.update();

        // TODO: Call the setTargetAngle from the spindexer object to update the target angle


        // Here we will send important information to FTCDashboard like our current and target angles
        // TODO: Fill out the packet.put() methods to send the correct info to FTCDash
        packet.put("target angle ", 0);
        packet.put("current angle ", 0);
        dashboard.sendTelemetryPacket(packet);
    }
}
