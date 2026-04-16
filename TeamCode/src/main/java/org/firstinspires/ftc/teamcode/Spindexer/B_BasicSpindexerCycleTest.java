package org.firstinspires.ftc.teamcode.Spindexer;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/*
In this TeleOp program we will try to cycle through three spindexer positions on command
The idea is that after pressing the A button once, the spindexer automatically rotates 60 degrees
We will need to learn about enums
 */
@Config
@TeleOp(name="BasicSpindexerCycleTest")
public class B_BasicSpindexerCycleTest extends OpMode {
    // TODO: Create the spindexer object


    // We will use an enum to keep track of what the current spindexer state
    enum SpindexerState {
        WAIT_AT_FIRST_HOLDER,
        WAIT_AT_SECOND_HOLDER,
        WAIT_AT_THIRD_HOLDER;

        public SpindexerState next() {
            SpindexerState[] values = SpindexerState.values();
            return values[(this.ordinal() + 1) % values.length];
        }
    }
    SpindexerState currentState;

    // TODO: Fill in the three ball holder positions for the spindexer
    // Hint: You may need to use another program to output the current position of the spindexer
    double[] spindexerPositions = {0, 0, 0};

    FtcDashboard dashboard;
    TelemetryPacket packet;

    @Override
    public void init() {
        // TODO: Instantiate the spindexer object


        currentState = SpindexerState.WAIT_AT_FIRST_HOLDER;

        dashboard = FtcDashboard.getInstance();
        packet = new TelemetryPacket();
    }

    @Override
    public void loop() {
        // TODO: Call the update() method from spindexer


        // TODO: Fill out the if-statement to cycle the currentState variable once A is pressed
        if (true) { // <- Fix this part!
            currentState = currentState.next();
        }

        // A switch statement works similar to the logic of an if-statement
        // Feel free to learn more about switch statements online
        switch (currentState) {
            case WAIT_AT_FIRST_HOLDER:
                // TODO: Set the target angle of the spindexer to the correct spindexer position

                break;
            case WAIT_AT_SECOND_HOLDER:
                // TODO: Set the target angle of the spindexer to the correct spindexer position

                break;
            case WAIT_AT_THIRD_HOLDER:
                // TODO: Set the target angle of the spindexer to the correct spindexer position

                break;
        }
    }
}
