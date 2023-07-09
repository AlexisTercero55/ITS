package com.ITS.core;

import java.util.Date;
import com.ITS.data.*;

public abstract class AbstractTask {

	protected String taskId;
    protected Date requestDate;
    protected TaskPriority priority;
    protected String description;
    protected UserInfo userRequestedInfo;
    protected UserInfo userAssignedInfo;
    protected Date assignationDate;
    protected Date startDate;
    protected Date dueDate;
    protected TaskStatus status;
    protected TaskJournal journal;
    protected TaskScalation escalation;
    
    public abstract void updateTaskStatus();

    public abstract void assignTask(UserInfo user);

    public abstract void escalateTask();

    public abstract void addJournalEntry(TJItem entry);
    
    public String getTaskId() {
        return taskId;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public int getPriority() {
        return priority.level;
    }
    
    public String getDescription() {
        return description;
    }

    public UserInfo getUserRequestedInfo() {
        return userRequestedInfo;
    }

    public UserInfo getUserAssignedInfo() {
        return userAssignedInfo;
    }

    public Date getAssignationDate() {
        return assignationDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status.stage;
    }

    public String getJournal() {
        return journal.makeView();
    }

    public String getEscalationLevel() {
        return escalation.getLevel();
    }
}
