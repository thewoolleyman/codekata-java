package com.thewoolleyweb.kata.chop;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class KarateChop1Test {

    @Test
    public void chopTest() {
        KarateChop1 subject = new KarateChop1();
        int placeholder = subject.chop(1, new int[]{1});
        assertThat(placeholder, equalTo(1));
    }
}
