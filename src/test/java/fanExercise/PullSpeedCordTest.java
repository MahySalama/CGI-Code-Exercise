package fanExercise;

import static org.junit.Assert.*;

import org.junit.Test;

import fanExercise.Off;
import fanExercise.PullSpeedCord;
import fanExercise.Speed_1;
import fanExercise.Speed_2;
import fanExercise.Speed_3;

public class PullSpeedCordTest {	
	
	
	@Test
	public void test() {
		
		PullSpeedCord pullSpeedCord = new PullSpeedCord();
		
		assertTrue(pullSpeedCord.getState() instanceof Off);
		pullSpeedCord.pull();

		assertTrue(pullSpeedCord.getState() instanceof Speed_1);
	    pullSpeedCord.pull();

	    assertTrue(pullSpeedCord.getState() instanceof Speed_2);
	    pullSpeedCord.pull();
	    
	    assertTrue(pullSpeedCord.getState() instanceof Speed_3);
	    pullSpeedCord.pull();
	    
	    assertTrue(pullSpeedCord.getState() instanceof Off);
	    pullSpeedCord.pull();

	}

}
