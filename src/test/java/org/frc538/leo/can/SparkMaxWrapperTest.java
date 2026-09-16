package org.frc538.leo.can;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import org.junit.jupiter.api.Test;
import org.wpilib.hardware.bus.CANPort;

public class SparkMaxWrapperTest {
  @Test
  void create() {
    new SparkMaxWrapper(CANPort.CAN_S0, 1, MotorType.kBrushed);
    new SparkMaxWrapper(CANPort.CAN_S0, 2, MotorType.kBrushless);
  }

  @Test
  void illegalCanId() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new SparkMaxWrapper(CANPort.CAN_S0, 0, MotorType.kBrushed);
        });
  }

  @Test
  void missingMotorType() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new SparkMaxWrapper(CANPort.CAN_S0, 1, null);
        });
  }
}
