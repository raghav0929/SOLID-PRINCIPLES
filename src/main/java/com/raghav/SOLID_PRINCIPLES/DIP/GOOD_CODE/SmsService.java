package com.raghav.SOLID_PRINCIPLES.DIP.GOOD_CODE;

public class SmsService implements NotificationChannel {

	@Override
	public void send(String message) {
		System.out.println("Sending SMS "+message);
	}

}

/*
 * Low-level implementation of NotificationChannel
 * responsible for sending SMS notifications.
 *
 * Since it implements the common abstraction,
 * it can be easily injected into NotificationService.
 */