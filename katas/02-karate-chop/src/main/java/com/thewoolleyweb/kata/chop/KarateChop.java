package com.thewoolleyweb.kata.chop;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KarateChop {

    /**
     *  With primitives and indexOf cheat
     */
    public int chop1(int search, int[] array) {
        List<Integer> list = IntStream.of(array).boxed().collect(Collectors.toList());
        return list.indexOf(new Integer(search));
    }

    /**
     *  With Integer Objects and indexOf cheat
     */
    public Integer chop2(Integer search, List<Integer> list) {
        return list.indexOf(new Integer(search));
    }

    /**
     *  With Java 8 streams - note you must filter over the indexes, not the actual list
     */
    public Integer chop3(Integer search, List<Integer> list) {
        return IntStream.range(0, list.size())
            .filter(i -> search == list.get(i))
            .findFirst()
            .orElse(new Integer(-1));
    }
}
