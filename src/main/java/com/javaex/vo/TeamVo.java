package com.javaex.vo;

public class TeamVo {

	private int teamNo;
	private String teamName;
	private int count;
	
	public TeamVo() {
		
	}

	public TeamVo(int teamNo, String teamName, int count) {
		this.teamNo = teamNo;
		this.teamName = teamName;
		this.count = count;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "TeamVo [teamNo=" + teamNo + ", teamName=" + teamName + ", count=" + count + "]";
	}
	
	
}
