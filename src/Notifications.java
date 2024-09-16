public abstract class Notifications {
    public abstract void sendNotification(String message);
}


 class SMSNotification extends Notifications {
    @Override
    public void sendNotification(String message) {
        // Logic to send SMS notification
        System.out.println("Sending SMS: " + message);
    }
}

 class EmailNotification extends Notifications {
    @Override
    public void sendNotification(String message) {
        // Logic to send Email notification
        System.out.println("Sending Email: " + message);
    }
}

 class InAppNotification extends Notifications {
    @Override
    public void sendNotification(String message) {
        // Logic to send In-App notification
        System.out.println("Sending In-App Notification: " + message);
    }
}
