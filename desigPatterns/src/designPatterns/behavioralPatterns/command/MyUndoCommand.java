package designPatterns.behavioralPatterns.command;

import designPatterns.structuralPatterns.bridge.IColor;

public class MyUndoCommand implements ICommand {

	private Receiver receiver;

	MyUndoCommand(Receiver recv) {
		receiver = recv;
	}

	@Override
	public void Do() {

		// Call undo in receiver
		receiver.performUndo();

	}

}
