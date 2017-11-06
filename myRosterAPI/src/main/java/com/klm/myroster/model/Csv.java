/**
 * For each row in the CSV file will make an instance of the object "Csv".
 * Each parameter in this class match with the name of columns in the csv file.
 * 
 */
package com.klm.myroster.model;

public class Csv {
	private String empno;
	private String adate;
	private String stime;
	private String dtime;
	private String empname;
		
	public Csv () {
	}
		
	public String getEmpno() {
		return empno;
	}
	
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	
	public String getAdate() {
		return adate;
	}
	
	public void setAdate(String adate) {
		this.adate = adate;
	}
		
	public String getStime() {
		return stime;
	}
	
	public void setStime(String stime) {
		this.stime = stime;
	}
	
	public String getDtime() {
		return dtime;
	}
	
	public void setDtime(String dtime) {
		this.dtime = dtime;
	}
	
	public String getEmpname() {
		return empname;
	}
	
	public void setEmpname(String empname) {
		this.empname = empname;
	}

}
