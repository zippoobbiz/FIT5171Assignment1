package flymetomars.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoduo on 3/31/15.
 */
public class WorkPreference {
    List willing;
    List unWilling;


    public List getUnWilling() {
        return unWilling;
    }


    public void setUnWilling(List unWilling) {
        if(unWilling == null)
        {
            throw new IllegalArgumentException("unwilling list cannot be null.");
        }
        this.unWilling = unWilling;
    }

    public void setWilling(List willing) {
        if(willing == null)
        {
            throw new IllegalArgumentException("willing list cannot be null.");
        }
        this.willing = willing;
    }



    public List getWilling() {
        return willing;
    }

    public WorkPreference()
    {
        willing = new ArrayList<Person>();
        unWilling = new ArrayList<Person>();
    }

    public WorkPreference(List willing, List unWilling)
    {
        if(willing == null)
        {
            throw new IllegalArgumentException("willing list cannot be null.");
        }else if(unWilling == null)
        {
            throw new IllegalArgumentException("unWilling list cannot be null.");
        }

        this.willing = willing;
        this.unWilling = unWilling;

    }

}
