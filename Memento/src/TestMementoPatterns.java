

public class TestMementoPatterns {
	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		Originator originator = new Originator("Code...1", careTaker);
		
		System.out.println("Default State: "+originator);
		
		originator.setCode("Code Modified...2");
		
		System.out.println("State: "+ originator);
		originator.createSavepoint("SAVE1");
		
		originator.setCode("Code Modified...3");
		System.out.println("State: "+originator);
		
		originator.undo();
		System.out.println("State after undo: "+originator);
		
		originator.setCode("Code Modified...3");
		originator.createSavepoint("SAVE2");
		System.out.println("State: "+originator);
		originator.setCode("Code Modified...4");
		originator.createSavepoint("SAVE3");
		System.out.println("State: "+originator);
		originator.setCode("Code Modified...5");
		originator.createSavepoint("SAVE4");
		System.out.println("State: "+originator);
		
		originator.undo("SAVE2");
		System.out.println("Retrieving at: "+originator);
		
		originator.undoAll();
		System.out.println("State after undo all: "+originator);
	}
}
