/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */
  /*
    Private final GroundIntake m_robotIntake
      = new GroundIntake(motor(port));
    Private final Storage m_storage = new Storage(motor);

    Private final BallCounter m_counter = new BallCounter();
  */

  public Intake() {
    /*
    If (m_counter < 5){
    m_robotIntake.set(on);
    }
    else{
    m_robotIntake.set(stop);
    }
    */
    //starts up intake and counts the balls via motion sensor, once over 5 it stops
  }

  /*
  public void Storage(){
    If (m_robotIntake = stop){
      m_storage.set(on)
    }
    else{
      m_storage.set(off)
    }
  }

  */

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    /*
      Intake.startIntake;
    */
  }
}
