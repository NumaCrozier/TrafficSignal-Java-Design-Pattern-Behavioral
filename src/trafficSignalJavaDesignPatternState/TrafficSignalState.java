package trafficSignalJavaDesignPatternState;

public class TrafficSignalState implements TrafficSignalInterface
{
	private final static int BUTTON_THRESHOLD_IN_SECONDS = 2;
	
	private TrafficSignalState state;
	private int stateSecondsRemaining; 

	public void setState(TrafficSignalState TSS) {
		
	
	}
	
	
	/*
	private TrafficSignalState(int durationInSeconds)
	{
		this.durationInSeconds = durationInSeconds;
	}
	
	public int getDurationInSeconds()
	{
		return this.durationInSeconds;
	}
	
	*/
}
