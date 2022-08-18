package fanExercise;

public class AntiClockwise implements DirectionState {
	
	/**
     * Method Pull to pull the Direction cord of the Fan.
     * it reverse the direction of the Fan to clockwise.
     * @param pullDirectionCord: an object of type PullDirectionCord.  
     */
    public void pull(PullDirectionCord pullDirectionCord) {
    	pullDirectionCord.setState(new Clockwise());
        System.out.println("Fan is on Clockwise direction");
    }
}