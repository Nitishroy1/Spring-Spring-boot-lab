package com.nt.data;

public class Notification {
   private Integer id;
   private String message;
   private String recipient;
   public Notification(Integer id, String message, String recipient) {
	super();
	this.id = id;
	this.message = message;
	this.recipient = recipient;
   }
   public Integer getId() {
	return id;
   }
   public void setId(Integer id) {
	this.id = id;
   }
   public String getMessage() {
	return message;
   }
   public void setMessage(String message) {
	this.message = message;
   }
   public String getRecipient() {
	return recipient;
   }
   public void setRecipient(String recipient) {
	this.recipient = recipient;
   }
   
}
