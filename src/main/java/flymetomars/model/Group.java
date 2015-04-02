package flymetomars.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaoduo on 3/31/15.
 */
public class Group {
    Map<Person, WorkPreference> groupList;

    public Map<Person, WorkPreference> getGroupList() {
        return groupList;
    }

    public void setGroupList(Map<Person, WorkPreference> groupList) {
        if(groupList == null)
        {
            throw new IllegalArgumentException("group list cannot be null.");
        }
        this.groupList = groupList;
    }



    public Group()
    {
        groupList = new HashMap<Person, WorkPreference>();
    }

    public Group(Map groupList)
    {
        if(groupList == null)
        {
            throw new IllegalArgumentException("group list cannot be null");
        }
        this.groupList = groupList;
    }

}
