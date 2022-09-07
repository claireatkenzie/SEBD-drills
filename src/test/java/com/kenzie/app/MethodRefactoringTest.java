package com.kenzie.app;

import com.kenzie.app.methods.MethodRefactoring;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MethodRefactoringTest {

    @Test
    void scenarioOne() {

        String original = MethodRefactoring.originalCode("seven", "eight", "nine", "negative one", "nine", "one");

        ArrayList<Integer> step1 = MethodRefactoring.math("seven", "eight", "nine", "negative one", "nine", "one");
        ArrayList<Integer> step2 = MethodRefactoring.sanitize(step1);
        String methodized = MethodRefactoring.format(step2);

        assertEquals(original, methodized);
    }

    @Test
    void math() {
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 3, 9, -7, 9, 1));
        assertEquals(expected, MethodRefactoring.math("one", "three", "nine", "negative seven", "nine", "one"));
    }

    @Test
    void sanitize() {
        ArrayList<Integer> input = new ArrayList<>(List.of(1, 3, 9, -7, 9, 1));
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 3, 9, 9, 1));
        assertEquals(expected, MethodRefactoring.sanitize(input));
    }

    @Test
    void format() {
        ArrayList<Integer> input = new ArrayList<>(List.of(1, 3, 9, 9, 1));
        String expected = "1,3,9,9,1";
        assertEquals(expected, MethodRefactoring.format(input));
    }
}