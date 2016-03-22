package tree.com.logreader.model;

import org.joda.time.DateTime;

public class Content {
	private String dbName;
	private boolean successfulGeneration;
	private DateTime duration;
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public boolean isSuccessfulGeneration() {
		return successfulGeneration;
	}
	public void setSuccessfulGeneration(boolean successfulGeneration) {
		this.successfulGeneration = successfulGeneration;
	}
	public DateTime getDuration() {
		return duration;
	}
	public void setDuration(DateTime duration) {
		this.duration = duration;
	}
	
	

}
