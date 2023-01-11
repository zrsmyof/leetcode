package ru.zrs.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zrs
 */
class CollectApplesMinTimeTest {

    CollectApplesMinTime collectApplesMinTime = new CollectApplesMinTime();

    @Test
    void minTimeTest() {
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}};
        List<Boolean> vertices = Arrays.asList(false, false, true, false, true, true, false);
        assertEquals(8, collectApplesMinTime.minTime(7, edges, vertices));

        edges = new int[][]{{0, 2}, {0, 3}, {1, 2}};
        vertices = Arrays.asList(false, true, false, false);
        assertEquals(4, collectApplesMinTime.minTime(4, edges, vertices));
    }
}