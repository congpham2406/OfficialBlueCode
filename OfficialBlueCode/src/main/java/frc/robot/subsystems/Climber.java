/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import static frc.robot.Constants.STICK_CONST.L1;
import static frc.robot.Constants.STICK_CONST.L2;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class Climber extends SubsystemBase {
  public WPI_VictorSPX ClimberAnal = new WPI_VictorSPX(0);
  public WPI_TalonSRX ClimberRight = new WPI_TalonSRX(0);
  public WPI_TalonSRX ClimberLeft = new WPI_TalonSRX(0);
  
  public Climber() {
    ClimberLeft.follow(ClimberRight);
    ClimberLeft.setInverted(true);
  }

  @Override
  public void periodic() {
    if (RobotContainer.stick.getRawButton(L1)) {
      ClimberRight.set(1);
    }
    else if (RobotContainer.stick.getRawButton(L2)) {
      ClimberRight.set(-1);  
    }
    else ClimberRight.stopMotor();
    if (RobotContainer.stick.getPOV()==0) {
      ClimberAnal.set(1);
    }
    else if (RobotContainer.stick.getPOV()== 180) {
      ClimberAnal.set(-1);
    }
    else ClimberAnal.set(0);
  }
}
