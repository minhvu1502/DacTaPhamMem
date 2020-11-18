import java.util.HashMap;
import java.util.Map;


public class CareTaker {
	private final Map<String, Memento> saveCodeStorage = new HashMap<String, Memento>();

	public void saveMemento(Memento memento,String saveCodeName){
		System.out.println("Saving state..."+saveCodeName);
		saveCodeStorage.put(saveCodeName, memento);
	}

	public Memento getMemento(String saveCodeName){
		System.out.println("Undo at ..."+saveCodeName);
		return saveCodeStorage.get(saveCodeName);
	}

	public void clearSavecode(){
		System.out.println("Clearing all save code...");
		saveCodeStorage.clear();
	}
}
