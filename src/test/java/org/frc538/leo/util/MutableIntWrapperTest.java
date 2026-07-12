package org.frc538.leo.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MutableIntWrapperTest {
  @Test
  void createValue() {
    new MutableIntWrapper(1);
  }

  @Test
  void getValue() {
    var it = new MutableIntWrapper(1);
    assertEquals(1, it.get());
  }
}
