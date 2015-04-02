package flymetomars.model;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static junit.framework.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by yli on 16/03/15.
 */
public class PersonUnitTest {
    private Person p;

    @Before
    public void setUp() {
        p = new Person();
    }

    @Test
    public void expertiseNotNull() {
        assertNotNull("expertise not null", p.getExpertise());
    }

    @Test
    public void missionRegisteredNotNull() {
        assertNotNull("missionRegistered not null", p.getMissionRegistered());
    }

    @Test
    public void invitationsReceivedNotNull() {
        assertNotNull("invitationsReceived not null", p.getInvitationsReceived());
    }

    @Test
    public void passwordNotNullOrEmpty() {
        try {
            p.setPassword(null);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }

        try {
            p.setPassword("");
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains empty", e.getMessage().contains("empty"));
        }
    }

    @Test
    public void firstNameNotNullOrEmpty() {
        try {
            p.setFirstName(null);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }

        try {
            p.setFirstName("");
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains empty", e.getMessage().contains("empty"));
        }

        try {
            p.setFirstName("asdf123");
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains letters", e.getMessage().contains("letters"));
        }

        try {
            p.setFirstName("abcdefghijklmnopqrstuvwxyz");
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains longer", e.getMessage().contains("longer"));
        }
    }

    @Test
    public void lastNameNotNullOrEmpty() {
        try {
            p.setLastName(null);
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }

        try {
            p.setLastName("");
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains empty", e.getMessage().contains("empty"));
        }

        try {
            p.setLastName("asdf123");
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains letters", e.getMessage().contains("letters"));
        }

        try {
            p.setLastName("abcdefghijklmnopqrstuvwxyz");
        } catch (Exception e) {
            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains longer", e.getMessage().contains("longer"));
        }
    }

    @Test
    public void emailValidation() {
        try {
            p.setEmail(null);
        } catch (Exception e) {

            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains null", e.getMessage().contains("null"));
        }

        try {
            p.setEmail("");
        } catch (Exception e) {

            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Message contains empty", e.getMessage().contains("empty"));
        }

        try {
            p.setEmail("zippoobbiz@gmail.com");
        } catch (Exception e) {

            assertTrue("Throws IAE", e instanceof IllegalArgumentException);
            assertTrue("Email is not valid", e.getMessage().contains("not valid"));
        }
    }


    @Test(expected = IllegalArgumentException.class)
    public void testNullFirstName() {
        String nullFirstName = null;
        p.setFirstName(nullFirstName);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyFirstName() {
        String emptyFirstName = "";
        p.setFirstName(emptyFirstName);

//        Set<Mission> s = p.getMissionRegistered();
//        s.
    }


//    @Test
//    public void t222estEmptyFirstName() {
//        try {
//            Set<Expertise> s = p.getExpertise();
//            Expertise e = new Expertise();
//            e.setDescription("aaa");
//            e.setLevel(0);
//            s.add(e);
//            e = new Expertise();
//            e.setDescription("aaa");
//            e.setLevel(0);
//            s.add(e);
//            e = new Expertise();
//            e.setDescription("aagga");
//            e.setLevel(0);
//            s.add(e);
//            System.out.println("length of set:"+s.size());
//        }catch(Exception ex)
//        {
//            System.out.println("@@@@@@"+ex.getMessage());
//        }
//    }
}