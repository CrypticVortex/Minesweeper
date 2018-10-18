package com.crypticvortex.minesweeper.menus;

import com.crypticvortex.minesweeper.Application;

import javax.swing.*;

/**
 * Image icons for the buttons on the interface.
 *
 * @author jatboy
 */
public class MenuIcons {
    // ----- Counter Icons -----
    // Digits
    public static final ImageIcon COUNTER_0     = getIcon("counter/0.png");
    public static final ImageIcon COUNTER_1     = getIcon("counter/1.png");
    public static final ImageIcon COUNTER_2     = getIcon("counter/2.png");
    public static final ImageIcon COUNTER_3     = getIcon("counter/3.png");
    public static final ImageIcon COUNTER_4     = getIcon("counter/4.png");
    public static final ImageIcon COUNTER_5     = getIcon("counter/5.png");
    public static final ImageIcon COUNTER_6     = getIcon("counter/6.png");
    public static final ImageIcon COUNTER_7     = getIcon("counter/7.png");
    public static final ImageIcon COUNTER_8     = getIcon("counter/8.png");
    public static final ImageIcon COUNTER_9     = getIcon("counter/9.png");
    public static final ImageIcon COUNTER_DASH  = getIcon("counter/-.png");
    // Faces
    public static final ImageIcon FACE_SMILEY       = getIcon("faces/smiley.png");
    public static final ImageIcon FACE_SMILEY_PRESS = getIcon("faces/smiley_press.png");
    public static final ImageIcon FACE_COOL         = getIcon("faces/cool.png");
    public static final ImageIcon FACE_DEAD         = getIcon("faces/dead.png");
    public static final ImageIcon FACE_NERVOUS      = getIcon("faces/nervous.png");
    // ----- Minefield Icons ----
    // Flags
    public static final ImageIcon FLAG_RED       = getIcon("flags/flag_red.png");
    public static final ImageIcon FLAG_BLUE      = getIcon("flags/flag_blue.png");
    public static final ImageIcon FLAG_GREEN     = getIcon("flags/flag_green.png");
    public static final ImageIcon FLAG_PURPLE    = getIcon("flags/flag_purple.png");
    public static final ImageIcon FLAG_MAROON    = getIcon("flags/flag_maroon.png");
    public static final ImageIcon FLAG_TURQUOISE = getIcon("flags/flag_turquoise.png");
    public static final ImageIcon FLAG_BLACK     = getIcon("flags/flag_black.png");
    public static final ImageIcon FLAG_GRAY      = getIcon("flags/flag_gray.png");
    public static final ImageIcon FLAG_QUESTION  = getIcon("flags/flag_question.png");
    // Squares
    public static final ImageIcon DEFAULT       = getIcon("default.png");
    public static final ImageIcon EMPTY         = getIcon("empty.png");
    public static final ImageIcon MINE          = getIcon("mine.png");
    public static final ImageIcon MINE_PRESSED  = getIcon("mine_clicked.png");
    public static final ImageIcon NUMBER_1      = getIcon("1.png");
    public static final ImageIcon NUMBER_2      = getIcon("2.png");
    public static final ImageIcon NUMBER_3      = getIcon("3.png");
    public static final ImageIcon NUMBER_4      = getIcon("4.png");
    public static final ImageIcon NUMBER_5      = getIcon("5.png");
    public static final ImageIcon NUMBER_6      = getIcon("6.png");
    public static final ImageIcon NUMBER_7      = getIcon("7.png");
    public static final ImageIcon NUMBER_8      = getIcon("8.png");

    public static ImageIcon getIconFrom(int number) {
        switch(number) {
            case 1: return NUMBER_1;
            case 2: return NUMBER_2;
            case 3: return NUMBER_3;
            case 4: return NUMBER_4;
            case 5: return NUMBER_5;
            case 6: return NUMBER_6;
            case 7: return NUMBER_7;
            case 8: return NUMBER_8;
            default: return EMPTY;
        }
    }

    /**
     * Retrieves an icon from the local classpath.
     * @param file Index of the file to retrieve.
     * @return Requested image
     */
    private static ImageIcon getIcon(String file) {
        return new ImageIcon(Application.class.getResource("/images/" + file));
    }
}
