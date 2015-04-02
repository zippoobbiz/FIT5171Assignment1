package flymetomars.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by xiaoduo on 3/29/15.
 */
public class InvitationUnitTest {


    private Invitation i;

    @Before
    public void setUp() {
        i = new Invitation();
    }

    @Test
    public void creatorNotNull() {
        try {
            i.setCreator(null);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }
    }

    @Test
    public void lastUpdatedNotNull() {
        try {
            i.setLastUpdated(null);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }
    }

    @Test
    public void missionNotNull() {
        try {
            i.setMission(null);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }
    }

    @Test
    public void recipientNotNull() {
        try {
            i.setRecipient(null);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }
    }

    @Test
    public void statusNotNull() {
        try {
            i.setStatus(null);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }
    }

}
