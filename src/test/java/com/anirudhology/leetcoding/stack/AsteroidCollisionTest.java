package com.anirudhology.leetcoding.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AsteroidCollisionTest {

    private final AsteroidCollision asteroidCollision = new AsteroidCollision();

    @Test
    public void testAsteroidCollisionBasic() {
        assertArrayEquals(new int[]{5, 10}, asteroidCollision.asteroidCollision(new int[]{5, 10, -5}));
        assertArrayEquals(new int[]{}, asteroidCollision.asteroidCollision(new int[]{8, -8}));
        assertArrayEquals(new int[]{10}, asteroidCollision.asteroidCollision(new int[]{10, 2, -5}));
        assertArrayEquals(new int[]{-2, -1, 1, 2}, asteroidCollision.asteroidCollision(new int[]{-2, -1, 1, 2}));
    }

    @Test
    public void testAsteroidCollisionEdgeCases() {
        assertArrayEquals(new int[]{}, asteroidCollision.asteroidCollision(new int[]{}));
        assertArrayEquals(null, asteroidCollision.asteroidCollision(null));
        assertArrayEquals(new int[]{1}, asteroidCollision.asteroidCollision(new int[]{1}));
        assertArrayEquals(new int[]{-1}, asteroidCollision.asteroidCollision(new int[]{-1}));
    }

    @Test
    public void testAsteroidCollisionComplex() {
        assertArrayEquals(new int[]{10}, asteroidCollision.asteroidCollision(new int[]{10, -10, 10}));
        assertArrayEquals(new int[]{10}, asteroidCollision.asteroidCollision(new int[]{10, 2, 3, -5}));
    }

    @Test
    public void testAsteroidCollisionMultipleCollisions() {
        assertArrayEquals(new int[]{-5, 10}, asteroidCollision.asteroidCollision(new int[]{-5, 5, -5, 10}));
        assertArrayEquals(new int[]{-10}, asteroidCollision.asteroidCollision(new int[]{-10, 5, 5, -5, -5}));
    }

    @Test
    public void testAsteroidCollisionNoCollision() {
        assertArrayEquals(new int[]{1, 2, 3}, asteroidCollision.asteroidCollision(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{-3, -2, -1}, asteroidCollision.asteroidCollision(new int[]{-3, -2, -1}));
    }
}