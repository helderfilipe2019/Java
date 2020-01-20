package designPatterns.behavioralPatterns.chainOfResponsibility;

public interface IReceiver {
	
	Boolean ProcessMessage(Message msg);

}
