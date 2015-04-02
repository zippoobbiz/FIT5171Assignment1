package flymetomars.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by xiaoduo on 3/29/15.
 */
public class ExpertiseUnitTest {
    private Expertise e;

    @Before
    public void setUp() {
        e = new Expertise();
    }

    @Test
    public void descriptionNotNull() {
        try {
            e.setDescription(null);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }
    }

    @Test
    public void levelNotNull() {
        try {
            e.setLevel(-1);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains negative", e.getMessage().contains("negative"));
        }
    }
}
