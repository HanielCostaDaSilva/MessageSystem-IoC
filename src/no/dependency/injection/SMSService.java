package no.dependency.injection;


public class SMSService implements IMessageService {
	
	public void sendMessage(String message, String receiver){
		System.out.println("SMS||||> sent to "+receiver+ " with Message= "+message);
	}
}
