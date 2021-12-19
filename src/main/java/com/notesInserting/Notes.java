package com.notesInserting;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import java.util.Date;
import java.util.Random;
@Entity
@Table(name="Notes_Table")
public class Notes {
	@Id
	private int noteId;
	private String title;
	private String content;
	private Date addedDate;
	public Notes() {
		
	}
	
	public Notes(String title,String content, Date addedDate) {
		super();
		this.title = title;
		this.noteId = new Random().nextInt(1000000);
		this.content = content;
		this.addedDate = addedDate;
	}

	public int getNoteId() {
		return noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	
}
