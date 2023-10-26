package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Snake {

    public static Integer snakeBite(int currentPosition){
        Map<Integer, Integer> snake = new LinkedHashMap<>();

        snake.put(40,3);
        snake.put(27,5);
        snake.put(43,18);
        snake.put(54,31);
        snake.put(99,41);
        snake.put(66,45);
        snake.put(89,53);
        snake.put(76,58);

        return snake.get(currentPosition);
    }
}
