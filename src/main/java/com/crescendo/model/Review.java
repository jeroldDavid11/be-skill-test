package com.crescendo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table
@Entity
public class Review {
	
	@TableGenerator(name = "Review_Gen", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", pkColumnValue = "Review_Gen", initialValue = 0, allocationSize = 100000)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "Review_Gen")
	private long id;
	private long bussinessId;
	private String text;
	private String rating;
	private String CreateDate;
	
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="bussinessId", nullable=false, insertable=false,updatable=false)
	 @JsonIgnore
	 private Business business;

	 
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public long getBussinessId() {
			return bussinessId;
		}

		public void setBussinessId(long bussinessId) {
			this.bussinessId = bussinessId;
		}
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(String createDate) {
		CreateDate = createDate;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}
   
}