package com.raghav.SOLID_PRINCIPLES.DIP.GOOD_CODE;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationService emailNotification=new NotificationService(new EmailService());
		emailNotification.notify("Your order is shipped");
		
		NotificationService smsnotification=new NotificationService(new SmsService());
		emailNotification.notify("Your OTP is 1234");
	}

}
