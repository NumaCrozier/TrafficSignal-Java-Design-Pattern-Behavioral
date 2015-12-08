package trafficSignalJavaDesignPatternState;

public abstract class State {

	public State() {
		
	}
	
	public void callbutton(TrafficSignal ts) {
			System.out.println("Button pressed!");
			System.out.flush();

			switch (this.state)
			{
				case ORANGE: 
				case RED: return;
				case GREEN:
				{
					if (this.stateSecondsRemaining > BUTTON_THRESHOLD_IN_SECONDS)
						this.stateSecondsRemaining = BUTTON_THRESHOLD_IN_SECONDS;					
				}
			}

		
	}
	
	public void tick(TrafficSignal ts) {
		
		
	}
	
}
