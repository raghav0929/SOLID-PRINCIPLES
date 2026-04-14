package com.raghav.SOLID_PRINCIPLES.DIP.GOOD_CODE;

public class NotificationService {

	private NotificationChannel channel;

	public NotificationService(NotificationChannel channel) {
		super();
		this.channel = channel;
	}
	
	public void notify(String message)
	{
		channel.send(message);
	}
}


/*
 * This implementation follows the Dependency Inversion Principle (DIP).
 *
 * The high-level class NotificationService depends on
 * the abstraction NotificationChannel instead of
 * concrete classes like EmailService or SmsService.
 *
 * The dependency is injected through the constructor,
 * which reduces tight coupling and improves flexibility.
 *
 * Now, any class implementing NotificationChannel
 * can be passed to NotificationService without
 * modifying its existing code.
 *
 * This makes the design scalable, testable,
 * and easy to extend.
 */