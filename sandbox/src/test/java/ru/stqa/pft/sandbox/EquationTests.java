package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Zakhidat on 01.03.2017.
 */
public class EquationTests {
  @Test
  public void test0() {
    Equation equation = new Equation(1,1,1);
    Assert.assertEquals(equation.rootNumber(), 0);
  }
  @Test
  public void test1() {
    Equation equation = new Equation(1,2,1);
    Assert.assertEquals(equation.rootNumber(), 1);
  }
  @Test
  public void test3() {
    Equation equation = new Equation(1,5,6);
    Assert.assertEquals(equation.rootNumber(), 2);
  }

}
