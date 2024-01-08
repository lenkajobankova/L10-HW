package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindMatchingTest {

    List<Double> testList;
    Double testResult;
    Double expected;

    @BeforeEach
    void setup(){
        testList = List.of(10.0, 15.45, 5.811, 175.0);
    }

    @Test
    public void findMatchingTest(){
        testResult = FindMatching.findMatching(testList, 4.0, 9.3);
        expected = 5.811;
        Assertions.assertEquals(expected, testResult);
    }

    @Test
    public void findMatchingNull(){
        testResult = FindMatching.findMatching(testList, 1.0, 1.0);
        expected = null;

        Assertions.assertEquals(expected, testResult);
    }

    @Test
    public void findMatchingFirstTest(){
        List<Double> firstTestList = List.of(12.0, 8.126, 6.0);
        testResult = FindMatching.findMatching(firstTestList, 11.0, 12.6);
        expected = 12.0;

        Assertions.assertEquals(expected, testResult);
    }

    @Test
    public void findMatchingSecondTest(){
        List<Double> secondTestList = List.of(12.0, 8.126, 9.0, 158.0, 6.0);
        testResult = FindMatching.findMatching(secondTestList, 8.0, 10.0);
        expected = 8.126;

        Assertions.assertEquals(expected, testResult);
    }
}
