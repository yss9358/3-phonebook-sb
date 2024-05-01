package com.javaex.vo;

public class TeamVo {

	private int teamNo;
	private String teamName;
	
	
	public TeamVo() {
		
	}
	public TeamVo(int teamNo, String teamName) {
		this.teamNo = teamNo;
		this.teamName = teamName;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	@Override
	public String toString() {
		return "TeamVo [teamNo=" + teamNo + ", teamName=" + teamName + "]";
	}
	
	
}
