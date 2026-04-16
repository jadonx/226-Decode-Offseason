package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class SpindexerTest extends LinearOpMode {

    @Override
    public void runOpMode() {
        Spindexer spindexer = new Spindexer(hardwareMap);
        waitForStart();
        while (opModeIsActive()) {
            if (gamepad1.a) {
                spindexer.setPower(0.4);
            } else if (gamepad1.b) {
                spindexer.setPower(-0.4);
            } else {
                spindexer.stop();
            }

            telemetry.update();
        }
    }
}
