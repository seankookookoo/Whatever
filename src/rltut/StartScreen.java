/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rltut;

import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;

/**
 *
 * @author s-koos
 */
public class StartScreen implements Screen {

    @Override
    public void displayOutput(AsciiPanel terminal) {
        terminal.write("rl tutorial", 1, 1);
        terminal.writeCenter("-- press [enter] to start --", 22);
        
    
    }

    @Override
    public Screen respondToUserInput(KeyEvent key) {
        
        return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
        
    }
}
