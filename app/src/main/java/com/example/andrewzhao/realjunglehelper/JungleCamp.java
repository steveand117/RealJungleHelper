package com.example.andrewzhao.realjunglehelper;

/**Creates a Jungle Camp Object with an input location and camp time
 * This will display a timer after a button is hit, counting down the camp time
 *
 */

public class JungleCamp {
    //Fields or properties about object
    int xpos;
    int ypos;
    int time;
    //declarations
    /**Creates a Jungle Camp Object with an input location and camp time
     * This will display a timer, progress bar, along with a imagebutton
     * The imagebutton will start the timer upon being clicked, and the
     * progress bar will be linked to the timer.
     *
     *@param t The time of the camp respawn in seconds
     *@param x The x position of the Jungle Camp Object
     *@param y The y position of the Jungle Camp Object
     *
     */

    public JungleCamp (int x, int y, int t){
        xpos = x;
        ypos = y;
        time = t;
    }
    //methods
}
