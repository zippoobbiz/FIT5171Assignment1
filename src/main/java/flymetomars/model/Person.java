package flymetomars.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yli on 10/03/15.
 */
public class Person extends SeriablizableEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Set<Expertise> expertise;
    private Set<Mission> missionRegistered;
    private Set<Invitation> invitationsReceived;
    private Set<Group> group;

    public Person() {
        expertise = new HashSet<Expertise>();
        missionRegistered = new HashSet<Mission>();
        invitationsReceived = new HashSet<Invitation>();
        group = new HashSet<Group>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (null == firstName) {
            throw new IllegalArgumentException("FirstName cannot be null.");
        } else if (firstName.trim().equals("")) {
            throw new IllegalArgumentException("FirstName cannot be empty.");
        }else if(firstName.length()>20)
        {
            throw new IllegalArgumentException("FirstName is longer than 20.");
        }else{
            for(char c: firstName.toCharArray())
            {
                if(!Character.isAlphabetic(c))
                {
                    throw new IllegalArgumentException("FirstName must consist of letters.");
                }
            }
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (null == lastName) {
            throw new IllegalArgumentException("LastName cannot be null.");
        } else if (lastName.trim().equals("")) {
            throw new IllegalArgumentException("LastName cannot be empty.");
        }else if(lastName.length()>20)
        {
            throw new IllegalArgumentException("LastName is longer than 20.");
        }else
        {
            for(char c: lastName.toCharArray())
            {
                if(!Character.isAlphabetic(c))
                {
                    throw new IllegalArgumentException("LastName must consist of letters.");
                }
            }
        }
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (null == password) {
            throw new IllegalArgumentException("Password cannot be null.");
        } else if (password.trim().equals("")) {
            throw new IllegalArgumentException("Password cannot be empty.");
        }
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
        if(null == email)
        {
            throw new IllegalArgumentException("Email cannot be null.");

        }else
        {
            Matcher matcher = pattern.matcher(email);
            if(email.trim().equals(""))
            {
                throw new IllegalArgumentException("Email cannot be empty.");

            }else if(!matcher.matches())
            {
                throw new IllegalArgumentException("Email not valid.");
            }
        }

        this.email = email;
    }

    public Set<Mission> getMissionRegistered() {
        return missionRegistered;
    }

    public void setMissionRegistered(Set<Mission> missionRegistered) {
        this.missionRegistered = missionRegistered;
    }

    public Set<Invitation> getInvitationsReceived() {
        return invitationsReceived;
    }

    public void setInvitationsReceived(Set<Invitation> invitationsReceived) {
        this.invitationsReceived = invitationsReceived;
    }

    public Set<Expertise> getExpertise() {
        return expertise;
    }

    public void setExpertise(Set<Expertise> expertise) {
        this.expertise = expertise;
    }
}
