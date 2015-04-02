package flymetomars.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by xiaoduo on 3/31/15.
 */
public class WorkPerferenceUnitTest {
    WorkPreference w;

    @Before
    public void setUp() {
        w = new WorkPreference();
    }

    @Test
    public void unWillingListNotNull() {
        try {
            w.setUnWilling(null);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }
    }

    @Test
    public void willingListNotNull() {
        try {
            w.setWilling(null);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullFirstName() {
        w = new WorkPreference(null,null);
    }

}
