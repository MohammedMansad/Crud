package com.emp;

public class Adress {
	
	private int eId;
	private String  eAdress ;
	private int ePinCode;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteAdress() {
		return eAdress;
	}
	public void seteAdress(String eAdress) {
		this.eAdress = eAdress;
	}
	public int getePinCode() {
		return ePinCode;
	}
	public void setePinCode(int ePinCode) {
		this.ePinCode = ePinCode;
	}
	public Adress(int eId, String eAdress, int ePinCode) {
		super();
		this.eId = eId;
		this.eAdress = eAdress;
		this.ePinCode = ePinCode;
	}
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Adress [eId=" + eId + ", eAdress=" + eAdress + ", ePinCode=" + ePinCode + "]";
	}
	
	

	
}
