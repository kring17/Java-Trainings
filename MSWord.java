package M2Activity5;

public class MSWord extends Program{

	public MSWord(String name) {
		setName("MSWord");
	}
	
	

	@Override
	public void run() {
		System.out.println("Opening MS Word...");
		setRunning(true);
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping MS Word...");
		setRunning(false);
	}
	
}
