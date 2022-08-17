package com.cc.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * welfare lottery
 */
public class Lottery {

    private final static List<Integer> RED_BALLS = new ArrayList<>(33);

    public static List<Integer> calculate() {
        for (int i = 0; i < 33; i++) {
            RED_BALLS.add(i + 1);
        }
        List<Integer> result = new ArrayList<>(6);
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int j = r.nextInt(RED_BALLS.size());
            result.add(RED_BALLS.get(j));
            RED_BALLS.remove(j);
        }
        Collections.sort(result);
        result.add(r.nextInt(16));
        return result;
    }
}
