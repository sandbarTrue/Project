package com.im.project.model;

public class Department {
	private Integer id;
	private String name;
	private Integer pictureId;
	private String url;
	private Picture picture;
	public Integer getPictureId() {
		return pictureId;
	}
	public void setPictureId(Integer pictureId) {
		this.pictureId = pictureId;
	}
	public Picture getPicture() {
		return picture;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name==null?null:name.trim();
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url==null?null:url.trim();
	}
	
}
