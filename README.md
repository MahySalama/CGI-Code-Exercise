# CGI-Fan Code Exercise-MahySalama

Fan Exercise Problem Statement:

Using Core Java, Implement a simple ceiling fan with these characteristics:
•  The unit has 2 pull cords:
o  One increases the speed each time it is pulled.  There are 3 speed settings, and an “off” (speed 0) setting. 
  If the cord is pulled on speed 3, the fan returns to the “off” setting.
o  One reverses the direction of the fan at the current speed setting.
  Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.
•  You can assume the unit is always powered (no wall switch)

• Technology used: Java Maven project.
• Design Pattern: State pattern: it is a behavioral design pattern that allows an object to change the behavior when its internal state changes.
The pattern extracts state-related behaviors into separate state classes and forces the original object to delegate the work to an instance of these classes, instead of acting on its own.

• Description:

o A PullSpeedCord object is composed of a SpeedState object. SpeedState is an interface that has four different implementations. Initially, the speed is Off, and when you pull the Speed cord at that time, the new speed will be at Speed 1. And so on, till you pull at Speed 3, the speed returns to Off.
In case you need to define an additional speed level, just add in a new class that implements the SpeedState interface and implement its pull method.
o A PullDirectionCord object is composed of a DirectionState object. DirectionState object is an interface that has two different implementations. Initially, the direction is at Clockwise, and when you pull the Direction cord at that time, it returns to AntiClockwise. And so on successively.

• The program Keeps prompting the user to enter a letter:
‘S’: to pull the Speed Cord of the Fan.
‘D’: to pull the Direction Cord of the Fan. (Clockwise or Anticlockwise).
‘Q’: to quit the program.

• Testing:
I implemented Junit test cases for the two classes PullSpeedCord and PullDirectionCord to test their states after pulling the Speed and Direction cords of the Fan.


