package org.frc538.leo.can;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import org.junit.jupiter.api.Test;

public class SparkMaxWrapperTest {
  @Test
  void create() {
    new SparkMaxWrapper(1, MotorType.kBrushed);
    new SparkMaxWrapper(2, MotorType.kBrushless);
  }

  @Test
  void illegalCanId() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new SparkMaxWrapper(0, MotorType.kBrushed);
        });
  }

  @Test
  void missingMotorType() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          new SparkMaxWrapper(1, null);
        });
  }
}
