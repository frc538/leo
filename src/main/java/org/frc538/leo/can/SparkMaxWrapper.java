package org.frc538.leo.can;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

/** A REV SPARK Max */
public class SparkMaxWrapper {
  private final SparkMax _sparkMax;

  /**
   * Creates a REV SPARK Max.
   *
   * @param canId the CAN ID of the SPARK Max
   * @param motorType the type of motor to control (brushed or brushless)
   */
  public SparkMaxWrapper(int canId, MotorType motorType) {
    if (canId < 1) throw new IllegalArgumentException("CAN ID must be greater than or equal to 1.");
    if (motorType == null) throw new IllegalArgumentException("Motor Type must be specified.");
    _sparkMax = new SparkMax(canId, motorType);
  }

  /**
   * Sets the scaled output of the motor.
   *
   * @param dutyCycle motor's output between -1.0 and +1.0
   */
  public void setDutyCycle(double dutyCycle) {
    if (dutyCycle < -1) dutyCycle = -1;
    if (dutyCycle > 1) dutyCycle = 1;
    _sparkMax.set(dutyCycle);
  }

  /**
   * Get the underlying REV SPARK Max
   *
   * @return the underlying REV SPARK Max object
   */
  public SparkMax getSparkMax() {
    return _sparkMax;
  }
}
