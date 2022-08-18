package fanExercise;

public class Speed_3 implements SpeedState {
	
	/**
     * Method Pull to pull the Speed cord of the Fan.
     * it switches off the Fan, it transfers the Speed of the fan from Speed 3 to off.
     * @param pullSpeedCord: an object of type PullSpeedCord.  
     */
    public void pull(PullSpeedCord pullSpeedCord) {
    	pullSpeedCord.setState(new Off());
        System.out.println("Fan is Off");
    }
}
