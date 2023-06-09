package models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hrms_holidays")
public class Holiday {

	private Integer year_id;
	private Date hday_date;
	private String hday_title;
	private String hday_type;

	public Integer getYear_id() {
		return year_id;
	}

	public void setYear_id(Integer year_id) {
		this.year_id = year_id;
	}

	public Date getHday_date() {
		return hday_date;
	}

	public void setHday_date(Date hday_date) {
		this.hday_date = hday_date;
	}

	public String getHday_title() {
		return hday_title;
	}

	public void setHday_title(String hday_title) {
		this.hday_title = hday_title;
	}

	public String getHday_type() {
		return hday_type;
	}

	public void setHday_type(String hday_type) {
		this.hday_type = hday_type;
	}

}
