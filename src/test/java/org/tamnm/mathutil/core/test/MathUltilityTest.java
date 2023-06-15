/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.tamnm.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.tamnm.mathutil.core.MathUtility.*;

/**
 *
 * @author ASUS
 */
public class MathUltilityTest {
    
    @Test
    public void testFactorialGivenRightArguementReturnWell(){
        
        //assertEquals(69, 69);
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
    }
}

// DDT là 1 phần mở rộng cảu cấc Unit Test FrameWork
// Data DRIVEN TESTING
//          Ko nhầm với TDD: TEST DRIVEN DEVELOPMENT
//                           Viết code và viết test case song hành
//                           với nhau, đã học xong

//Nhưng ocde tsst bốc mùi (Bad SMELLS) trùng code nhiều
//nên người ta chế ra cách viết code test đẹp hơn, gọn hơn, dễ bảo
//trì hơn