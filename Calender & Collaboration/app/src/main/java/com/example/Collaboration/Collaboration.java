package model.pack;



/**
 * @author A.A.A.ARMASH
 *
 */
public class Collaboration {

	
	    private String title;
	    private String date;
	    private String startTime;
	    private String endTime;
	    private List<String> assignedMembers;
	    

		 // Constructors, getters, and setters
	    // ...
	    
	    
	    public Collaboration(String title, String date, String startTime, String endTime, List<String> assignedMembers,
				String description) {
			super();
			this.title = title;
			this.date = date;
			this.startTime = startTime;
			this.endTime = endTime;
			this.assignedMembers = assignedMembers;
			this.description = description;
		}
		public Collaboration() {
			super();
		}
		public String getTitle() {
			return title;
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
		public List<String> getAssignedMembers() {
			return assignedMembers;
		}
		public void setAssignedMembers(List<String> assignedMembers) {
			this.assignedMembers = assignedMembers;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		private String description;

	   
	
	}
	
