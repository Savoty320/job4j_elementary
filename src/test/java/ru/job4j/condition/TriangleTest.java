package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {
    @Test
    public void whenExist() {
        double ab = 2.5;
        double ac = 3.4;
        double bc = 4.2;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        double ab = 1;
        double ac = 1;
        double bc = 4;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}