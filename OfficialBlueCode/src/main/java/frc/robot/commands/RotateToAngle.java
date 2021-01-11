/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivebase;
import static frc.robot.Constants.PID_CONST.*;

public class RotateToAngle extends CommandBase {
  private final Drivebase m_drivebase;
  
  AHRS ahrs;
  PIDController turnController;
private final float angle;

  public RotateToAngle(Drivebase drivebase, float x) {
    m_drivebase = drivebase;
    angle = x;
    addRequirements(m_drivebase);
  }
  
  @Override
  public void initialize() {
    turnController = new PIDController(kP, kI, kD, kF, ahrs, (PIDOutput) this);
    turnController.setInputRange(-180.0f, 180.0f);
    turnController.setOutputRange(-1.0, 1.0);
    turnController.setAbsoluteTolerance(kToleranceDegrees);
    turnController.setContinuous(true);
    turnController.setSetpoint(angle);
    turnController.enable();
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
