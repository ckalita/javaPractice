interface Notification{
	public void sendNotification();
}

class SMS implements Notification{
	public void sendNotification() {
		System.out.println("Sent by SMS");
	}
}

class Email implements Notification{
	public void sendNotification() {
		System.out.println("Sent by Email");
	}
}

class Push implements Notification{
	public void sendNotification() {
		System.out.println("Sent by Push Notification");
	}
}

class NotificationFactory{
	public Notification createNotification(String type) {
		if(type == null) {
			return null;
		}
		
		if(type.equalsIgnoreCase("sms")) {
			return new SMS();
		}else if(type.equalsIgnoreCase("email")) {
			return new Email();
		}
		else if(type.equalsIgnoreCase("push")) {
			return new Push();
		}
		return null;
		
	}
}

public class FactoryPatternMain {

	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		
		Notification sms = notificationFactory.createNotification("sms");
		sms.sendNotification();
		
		Notification email = notificationFactory.createNotification("email");
		email.sendNotification();
		
		Notification push = notificationFactory.createNotification("push");
		push.sendNotification();
		
		Notification creatNotification = notificationFactory.createNotification("sms");
		creatNotification.sendNotification();
		
		creatNotification = notificationFactory.createNotification("email");
		creatNotification.sendNotification();
		
		creatNotification = notificationFactory.createNotification("push");
		creatNotification.sendNotification();

	}

}
