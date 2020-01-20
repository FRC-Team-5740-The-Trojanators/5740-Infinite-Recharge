package frc.robot.datacollection.dashboard;

import java.util.Map;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.RobotState;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardLayout;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.shuffleboard.SimpleWidget;

import frc.robot.Constants;
import frc.robot.subsystems.ControlPanel;

/**
 * This Dashboard is Used When Robot is in TestMode Displays every data point
 * from robot in test mode
 */

public class TestModeDashboard {

        // Creates Tab for Shuffleboard called Test-Tab
        private static ShuffleboardTab TestTab = Shuffleboard.getTab("Test-Tab");
        /*
         * Cotten Shawbs non drive pidav loop section
         */

        // Added (proportional Gain for PIDF to shuffleboard
        private final NetworkTableEntry CottonPID_P = TestTab.add("cottonSchwab Proportional Gain", Constants.kp)
                        .withPosition(0, 2).withSize(1, 2).withWidget(BuiltInWidgets.kNumberSlider)
                        .withProperties(Map.of("min", 0, "max", 1.5)).getEntry();

        // Added Intergral Gain to shuffleboard
        private final NetworkTableEntry CottonPID_I = TestTab.add(" cottonSchwab Velocity Gain", Constants.kv)
                        .withPosition(0, 4).withSize(1, 2).withWidget(BuiltInWidgets.kNumberSlider)
                        .withProperties(Map.of("min", 0, "max", 1.5)).getEntry();

        // Added Deritive Gain to shuffleboard
        private final NetworkTableEntry CottonPID_D = TestTab.add("cottonSchwabLayout Derivative Gain", Constants.kd)
                        .withPosition(0, 6).withSize(1, 2).withWidget(BuiltInWidgets.kNumberSlider)
                        .withProperties(Map.of("min", 0, "max", 1.5)).getEntry();

        // Added Acceleration Mapping to Shuffleboard
        private final NetworkTableEntry CottonPID_A = TestTab.add("cottonSchwabLayout Acceleration Gain", Constants.ka)
                        .withPosition(0, 8).withSize(1, 2).withWidget(BuiltInWidgets.kNumberSlider)
                        .withProperties(Map.of("min", 0, "max", 1.5)).getEntry();

        /*
         * DriveTrain turn and drive pidf loop control
         */

        // Adds Drive PID_P
        private final NetworkTableEntry DrivePID_P = TestTab.add("Drive_PID_P", Constants.PDrive).withPosition(3, 0)
                        .withSize(1, 2).withWidget(BuiltInWidgets.kNumberSlider)
                        .withProperties(Map.of("min", 0, "max", 1.5)).getEntry();

        // Adds Drive PID_I
        private final NetworkTableEntry DrivePID_I = TestTab.add("Drive_PID_I", Constants.IDrive).withPosition(3, 2)
                        .withSize(1, 2).withWidget(BuiltInWidgets.kNumberSlider)
                        .withProperties(Map.of("min", 0, "max", 1.5)).getEntry();

        // Adds Drive PID_D
        private final NetworkTableEntry DrivePID_D = TestTab.add("Drive_PID_D", Constants.DDrive).withPosition(3, 4)
                        .withSize(1, 2).withWidget(BuiltInWidgets.kNumberSlider)
                        .withProperties(Map.of("min", 0, "max", 1.5)).getEntry();

        // Enables Drive pid lop
        private final NetworkTableEntry DrivePIDEnable = TestTab.add("Enable Drive pid", false).withPosition(3, 6)
                        .withSize(1, 2).withWidget(BuiltInWidgets.kNumberSlider)
                        .withProperties(Map.of("min", 0, "max", 1.5)).getEntry();
        // shows red value
        public final NetworkTableEntry ColorSenorRed = TestTab.add("SeenColor Red", 1).withPosition(7, 0).withSize(1, 2)
                        .withWidget(BuiltInWidgets.kTextView).getEntry();

        // shows green value
        public final NetworkTableEntry ColorSenorGreen = TestTab.add("SeenColor Green", 1).withPosition(7, 2)
                        .withSize(1, 2).withWidget(BuiltInWidgets.kTextView).getEntry();

        // shows Blue value
        public final NetworkTableEntry ColorSenorBlue = TestTab.add("SeenColor Blue", 1).withPosition(7, 4)
                        .withSize(1, 2).withWidget(BuiltInWidgets.kTextView).getEntry();

        /** PIDF for Drivetrain turn */

        // Function Should Grab Pidf numbers every 20 ms
        public void Periodic() {

                // cotten shawbs pidav constants
                CottonPID_I.getDouble(Constants.kv);

                CottonPID_D.getDouble(Constants.kd);

                CottonPID_P.getDouble(Constants.kp);

                CottonPID_A.getDouble(Constants.ka);

                // Enables Test mode from dashboard

                // DriveTrain Turn and Drive PidLoops

                DrivePID_P.getDouble(Constants.PDrive);

                DrivePID_I.getDouble(Constants.IDrive);

                DrivePID_D.getDouble(Constants.DDrive);

        }

}