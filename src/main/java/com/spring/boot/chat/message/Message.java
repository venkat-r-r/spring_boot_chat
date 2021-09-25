package com.spring.boot.chat.message;

import org.springframework.stereotype.Component;

@Component
public class Message {

	private String user;
	private String message;
	public Message(){}
	public Message(String user, String message) {
		super();
		this.user = user;
		this.message = message;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message [user=" + user + ", message=" + message + "]";
	}
}
