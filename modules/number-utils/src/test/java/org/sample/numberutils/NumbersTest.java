package org.sample.numberutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

   @Test
   void testAdd() {
      assertEquals(5, Numbers.add(2, 3));
   }

}
