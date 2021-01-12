/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import static frc.robot.Constants.ARM_CONST.GRABBER_CAN;
import static frc.robot.Constants.STICK_CONST.PINK;
import static frc.robot.Constants.STICK_CONST.R2;
import static frc.robot.Constants.STICK_CONST.RED;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class Grabber extends SubsystemBase {
  public WPI_TalonSRX Grabber = new WPI_TalonSRX(GRABBER_CAN);
  public void grab(double x) {
    Grabber.set(x);
  }
  public void Auto() {
    Timer.delay(15);
    Grabber.set(1);
    Timer.delay(4);
    Grabber.stopMotor();
  }
    @Override
  public void periodic() {
    if (RobotContainer.stick.getRawButton(RED)) {
      grab(1);
    }
    else if  (RobotContainer.stick.getRawButton(PINK)) {
      grab(-1);
    }
    else if (RobotContainer.stick.getRawButton(R2)) {
      grab(1);
      Timer.delay(4);
      grab(0);
    }
    else {
      grab(0.0);
    }
  }
}