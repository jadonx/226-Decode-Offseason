package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Spindexer {
    private CRServo spindexerServo;
    private double currentPower = 0;

    public Spindexer(HardwareMap hardwareMap) {
        spindexerServo = hardwareMap.get(CRServo.class, Constants.HMServospinDexer);
        spindexerServo.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void setPower(double power) {
        spindexerServo.setPower(power);
    }
    public void stop() {
        spindexerServo.setPower(0);
    }
}