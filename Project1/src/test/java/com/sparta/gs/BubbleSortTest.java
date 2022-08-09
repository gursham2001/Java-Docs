package com.sparta.gs;

import com.sparta.gs.sortAlgorithms.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    @DisplayName("Given a Array of ints return it in ascending order")
    void bubbleSortTest() {
        Assertions.assertEquals(Arrays.toString(new int[]{1, 2, 6, 9, 11, 15}), Arrays.toString(BubbleSort.bubbleSort(new int[]{11, 9, 15, 1, 2, 6})));
    }
}
