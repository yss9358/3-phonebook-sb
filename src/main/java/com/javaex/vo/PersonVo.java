package com.javaex.vo;

public class PersonVo {
	
	private int personNo;
	private String name;
	private String hp;
	private int teamNo;
	private int star;
	
	public PersonVo() {
		
	}

	public PersonVo(int personNo, String name, String hp, int teamNo, int star) {
		this.personNo = personNo;
		this.name = name;
		this.hp = hp;
		this.teamNo = teamNo;
		this.star = star;
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

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	@Override
	public String toString() {
		return "PersonVo [personNo=" + personNo + ", name=" + name + ", hp=" + hp + ", teamNo=" + teamNo + ", star="
				+ star + "]";
	}
	
}
