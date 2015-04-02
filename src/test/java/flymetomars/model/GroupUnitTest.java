package flymetomars.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by xiaoduo on 3/31/15.
 */
public class GroupUnitTest {
    Group g;

    @Before
    public void setUp() {
        g = new Group();
    }


    @Test
    public void creatorNotNull() {
        try {
            g.setGroupList(null);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }
    }


    @Test(expected = IllegalArgumentException.class)
    public void testNullFirstName() {
        g = new Group(null);
    }
}
