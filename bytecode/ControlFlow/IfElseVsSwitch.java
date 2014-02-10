package scrimp.bytecode.ControlFlow;

import scrimp.Timer;
import scrimp.bytecode.ByteCodeTest;

public class IfElseVsSwitch implements ByteCodeTest{
    @Override
    public void run() {
        System.out.println("Best Case i = 0");
        System.out.println("  IfElse");
        Timer.StartTimer();
        ifElse(0);
        Timer.EndTimer();
        System.out.println("  Switch");
        Timer.StartTimer();
        swicthS(0);
        Timer.EndTimer();
        System.out.println("Worst Case i = 31");
        System.out.println("  IfElse");
        Timer.StartTimer();
        ifElse(31);
        Timer.EndTimer();
        System.out.println("  Switch");
        Timer.StartTimer();
        swicthS(31);
        Timer.EndTimer();
        System.out.println("Average Case i = 15");
        System.out.println("  IfElse");
        Timer.StartTimer();
        ifElse(15);
        Timer.EndTimer();
        System.out.println("  Switch");
        Timer.StartTimer();
        swicthS(15);
        Timer.EndTimer();
        System.out.println("Loop of 1..31 ");
        System.out.println("  IfElse");
        Timer.StartTimer();
        for (int i = 0; i <= 31; i++) {
            ifElse(i);
        }
        Timer.EndTimer();
        System.out.println("  Switch");
        Timer.StartTimer();
        for (int i = 0; i <= 31; i++) {
            swicthS(i);
        }
        Timer.EndTimer();


    }


    public static final int swicthS(int i) {
        switch(i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            case 22:
                return 22;
            case 23:
                return 23;
            case 24:
                return 24;
            case 25:
                return 25;
            case 26:
                return 26;
            case 27:
                return 27;
            case 28:
                return 28;
            case 29:
                return 29;
            case 30:
                return 30;
            default:
                return 31;
        }
    }

    public static final int ifElse(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else if (i == 2) {
            return 2;
        } else if (i == 3) {
            return 3;
        } else if (i == 4) {
            return 4;
        } else if (i == 5) {
            return 5;
        } else if (i == 6) {
            return 6;
        } else if (i == 7) {
            return 7;
        } else if (i == 8) {
            return 8;
        } else if (i == 9) {
            return 9;
        } else if (i == 10) {
            return 10;
        } else if (i == 11) {
            return 11;
        } else if (i == 12) {
            return 12;
        } else if (i == 13) {
            return 13;
        } else if (i == 14) {
            return 14;
        } else if (i == 15) {
            return 15;
        } else if (i == 16) {
            return 16;
        } else if (i == 17) {
            return 17;
        } else if (i == 18) {
            return 18;
        } else if (i == 19) {
            return 19;
        } else if (i == 20) {
            return 20;
        } else if (i == 21) {
            return 21;
        } else if (i == 22) {
            return 22;
        } else if (i == 23) {
            return 23;
        } else if (i == 24) {
            return 24;
        } else if (i == 25) {
            return 25;
        } else if (i == 26) {
            return 26;
        } else if (i == 27) {
            return 27;
        } else if (i == 28) {
            return 28;
        } else if (i == 29) {
            return 29;
        } else if (i == 30) {
            return 30;
        } else {
            return 31;
        }
    }
}
