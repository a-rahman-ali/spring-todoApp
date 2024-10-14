package com.entities;

import java.util.Date;

public class ToDo {
	private String toDoTitle;
	private String toDoContent;
	private Date toDoDate;

	public ToDo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ToDo(String toDoTitle, String toDoContent, Date toDoDate) {
		super();
		this.toDoTitle = toDoTitle;
		this.toDoContent = toDoContent;
		this.toDoDate = toDoDate;
	}

	public String getToDoTitle() {
		return toDoTitle;
	}

	public void setToDoTitle(String toDoTitle) {
		this.toDoTitle = toDoTitle;
	}

	public String getToDoContent() {
		return toDoContent;
	}

	public void setToDoContent(String toDoContent) {
		this.toDoContent = toDoContent;
	}

	public Date getToDoDate() {
		return toDoDate;
	}

	public void setToDoDate(Date toDoDate) {
		this.toDoDate = toDoDate;
	}

	@Override
	public String toString() {
		return "ToDo [toDoTitle=" + toDoTitle + ", toDoContent=" + toDoContent + ", toDoDate=" + toDoDate + "]";
	}

}
