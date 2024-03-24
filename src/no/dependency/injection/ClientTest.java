package no.dependency.injection;

public class ClientTest {

	public static void main(String[] args) {

		IMessageService emailService = new EmailService();
		IMessageService smsService = new SMSService();

		MyApplication app = new MyApplication(emailService);

		try {
			app.processMessages("Hey Mom, I'm back of the School!", "MommyGood342@gmail.com");
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

		app.setMessageService(smsService);
		System.out.println("mensagem com SMS");

		try {
			app.processMessages("Susy, When you will come to dinner?", "128ve980");
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());

		}
	}

}
