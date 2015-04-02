package flymetomars.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yli on 10/03/15.
 */
public class Mission extends SeriablizableEntity {
    private Date time;
    private String name;
    private Person captain;
    private String location;
    private String description;

    private Set<Person> participantSet = new HashSet<Person>();
    private Set<Invitation> invitationSet = new HashSet<Invitation>();

    public Mission() {
        time = new Date();
        captain = new Person();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (null == name) {
            throw new IllegalArgumentException("Name cannot be null.");
        } else if (name.trim().equals("")) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        if (null == time) {
            throw new IllegalArgumentException("Time cannot be null.");
        }
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (null == location) {
            throw new IllegalArgumentException("Location cannot be null.");
        } else if (location.trim().equals("")) {
            throw new IllegalArgumentException("Location cannot be empty.");
        }
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (null == description) {
            throw new IllegalArgumentException("Description cannot be null.");
        } else if (description.trim().equals("")) {
            throw new IllegalArgumentException("Description cannot be empty.");
        }
        this.description = description;
    }

    public Set<Invitation> getInvitationSet() {
        return invitationSet;
    }

    public void setInvitationSet(Set<Invitation> invitationSet) {
        if (null == invitationSet) {
            throw new IllegalArgumentException("InvitationSet cannot be null.");
        }
        this.invitationSet = invitationSet;
    }

    public Set<Person> getParticipantSet() {
        return participantSet;
    }

    public void setParticipantSet(Set<Person> participantSet) {
        if (null == participantSet) {
            throw new IllegalArgumentException("ParticipantSet cannot be null.");
        }
        this.participantSet = participantSet;
    }

    public Person getCaptain() {
        return captain;
    }

    public void setCaptain(Person captain) {
        if (null == captain) {
            throw new IllegalArgumentException("Captain cannot be null.");
        }
        this.captain = captain;
    }
}
