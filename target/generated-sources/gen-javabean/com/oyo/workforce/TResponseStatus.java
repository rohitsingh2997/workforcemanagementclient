/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.workforce;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TResponseStatus implements org.apache.thrift.TEnum {
  SUCCESS(0),
  FAILURE(1);

  private final int value;

  private TResponseStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TResponseStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return SUCCESS;
      case 1:
        return FAILURE;
      default:
        return null;
    }
  }
}
