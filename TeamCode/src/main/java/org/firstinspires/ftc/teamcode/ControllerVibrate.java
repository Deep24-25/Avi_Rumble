package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "ControllerVibrate", group = "Linear OpMode")

public class ControllerVibrate extends LinearOpMode {
    GamepadEx gamepad;
    @Override
    public void runOpMode() {
        gamepad = new GamepadEx(gamepad1);
        waitForStart();
        while (opModeIsActive()) {

        }
    }
}
