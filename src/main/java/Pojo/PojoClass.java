package Pojo;

public class PojoClass 
{
	// Step:1 Declare the variables as Global
	
	String createdBy;
	String projectName;
	String status;
	int teamSize;
	
	// Step:2 Crete the Constructor
	
	public PojoClass(String createdBy, String projectName, String status, int teamSize) {
		
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}

	// Step:3 Provide the Getters and setters
	
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
	
	
}
