/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class STICK_CONST {
        public static final int GREEN = 1;
        public static final int RED = 2;
        public static final int BLUE = 3;
        public static final int PINK = 4;
        public static final int L1 = 5;
        public static final int R1 = 6;
        public static final int L2 = 7;
        public static final int R2 = 8;
    }
    public static final class DRIVE_CONST {
        public static final int LEFT_ENCODED_CAN = 01;
        public static final int LEFT_FOLLOW_CAN = 04;
        public static final int RIGHT_ENCODED_CAN = 02;
        public static final int RIGHT_FOLLOW_CAN = 03;
    }
    public static final class ARM_CONST {
        public static final int GRABBER_CAN = 11;
        public static final int LIFTER_CAN = 07;
    }
    public static final class CLIMBER_CONST {
        public static final int CLIMBER_RIGHT_CAN = 00;
        public static final int CLIMBER_LEFT_CAN = 00;
        public static final int CLIMBER_ANAL_CAN = 00;
        }
    public static final class PID_CONST {
        public static final double kP = 1.0/180;
        public static final double kI = 1e-3;
        public static final double kD = 0.00;
        public static final double kToleranceDegrees = 2.0f;
        // degrees / 0.02s
        public static final double kToleranceAngularVelocity = 1.0f;
    }
}