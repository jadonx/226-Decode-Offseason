package org.firstinspires.ftc.teamcode;

import android.graphics.Color;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedRGBA;

public class ColorSensor {
    private NormalizedColorSensor colorSensor;
    private final float[] hsvValues = new float[3];

    public ColorSensor(HardwareMap hardwareMap) {
        colorSensor = hardwareMap.get(NormalizedColorSensor.class, Constants.HMFrontColorSensor);
    }

    public String getDetectedColor() {
        NormalizedRGBA colors = colorSensor.getNormalizedColors();
        Color.colorToHSV(colors.toColor(), hsvValues);
        float hue = hsvValues[0];

        if (hue > 80 && hue < 155) {
            return "GREEN";
        }
        else if (hue > 200 && hue < 290) {
            return "PURPLE";
        }
        else {
            return "NONE";
        }
    }
}
