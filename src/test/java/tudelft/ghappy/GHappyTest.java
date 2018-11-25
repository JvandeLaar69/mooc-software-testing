package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {


    @Test
        public void singleGAtStart() {
            GHappy gh = new GHappy();
            boolean result = gh.gHappy("gXffc");
            Assertions.assertFalse(result);
        }

    @Test
        public void doubleGAtStart() {
            GHappy gh = new GHappy();
            boolean result = gh.gHappy("ggXffc");
            Assertions.assertTrue(result);
    }

    @Test
    public void singleGAtSecondPostion() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("qgXffc");
        Assertions.assertFalse(result);
    }

    @Test
    public void doubleGAtSecondPostion() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("qggXffc");
        Assertions.assertTrue(result);
    }

    @Test
    public void doubleGAtMultiplePostions() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("qggXffgggc");
        Assertions.assertTrue(result);
    }

    @Test
    public void singleAndMultipleGMixed() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("qgXffgggc");
        Assertions.assertFalse(result);
    }


}
