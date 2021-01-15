// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivebase;
import frc.robot.subsystems.Lifter;

public class g2esport extends CommandBase {
  private final Drivebase m_drivebase;
  private final Lifter m_lifter;
 
  public g2esport(Drivebase drivebase, Lifter lifter) {
    m_drivebase = drivebase;
    m_lifter=lifter;
    addRequirements(m_drivebase);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    SmartDashboard.putBoolean("start", true);
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivebase.drive(1, -1);
    m_lifter.lift(0.5);
    Timer.delay(1);
    m_lifter.lift(-0.5);
    Timer.delay(0.5);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    SmartDashboard.putBoolean("start", false);
    m_drivebase.drive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
