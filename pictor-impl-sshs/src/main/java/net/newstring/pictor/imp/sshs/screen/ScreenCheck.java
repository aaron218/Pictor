package net.newstring.pictor.imp.sshs.screen;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TabBehaviour;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.virtual.DefaultVirtualTerminal;

import java.io.IOException;

public class ScreenCheck {

    public static void main(String[] args)
    {
        System.out.println("FACE_WHITE = " + Symbols.FACE_WHITE);
        System.out.println("FACE_BLACK = " + Symbols.FACE_BLACK);
        System.out.println("HEART = " + Symbols.HEART);
        System.out.println("CLUB = " + Symbols.CLUB);
        System.out.println("DIAMOND = " + Symbols.DIAMOND);
        System.out.println("SPADES = " + Symbols.SPADES);
        System.out.println("BULLET = " + Symbols.BULLET);
        System.out.println("INVERSE_BULLET = " + Symbols.INVERSE_BULLET);
        System.out.println("WHITE_CIRCLE = " + Symbols.WHITE_CIRCLE);
        System.out.println("INVERSE_WHITE_CIRCLE = " + Symbols.INVERSE_WHITE_CIRCLE);
        System.out.println("FEMALE = " + Symbols.FEMALE);
        System.out.println("MALE = " + Symbols.MALE);
        System.out.println();
        System.out.println("ARROW_UP = " + Symbols.ARROW_UP);
        System.out.println("ARROW_DOWN = " + Symbols.ARROW_DOWN);
        System.out.println("ARROW_RIGHT = " + Symbols.ARROW_RIGHT);
        System.out.println("ARROW_LEFT = " + Symbols.ARROW_LEFT);
        System.out.println();
        System.out.println("BLOCK_SOLID = " + Symbols.BLOCK_SOLID);
        System.out.println("BLOCK_DENSE = " + Symbols.BLOCK_DENSE);
        System.out.println("BLOCK_MIDDLE = " + Symbols.BLOCK_MIDDLE);
        System.out.println("BLOCK_SPARSE = " + Symbols.BLOCK_SPARSE);
        System.out.println();
        System.out.println("SINGLE_LINE_HORIZONTAL = " + Symbols.SINGLE_LINE_HORIZONTAL);
        System.out.println("DOUBLE_LINE_HORIZONTAL = " + Symbols.DOUBLE_LINE_HORIZONTAL);
        System.out.println("SINGLE_LINE_VERTICAL = " + Symbols.SINGLE_LINE_VERTICAL);
        System.out.println("DOUBLE_LINE_VERTICAL = " + Symbols.DOUBLE_LINE_VERTICAL);
        System.out.println();
        System.out.println("SINGLE_LINE_TOP_LEFT_CORNER = " + Symbols.SINGLE_LINE_TOP_LEFT_CORNER);
        System.out.println("DOUBLE_LINE_TOP_LEFT_CORNER = " + Symbols.DOUBLE_LINE_TOP_LEFT_CORNER);
        System.out.println("SINGLE_LINE_TOP_RIGHT_CORNER = " + Symbols.SINGLE_LINE_TOP_RIGHT_CORNER);
        System.out.println("DOUBLE_LINE_TOP_RIGHT_CORNER = " + Symbols.DOUBLE_LINE_TOP_RIGHT_CORNER);
        System.out.println();
        System.out.println("SINGLE_LINE_BOTTOM_LEFT_CORNER = " + Symbols.SINGLE_LINE_BOTTOM_LEFT_CORNER);
        System.out.println("DOUBLE_LINE_BOTTOM_LEFT_CORNER = " + Symbols.DOUBLE_LINE_BOTTOM_LEFT_CORNER);
        System.out.println("SINGLE_LINE_BOTTOM_RIGHT_CORNER = " + Symbols.SINGLE_LINE_BOTTOM_RIGHT_CORNER);
        System.out.println("DOUBLE_LINE_BOTTOM_RIGHT_CORNER = " + Symbols.DOUBLE_LINE_BOTTOM_RIGHT_CORNER);
        System.out.println();
        System.out.println("SINGLE_LINE_CROSS = " + Symbols.SINGLE_LINE_CROSS);
        System.out.println("DOUBLE_LINE_CROSS = " + Symbols.DOUBLE_LINE_CROSS);
        System.out.println();
        System.out.println("SINGLE_LINE_T_UP = " + Symbols.SINGLE_LINE_T_UP);
        System.out.println("SINGLE_LINE_T_DOWN = " + Symbols.SINGLE_LINE_T_DOWN);
        System.out.println("SINGLE_LINE_T_RIGHT = " + Symbols.SINGLE_LINE_T_RIGHT);
        System.out.println("SINGLE_LINE_T_LEFT = " + Symbols.SINGLE_LINE_T_LEFT);
        System.out.println();
        System.out.println("SINGLE_LINE_T_DOUBLE_UP = " + Symbols.SINGLE_LINE_T_DOUBLE_UP);
        System.out.println("SINGLE_LINE_T_DOUBLE_DOWN = " + Symbols.SINGLE_LINE_T_DOUBLE_DOWN);
        System.out.println("SINGLE_LINE_T_DOUBLE_RIGHT = " + Symbols.SINGLE_LINE_T_DOUBLE_RIGHT);
        System.out.println("SINGLE_LINE_T_DOUBLE_LEFT = " + Symbols.SINGLE_LINE_T_DOUBLE_LEFT);
        System.out.println();
        System.out.println("DOUBLE_LINE_T_UP = " + Symbols.DOUBLE_LINE_T_UP);
        System.out.println("DOUBLE_LINE_T_DOWN = " + Symbols.DOUBLE_LINE_T_DOWN);
        System.out.println("DOUBLE_LINE_T_RIGHT = " + Symbols.DOUBLE_LINE_T_RIGHT);
        System.out.println("DOUBLE_LINE_T_LEFT = " + Symbols.DOUBLE_LINE_T_LEFT);
        System.out.println();
        System.out.println("DOUBLE_LINE_T_SINGLE_UP = " + Symbols.DOUBLE_LINE_T_SINGLE_UP);
        System.out.println("DOUBLE_LINE_T_SINGLE_DOWN = " + Symbols.DOUBLE_LINE_T_SINGLE_DOWN);
        System.out.println("DOUBLE_LINE_T_SINGLE_RIGHT = " + Symbols.DOUBLE_LINE_T_SINGLE_RIGHT);
        System.out.println("DOUBLE_LINE_T_SINGLE_LEFT = " + Symbols.DOUBLE_LINE_T_SINGLE_LEFT);
    }
}
