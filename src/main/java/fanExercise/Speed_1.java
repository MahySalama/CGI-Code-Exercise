package fanExercise;

public class Speed_1 implements SpeedState {
	
	/**
     * Method Pull to pull the Speed cord of the Fan.
     * it increases the speed of the Fan by 1 level to be Speed 2.
     * @param pullSpeedCord: an object of type PullSpeedCord.  
     */
    public void pull(PullSpeedCord pullSpeedCord) {
    	pullSpeedCord.setState(new Speed_2());
        System.out.println("Fan is on Speed 2");
    }
}
