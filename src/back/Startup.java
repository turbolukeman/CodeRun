package back;

import front.input.keypresses.KeyBindings;
import front.output.Frame;
import front.output.character;
// This class is activated by the launchgame class
// This class starts up everything.
// It initializes most of the classes.
// It runs other code too. All code here will never be run again.
// Most classes will be initialized in here and just given to other classes through their constructors.
// Please do not name an object by the first letter of the class name. 
// You can use the full class name for the name of the object.
public class Startup{
    public Startup(){

        KeyBindings keyBindings = new KeyBindings();
        character character = new character();
        GameTimer GameTimer = new GameTimer();
        Frame frame = new Frame(keyBindings);
    }
}
