package flymetomars.model;

/**
 * Created by yli on 16/03/15.
 */
public class Expertise extends SeriablizableEntity {
    private String description;
    private int level;

    public void setLevel(int level) {
        if(level<0)
        {
            throw new IllegalArgumentException("level cannot be negative");
        }
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public Expertise() {
        description = new String();
    }

    public Expertise(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o.getClass() == Expertise.class)
        {
            Expertise e = (Expertise)o;
            if(e.description.equals(description))
            {
                if(e.level == level)
                {
                    return true;
                }
            }

        }
        return false;
    }


    public int hashCode()
    {
        return description.hashCode();
    }
}
