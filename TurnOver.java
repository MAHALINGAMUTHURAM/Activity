package com.model2;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class TurnOver {
	
	@Id
	private int year;
	
	@OneToMany(mappedBy="t",cascade=CascadeType.ALL)
	private List<Sales> l=new ArrayList<>();
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<Sales> getL() {
		return l;
	}
	public void setL(List<Sales> l) {
		this.l = l;
	}
	
	

}
