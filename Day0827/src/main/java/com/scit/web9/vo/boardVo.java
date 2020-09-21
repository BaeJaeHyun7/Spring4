package com.scit.web9.vo;


public class boardVo {
	
	private int	board_no;
	private String member_id;
	private String board_title;
	private String board_context;
	private String board_indate;
	private int board_hits;
	private String originalfile;
    private String savedfile;
	public boardVo() {
		super();
	}
	public boardVo(int board_no, String member_id, String board_title, String board_context, String board_indate,
			int board_hits, String originalfile, String savedfile) {
		super();
		this.board_no = board_no;
		this.member_id = member_id;
		this.board_title = board_title;
		this.board_context = board_context;
		this.board_indate = board_indate;
		this.board_hits = board_hits;
		this.originalfile = originalfile;
		this.savedfile = savedfile;
	}
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_context() {
		return board_context;
	}
	public void setBoard_context(String board_context) {
		this.board_context = board_context;
	}
	public String getBoard_indate() {
		return board_indate;
	}
	public void setBoard_indate(String board_indate) {
		this.board_indate = board_indate;
	}
	public int getBoard_hits() {
		return board_hits;
	}
	public void setBoard_hits(int board_hits) {
		this.board_hits = board_hits;
	}
	public String getOriginalfile() {
		return originalfile;
	}
	public void setOriginalfile(String originalfile) {
		this.originalfile = originalfile;
	}
	public String getSavedfile() {
		return savedfile;
	}
	public void setSavedfile(String savedfile) {
		this.savedfile = savedfile;
	}
	@Override
	public String toString() {
		return "boardVo [board_no=" + board_no + ", member_id=" + member_id + ", board_title=" + board_title
				+ ", board_context=" + board_context + ", board_indate=" + board_indate + ", board_hits=" + board_hits
				+ ", originalfile=" + originalfile + ", savedfile=" + savedfile + "]";
	}
	
    
    

}
