package POJO;

import java.util.List;

public class Employee {
	
	
	private String status ;
	private List<EmployeeDetails> data;
	private String message ;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<EmployeeDetails> getData() {
		return data;
	}
	public void setData(List<EmployeeDetails> data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

	
	
	
}
