package com.javaex.vo;

public class PersonVo {
	
	private int personNo;
	private String name;
	private String hp;
	private int teamNo;
	private boolean star;
	private String teamName;
	
	
	public PersonVo() {
		super();
	}
	public PersonVo(int personNo, String name, String hp, int teamNo, boolean star, String teamName) {
		super();
		this.personNo = personNo;
		this.name = name;
		this.hp = hp;
		this.teamNo = teamNo;
		this.star = star;
		this.teamName = teamName;
	}


	public int getPersonNo() {
		return personNo;
	}
	public void setPersonNo(int personNo) {
		this.personNo = personNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public boolean isStar() {
		return star;
	}
	public void setStar(boolean star) {
		this.star = star;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	@Override
	public String toString() {
		return "PersonVo [personNo=" + personNo + ", name=" + name + ", hp=" + hp + ", teamNo=" + teamNo + ", star="
				+ star + ", teamName=" + teamName + "]";
	}
	
	
	
	
}
