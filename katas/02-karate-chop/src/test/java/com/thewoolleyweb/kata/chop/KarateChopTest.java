package com.thewoolleyweb.kata.chop;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class KarateChopTest {
    KarateChop c = new KarateChop();

    @Test
    public void chop1Test() {
        assertThat(c.chop1(3, new int[]{}), equalTo(-1));
        assertThat(c.chop1(3, new int[]{1}), equalTo(-1));

        assertThat(c.chop1(1, new int[]{1, 3, 5}), equalTo(0));
        assertThat(c.chop1(3, new int[]{1, 3, 5}), equalTo(1));
        assertThat(c.chop1(5, new int[]{1, 3, 5}), equalTo(2));
        assertThat(c.chop1(0, new int[]{1, 3, 5}), equalTo(-1));
        assertThat(c.chop1(2, new int[]{1, 3, 5}), equalTo(-1));
        assertThat(c.chop1(4, new int[]{1, 3, 5}), equalTo(-1));
        assertThat(c.chop1(6, new int[]{1, 3, 5}), equalTo(-1));

        assertThat(c.chop1(1, new int[]{1, 3, 5, 7}), equalTo(0));
        assertThat(c.chop1(3, new int[]{1, 3, 5, 7}), equalTo(1));
        assertThat(c.chop1(5, new int[]{1, 3, 5, 7}), equalTo(2));
        assertThat(c.chop1(7, new int[]{1, 3, 5, 7}), equalTo(3));
        assertThat(c.chop1(0, new int[]{1, 3, 5, 7}), equalTo(-1));
        assertThat(c.chop1(2, new int[]{1, 3, 5, 7}), equalTo(-1));
        assertThat(c.chop1(4, new int[]{1, 3, 5, 7}), equalTo(-1));
        assertThat(c.chop1(6, new int[]{1, 3, 5, 7}), equalTo(-1));
        assertThat(c.chop1(8, new int[]{1, 3, 5, 7}), equalTo(-1));
    }

    @Test
    public void chop2Test() {
        chopTest((search, list) -> c.chop2(search, list));
    }

    @Test
    public void chop3Test() {
        chopTest((search, list) -> c.chop3(search, list));
    }

    private void chopTest(BiFunction<Integer, List<Integer>, Integer> chop) {
        assertThat(chop.apply(3, new ArrayList<>()), equalTo(-1));
        assertThat(chop.apply(3, new ArrayList<>(1)), equalTo(-1));

        assertThat(chop.apply(1, new ArrayList<>(Arrays.asList(1, 3, 5))), equalTo(0));
        assertThat(chop.apply(3, new ArrayList<>(Arrays.asList(1, 3, 5))), equalTo(1));
        assertThat(chop.apply(5, new ArrayList<>(Arrays.asList(1, 3, 5))), equalTo(2));
        assertThat(chop.apply(0, new ArrayList<>(Arrays.asList(1, 3, 5))), equalTo(-1));
        assertThat(chop.apply(2, new ArrayList<>(Arrays.asList(1, 3, 5))), equalTo(-1));
        assertThat(chop.apply(4, new ArrayList<>(Arrays.asList(1, 3, 5))), equalTo(-1));
        assertThat(chop.apply(6, new ArrayList<>(Arrays.asList(1, 3, 5))), equalTo(-1));
        assertThat(chop.apply(1, new ArrayList<>(Arrays.asList(1, 3, 5, 7))), equalTo(0));
        assertThat(chop.apply(3, new ArrayList<>(Arrays.asList(1, 3, 5, 7))), equalTo(1));
        assertThat(chop.apply(5, new ArrayList<>(Arrays.asList(1, 3, 5, 7))), equalTo(2));
        assertThat(chop.apply(7, new ArrayList<>(Arrays.asList(1, 3, 5, 7))), equalTo(3));
        assertThat(chop.apply(0, new ArrayList<>(Arrays.asList(1, 3, 5, 7))), equalTo(-1));
        assertThat(chop.apply(2, new ArrayList<>(Arrays.asList(1, 3, 5, 7))), equalTo(-1));
        assertThat(chop.apply(4, new ArrayList<>(Arrays.asList(1, 3, 5, 7))), equalTo(-1));
        assertThat(chop.apply(6, new ArrayList<>(Arrays.asList(1, 3, 5, 7))), equalTo(-1));
        assertThat(chop.apply(8, new ArrayList<>(Arrays.asList(1, 3, 5, 7))), equalTo(-1));
    }
}
