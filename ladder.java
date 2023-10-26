package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ladder {
    public static Integer climbLadder(int currentPosition){
        Map<Integer, Integer> ladder = new LinkedHashMap<>();

        ladder.put(4,25);
        ladder.put(13,46);
        ladder.put(33,49);
        ladder.put(42,63);
        ladder.put(50,69);
        ladder.put(62,81);
        ladder.put(74,92);

        return ladder.get(currentPosition);
    }

}
