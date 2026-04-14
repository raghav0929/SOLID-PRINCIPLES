package com.raghav.SOLID_PRINCIPLES.DIP.GOOD_CODE;

public class EmailService implements NotificationChannel{

	@Override
	public void send(String message) {
		System.out.println("Sending Email "+message);
	}

}

/*
 * Low-level implementation of NotificationChannel
 * responsible for sending email notifications.
 *
 * Since it implements the common abstraction,
 * it can be easily injected into NotificationService.
 */