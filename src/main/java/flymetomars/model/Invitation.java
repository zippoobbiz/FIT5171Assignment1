package flymetomars.model;

import java.util.Date;

/**
 * Created by yli on 10/03/15.
 */
public class Invitation extends SeriablizableEntity {

    public enum InvitationStatus {
        SENT("sent"),
        CREATED("created"),
        ACCEPTED("accepted"),
        DECLINED("declined");

        private String name;

        private InvitationStatus(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    private Mission mission;
    private Person creator;
    private Person recipient;

    private Date lastUpdated;
    private InvitationStatus status;

    public Invitation() {

        mission = new Mission();
        creator = new Person();
        recipient = new Person();
        lastUpdated = new Date();
        status  = InvitationStatus.CREATED;
    }

    public Mission getMission() {
        return mission;
    }


    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public InvitationStatus getStatus() {
        return status;
    }


    public void setStatus(InvitationStatus status) {
        this.status = status;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Person getRecipient() {
        return recipient;
    }

    public void setRecipient(Person recipient) {
        if(recipient == null)
        {
            //throw
        }else
        {
            if(recipient.getLastName() == null)
            {
                throw new IllegalArgumentException("LastName cannot be null.");
            }else if(recipient.getFirstName() == null)
            {
                throw new IllegalArgumentException("FirstName cannot be null.");
            }
        }
        this.recipient = recipient;
    }

    public String setId()
    {
        return 7+"";
    }
}
