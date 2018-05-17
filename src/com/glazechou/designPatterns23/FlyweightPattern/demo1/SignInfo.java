package com.glazechou.designPatterns23.FlyweightPattern.demo1;

/**
 * 报考信息类
 * @author msi-
 *
 */
public class SignInfo {
	private String id; // 报名人员的id
	private String location; // 考试地点
	private String subject; // 考试科目
	private String postAddress; // 邮寄地址

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPostAddress() {
		return postAddress;
	}

	public void setPostAddress(String postAddress) {
		this.postAddress = postAddress;
	}

}
