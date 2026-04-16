package org.firstinspires.ftc.teamcode;

import android.graphics.Color;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

@TeleOp
public class ColorSensorTest extends LinearOpMode {
    NormalizedColorSensor colorSensor;

    @Override
    public void runOpMode() {
        colorSensor = hardwareMap.get(NormalizedColorSensor.class, "sensor_color");

        colorSensor.setGain(2.0f);

        waitForStart();

        while (opModeIsActive()) {
            NormalizedRGBA colors = colorSensor.getNormalizedColors();

            float[] hsvValues = new float[3];
            Color.RGBToHSV(
                    (int) (colors.red * 255),
                    (int) (colors.green * 255),
                    (int) (colors.blue * 255),
                    hsvValues
            );

            float hue = hsvValues[0];
            String color = "None";

            if (hue > 215 && hue < 245) {
                color = "PURPLE";
            } else if (hue > 145 && hue < 175) {
                color = "GREEN";
            }

            telemetry.addData("Color: ", color);
            telemetry.update();
        }
    }
}
