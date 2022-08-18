package fanExercise;

public class Clockwise implements DirectionState {
	
	/**
     * Method Pull to pull the Direction cord of the Fan.
     * it reverse the direction of the Fan to Anti-clockwise.
     * @param pullDirectionCord: an object of type PullDirectionCord.  
     */
    public void pull(PullDirectionCord pullDirectionCord) {
    	pullDirectionCord.setState(new AntiClockwise());
        System.out.println("Fan is on AntiClockwise direction");
    }
}