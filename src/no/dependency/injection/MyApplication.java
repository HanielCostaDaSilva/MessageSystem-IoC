package no.dependency.injection;

/**
 * O código de cliente que usará a classe Application para enviar mensagens de
 * e-mail será como abaixo.
 * 
 * @author alexs
 *
 */
public class MyApplication {

	private IMessageService messageService;

	public MyApplication(){}

	public MyApplication(IMessageService messageService){
		this.messageService = messageService;
	}

	public void processMessages(String msg, String rec) throws Exception {
		if (this.messageService == null)
			throw new Exception("No message service instance");

		this.messageService.sendMessage(msg, rec);
	}

	public void setMessageService(IMessageService m) {
		this.messageService = m;
	}

}
