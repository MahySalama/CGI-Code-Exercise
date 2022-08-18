package fanExercise;

public class PullDirectionCord {
	
    private DirectionState current;
 
    /**
     * Method getState to return the current state of the Fan Direction.
     * @return current: object of type DirectionState. 
     */
    public DirectionState getState() {
		return current;
	}
    /**
     * Constructor that creates new object of class Clockwise as initial state.
     */ 
	public PullDirectionCord() {
        current = new Clockwise();
    }

	/**
     * Method setState to set current state of the Fan to directionState.
     * @param directionState: an object of type DirectionState.  
     */
    public void setState(DirectionState directionState) {
        current = directionState;
    }

    /**
     * Method pull to pull the Direction Cord based on "this" reference according 
     * to the current direction of the Fan.
     */
    public void pull() {
        current.pull(this);
    }

}