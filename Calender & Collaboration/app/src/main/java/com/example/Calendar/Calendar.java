package com.example.Calendar;



/**
 * @author A.A.A.ARMASH
 *
 */
public class Calendar {

	private String date;
    private String startTime;
    private String endTime;
    private String location;
    private String notes;
    private String title;
    
    
 // Constructors, getters, and setters
    // ...
     
	    public Calendar() {
			super();
		}
		public String getTitle() {
			return title;
		}
		public Calendar(String title, String date, String startTime, String endTime, String location, String notes) {
			super();
			this.title = title;
			this.date = date;
			this.startTime = startTime;
			this.endTime = endTime;
			this.location = location;
			this.notes = notes;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getStartTime() {
			return startTime;
		}
		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
		public String getEndTime() {
			return endTime;
		}
		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getNotes() {
			return notes;
		}
		public void setNotes(String notes) {
			this.notes = notes;
		}
		
	    
	}
	
