package com.smaga.core2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AircraftConfiguration.class)
public class AircraftTest {
    @Autowired
    private Airplane airplane;

    private Helicopter helicopter;

    @Test
    public void airplaneShouldNotBeNull() {
        assertNotNull(airplane);
    }

    @Test
    public void airplaneShouldFly() {
        assertEquals("Airplane is flying", airplane.fly());
    }

    @Test
    public void helicopterShouldNotBeNull() {
        assertNotNull(helicopter);
    }

    @Test
    public void helicopterShouldFly() {
        assertEquals("Helicopter is flying", helicopter.fly());
    }
}
