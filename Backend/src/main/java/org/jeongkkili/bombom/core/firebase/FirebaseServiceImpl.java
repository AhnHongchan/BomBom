package org.jeongkkili.bombom.core.firebase;

import org.springframework.stereotype.Service;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class FirebaseServiceImpl implements FirebaseService {

	public void sendNotification(String token, String title, String body, String screen) {
		Message message = Message.builder()
			.setToken(token)
			.setNotification(Notification.builder()
				.setTitle(title)
				.setBody(body)
				.build())
			.putData("screen", screen)
			.build();

		try {
			String response = FirebaseMessaging.getInstance().send(message);
			// System.out.println("Successfully sent message: " + response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void sendNotification(String token, String title, String body, String screen, String seniorId) {
		Message message = Message.builder()
			.setToken(token)
			.setNotification(Notification.builder()
				.setTitle(title)
				.setBody(body)
				.build())
			.putData("screen", screen)
			.putData("senior-id", seniorId)
			.build();

		try {
			String response = FirebaseMessaging.getInstance().send(message);
			// System.out.println("Successfully sent message: " + response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
