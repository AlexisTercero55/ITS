package com.ITS.data;

public class TaskJournal {
	private TJItem [] entries;
	
	public String makeView()
	{
		return "Printing " + entries.length + " journal entries on the task";
	}
}
