package net.newstring.pictor.demo.core;

public class PRINT {
    public static void main(String[] args) {
        System.out.println("\033c");

        System.out.println("Hello \u001b[38;5;66;66;166m 前端颜色! \u001b[0m");

        System.out.println("\033[30;4m" + "颜色自检 30 4" + "\033[0m");
        System.out.println("\033[31;4m" + "颜色自检 31" + "\033[0m");
        System.out.println("\033[32;4m" + "颜色自检 32" + "\033[0m");
        System.out.println("\033[33;4m" + "颜色自检 33" + "\033[0m");
        System.out.println("\033[34;4m" + "颜色自检 34" + "\033[0m");
        System.out.println("\033[35;4m" + "颜色自检 35" + "\033[0m");
        System.out.println("\033[36;4m" + "颜色自检 36" + "\033[0m");
        System.out.println("\033[37;4m" + "颜色自检 37" + "\033[0m");

        System.out.println("\033[90;4m" + "颜色自检 90 4" + "\033[0m");
        System.out.println("\033[91;4m" + "颜色自检 91" + "\033[0m");
        System.out.println("\033[92;4m" + "颜色自检 92" + "\033[0m");
        System.out.println("\033[93;4m" + "颜色自检 93" + "\033[0m");
        System.out.println("\033[94;4m" + "颜色自检 94" + "\033[0m");
        System.out.println("\033[95;4m" + "颜色自检 95" + "\033[0m");
        System.out.println("\033[96;4m" + "颜色自检 96" + "\033[0m");
        System.out.println("\033[97;4m" + "颜色自检 97" + "\033[0m");

        System.out.println("\033[40;31;4m" + "颜色自检 40 31" + "\033[0m");
        System.out.println("\033[41;32;4m" + "颜色自检 41 32" + "\033[0m");
        System.out.println("\033[42;33;4m" + "颜色自检" + "\033[0m");
        System.out.println("\033[43;34;4m" + "颜色自检" + "\033[0m");
        System.out.println("\033[44;35;4m" + "颜色自检" + "\033[0m");
        System.out.println("\033[45;36;4m" + "颜色自检" + "\033[0m");
        System.out.println("\033[46;37;4m" + "颜色自检" + "\033[0m");
        System.out.println("\033[47;4m" + "颜色自检" + "\033[0m");

        System.out.println("\033[40;91;4m" + "颜色自检 40 31" + "\033[0m");
        System.out.println("\033[41;92;4m" + "颜色自检 41 32" + "\033[0m");
        System.out.println("\033[42;93;4m" + "颜色自检" + "\033[0m");
        System.out.println("\033[43;94;4m" + "颜色自检" + "\033[0m");
        System.out.println("\033[44;95;4m" + "颜色自检" + "\033[0m");
        System.out.println("\033[45;96;4m" + "颜色自检" + "\033[0m");
        System.out.println("\033[46;97;4m" + "颜色自检" + "\033[0m");
        System.out.println("\033[47;90;4m" + "颜色自检" + "\033[0m");
        
        
        PRINT.PN("黑色", PRINT.BLACK);
        PRINT.PN("白色", PRINT.WHITE);
        PRINT.PN("红色", PRINT.RED);
        PRINT.PN("绿色", PRINT.GREEN);
        PRINT.PN("黄色", PRINT.YELLOW);
        PRINT.PN("蓝色", PRINT.BLUE);
        PRINT.PN("品红", PRINT.MAGENTA);
        PRINT.PN("蓝绿", PRINT.CYAN);
        PRINT.PN("黑底白字", PRINT.WHITE, PRINT.BLACK_BACKGROUND);
        PRINT.PN("白底黑字", PRINT.BLACK, PRINT.WHITE_BACKGROUND);
        PRINT.PN("蓝底红字", PRINT.RED, PRINT.BLUE_BACKGROUND);
        PRINT.PN("加粗倾斜", PRINT.BOLD, PRINT.ITATIC);
        PRINT.PN("黄底白字下划线", PRINT.WHITE, PRINT.YELLOW_BACKGROUND, PRINT.UNDERLINE);
        PRINT.PN("红字颜色反转", PRINT.RED, PRINT.REVERSE);
    }

    public static final int WHITE = 30;             // 白色
    public static final int WHITE_BACKGROUND = 40;  // 白色背景
    public static final int RED = 31;               // 红色
    public static final int RED_BACKGROUND = 41;    // 红色背景
    public static final int GREEN = 32;             // 绿色
    public static final int GREEN_BACKGROUND = 42;  // 绿色背景
    public static final int YELLOW = 33;            // 黄色
    public static final int YELLOW_BACKGROUND = 43; // 黄色背景
    public static final int BLUE = 34;              // 蓝色
    public static final int BLUE_BACKGROUND = 44;   // 蓝色背景
    public static final int MAGENTA = 35;           // 品红（洋红）
    public static final int MAGENTA_BACKGROUND = 45;// 品红背景
    public static final int CYAN = 36;              // 蓝绿
    public static final int CYAN_BACKGROUND = 46;   // 蓝绿背景
    public static final int BLACK = 37;             // 黑色
    public static final int BLACK_BACKGROUND = 47;  // 黑色背景

    public static final int BOLD = 1;       // 粗体
    public static final int ITATIC = 3;     // 斜体
    public static final int UNDERLINE = 4;  // 下划线
    public static final int REVERSE = 7;    // 反转

    private static String FMT(String txt, int... codes) {
        StringBuffer sb = new StringBuffer();
        for (int code : codes) {
            sb.append(code + ";");
        }
        String _code = sb.toString();
        if (_code.endsWith(";")) {
            _code = _code.substring(0, _code.length() - 1);
        }
        return (char) 27 + "[" + _code + "m" + txt + (char) 27 + "[0m";
    }

    /**
     * 打印不换行
     */
    public static void P(String txt, int... codes) {
        System.out.print(FMT(txt, codes));
    }

    /**
     * 打印并换行
     */
    public static void PN(String txt, int... codes) {
        System.out.println(FMT(txt, codes));
    }

    /**
     * 默认打印红色文字
     */
    public static void PN(String txt) {
        System.out.println(FMT(txt, new int[]{RED}));
    }

}
