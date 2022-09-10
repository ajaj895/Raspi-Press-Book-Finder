/*
 * RaspiPress Book Finder
 * Written by Evan C.
 * September 10th, 2022
 *
 * RaspiPressBookFinder is a small webscraping program to see if any new Raspberry Pi Press books are available.
 * This program requires a connection to the internet to work. It also creates four small text files that are used to
 * track if there are new books available or not. If you modify those files, this program will not act as intended.
 * Note: This program counts the new books based on the last time it was run, so the first time it runs, it will show
 * all the books currently out as new books.
 *
 */

package com.ajaj895.RpiPress;

import com.ajaj895.RpiPress.MPBook.MagPiBookFinder;
import com.ajaj895.RpiPress.HSBook.HackSpaceBookFinder;
import com.ajaj895.RpiPress.WFBook.WireframeBookFinder;
import com.ajaj895.RpiPress.CPCBook.CustomPcBookFinder;

public class RaspiPressBookFinder {

    public static void main(String[] args){

        MagPiBookFinder.MagPi(args);
        HackSpaceBookFinder.HackSpace(args);
        WireframeBookFinder.Wireframe(args);
        CustomPcBookFinder.CustomPc(args);

    }

}
