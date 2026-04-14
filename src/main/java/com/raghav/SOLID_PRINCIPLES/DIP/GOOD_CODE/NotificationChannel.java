package com.raghav.SOLID_PRINCIPLES.DIP.GOOD_CODE;

public interface NotificationChannel {

	void send(String message);
}

/*
 * This interface acts as an abstraction between
 * the high-level module and low-level implementations.
 *
 * All notification channels must implement send(),
 * ensuring a common contract for communication.
 *
 * High-level modules depend on this abstraction
 * rather than concrete implementations.
 */