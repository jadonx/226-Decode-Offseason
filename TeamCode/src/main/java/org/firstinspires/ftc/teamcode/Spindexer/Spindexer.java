package org.firstinspires.ftc.teamcode.Spindexer;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.Constants;

@Config // Note: This is what allows us to change public static variables in FTC dashboard
public class Spindexer {
    private CRServo spindexer;
    private SpindexerEncoder spindexerEncoder;

    // TODO: Add public static variables kD, kP is already added
    public static double kP;

    // Here are other variables that are needed for PID calculation
    private double currentAngle;
    private double targetAngle;
    private double lastError;
    private ElapsedTime pidTimer;

    public Spindexer(HardwareMap hardwareMap) {
        spindexer = hardwareMap.get(CRServo.class, Constants.HMServospinDexer);
        spindexer.setDirection(DcMotorSimple.Direction.REVERSE);
        spindexerEncoder = hardwareMap.get(SpindexerEncoder.class, Constants.HMSpindexerEncoder);

        pidTimer = new ElapsedTime();
    }

    public void update() {
        currentAngle = spindexerEncoder.getWrappedAngle();

        /*
        The error calculation here is wrapped
        This means that instead of moving 250 degrees from 0 to 250 (error = 0 - 250)
        We only move 20 degrees
         */
        double error = AngleUnit.normalizeDegrees(targetAngle - currentAngle);

        // TODO: Implement the proportional and derivative calculations, use https://www.ctrlaltftc.com/the-pid-controller as reference
        double proportional = 0;
        double derivative = 0;

        // TODO: Combine the kP and kD terms with the previous calculations to get the power output
        double output = 0;

        lastError = error;
        pidTimer.reset();
    }

    // TODO: Finish the setTarget method, add any method parameters necessary
    public void setTargetAngle() {

    }

    public double getTargetAngle() {
        return targetAngle;
    }

    public double getCurrentAngle() {
        return currentAngle;
    }
}
