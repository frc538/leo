package org.frc538.leo.util;

import com.revrobotics.MutableInt;

/** Test for loading REVLib */
public class MutableIntWrapper {
  private MutableInt _value;

  /**
   * Create a MutableInt
   *
   * @param value initial value
   */
  public MutableIntWrapper(int value) {
    _value = new MutableInt(value);
  }

  /**
   * Get the current value
   *
   * @return the current value
   */
  public int get() {
    return _value.value;
  }
}
