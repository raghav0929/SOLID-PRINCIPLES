package com.raghav.SOLID_PRINCIPLES.DIP.BAD_CODE;

public class NotificationService {

	private EmailService emailService;
	private SmsService smsService;
	
	public NotificationService() {
		this.emailService=new EmailService();
		this.smsService=new SmsService();
	}
	
	public void notifyByEmail(String message)
	{
		emailService.sendEmail(message);
	}
	
	public void notifyBySms(String message)
	{
		smsService.sendSms(message);
	}

}



/*
 * This implementation violates the Dependency Inversion Principle (DIP).
 *
 * The high-level class NotificationService directly depends
 * on concrete low-level classes such as EmailService and SmsService.
 *
 * The dependencies are created inside the class using 'new',
 * which tightly couples NotificationService to specific implementations.
 *
 * Because of this, adding a new notification channel
 * (for example PushNotificationService or WhatsAppService)
 * requires modifying the existing class.
 *
 * This makes the code harder to extend, test, and maintain.
 *
 * High-level modules should depend on abstractions,
 * not on concrete implementations.
 */
