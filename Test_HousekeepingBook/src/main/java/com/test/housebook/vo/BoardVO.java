package com.test.housebook.vo;



public class BoardVO {
	 private int moneybook_no;
	 private String acc_id;
	 private String moneybook_memo;
	 private String moneybook_type;
	 private int moneybook_amount;
	 private String moneybook_indate;
	
	 public BoardVO() {
		super();
	}

	public BoardVO(int moneybook_no, String acc_id, String moneybook_memo, String moneybook_type, int moneybook_amount,
			String moneybook_indate) {
		super();
		this.moneybook_no = moneybook_no;
		this.acc_id = acc_id;
		this.moneybook_memo = moneybook_memo;
		this.moneybook_type = moneybook_type;
		this.moneybook_amount = moneybook_amount;
		this.moneybook_indate = moneybook_indate;
	}

	public int getMoneybook_no() {
		return moneybook_no;
	}

	public void setMoneybook_no(int moneybook_no) {
		this.moneybook_no = moneybook_no;
	}

	public String getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(String acc_id) {
		this.acc_id = acc_id;
	}

	public String getMoneybook_memo() {
		return moneybook_memo;
	}

	public void setMoneybook_memo(String moneybook_memo) {
		this.moneybook_memo = moneybook_memo;
	}

	public String getMoneybook_type() {
		return moneybook_type;
	}

	public void setMoneybook_type(String moneybook_type) {
		this.moneybook_type = moneybook_type;
	}

	public int getMoneybook_amount() {
		return moneybook_amount;
	}

	public void setMoneybook_amount(int moneybook_amount) {
		this.moneybook_amount = moneybook_amount;
	}

	public String getMoneybook_indate() {
		return moneybook_indate;
	}

	public void setMoneybook_indate(String moneybook_indate) {
		this.moneybook_indate = moneybook_indate;
	}

	@Override
	public String toString() {
		return "BoardVO [moneybook_no=" + moneybook_no + ", acc_id=" + acc_id + ", moneybook_memo=" + moneybook_memo
				+ ", moneybook_type=" + moneybook_type + ", moneybook_amount=" + moneybook_amount
				+ ", moneybook_indate=" + moneybook_indate + "]";
	}
	 
	 
}
