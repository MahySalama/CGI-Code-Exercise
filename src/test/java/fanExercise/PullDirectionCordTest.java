package fanExercise;

import static org.junit.Assert.*;

import org.junit.Test;

import fanExercise.AntiClockwise;
import fanExercise.Clockwise;
import fanExercise.PullDirectionCord;

public class PullDirectionCordTest {

	@Test
	public void test() {
        PullDirectionCord pullDirectionCord = new PullDirectionCord();
		
		assertTrue(pullDirectionCord.getState() instanceof Clockwise);
		pullDirectionCord.pull();

		assertTrue(pullDirectionCord.getState() instanceof AntiClockwise);
		pullDirectionCord.pull();

	    assertTrue(pullDirectionCord.getState() instanceof Clockwise);
	    pullDirectionCord.pull();
	    
	    assertTrue(pullDirectionCord.getState() instanceof AntiClockwise);
		pullDirectionCord.pull();
	}

}
