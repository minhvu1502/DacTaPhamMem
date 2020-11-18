

public class Originator {
	private String Code;
	
	private String lastUndoSaveCode;
	CareTaker careTaker;
	public String getCode() {
		return this.Code;
	}

	public void setCode(String code) {
		this.Code = code;
	}
	
	
	public Originator(String code, CareTaker careTaker) {
		super();
		this.Code = code;
		this.careTaker = careTaker;
		
		createSavepoint("INITIAL");
	}

	public void createSavepoint(String savepointName){
		careTaker.saveMemento(new Memento(this.Code), savepointName);
		lastUndoSaveCode = savepointName;
	}

	public void undo(){
		setOriginatorState(lastUndoSaveCode);
	}

	public void undo(String savepointName){
		setOriginatorState(savepointName);
	}

	public void undoAll(){
		setOriginatorState("INITIAL");
		careTaker.clearSavecode();
	}

	private void setOriginatorState(String savepointName){
		Memento mem = careTaker.getMemento(savepointName);
		this.Code = mem.getCode();
	}
	@Override
	public String toString(){
		return this.Code;
	}
}
