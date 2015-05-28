package dto;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by peterrangelov on 5/27/15.
 */

public class Action {

    private String id;
    private String name;
    private String assignee;
    private String createdDate;
    private String dueDate;

    public static ArrayList<Action> getMockActions (int howMany) {
        ArrayList<Action> actions = new ArrayList<Action>();
        for (int i=0; i< howMany; i++) {
            Action action = new Action("id"+i, "name"+i, "assignee"+i, "createdDate"+i, "dueDate"+i);
            actions.add(action);
        }
        return actions;
    }

    public Action (String id, String name, String assignee, String createdDate, String dueDate) {
        this.id=id;
        this.name=name;
        this.assignee=assignee;
        this.createdDate=createdDate;
        this.dueDate=dueDate;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
