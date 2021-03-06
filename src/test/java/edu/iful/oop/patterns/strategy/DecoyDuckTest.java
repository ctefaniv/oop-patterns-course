package edu.iful.oop.patterns.strategy;

import edu.iful.oop.patterns.strategy.behavior.FlyNoWay;
import edu.iful.oop.patterns.strategy.behavior.FlyWithWings;
import edu.iful.oop.patterns.strategy.behavior.MuteQuack;
import edu.iful.oop.patterns.strategy.behavior.Squeak;
import org.junit.Assert;
import org.junit.Test;

public class DecoyDuckTest {

    @Test
    public void testFly() {
        Duck decoy = new DecoyDuck();
        Assert.assertEquals(FlyNoWay.FLY_MESSAGE, decoy.performFly());
    }

    @Test
    public void testQuack() {
        Duck decoy = new DecoyDuck();
        Assert.assertEquals(Squeak.SQUEAK_MESSAGE, decoy.performQuack());
    }
}
