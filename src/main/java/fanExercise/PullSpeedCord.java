package fanExercise;


public class PullSpeedCord {
	
        private SpeedState current;
        
        /**
         * Method getState to return the current state of the Fan Speed.
         * @return current: object of type SpeedState. 
         */
        public SpeedState getState() {
			return current;
		}

        /**
         * Constructor that creates new object of class OFF as initial state.
         */ 
		public PullSpeedCord() {
            current = new Off();
        }

		/**
	     * Method setState to set current state of the Fan to speedState.
	     * @param speedState: an object of type SpeedState.  
	     */
        public void setState(SpeedState speedState) {
            current = speedState;
        }

        /**
	     * Method pull to pull the Speed Cord based on "this" reference according 
	     * to the current speed of the Fan.
	     */
        public void pull() {
            current.pull(this);
        }

    }