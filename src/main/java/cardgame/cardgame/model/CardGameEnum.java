package cardgame.cardgame.model;

import org.springframework.stereotype.Repository;

import java.util.stream.IntStream;
@Repository
public class CardGameEnum {
//    public static int[] point = IntStream.range(0, 16).toArray();
//{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    public static int[] point = new int[16];
    private static int a = 0;
    private static int b = 0;
    private static int c = 0;
    public static int[] status = new int[16];
    private static String kom = " ";
    public static String val = "Z";
    public static void setKom(String kom) {
        CardGameEnum.kom = kom;
    }
    public static String getKom() {
        return kom;
    }
    public static String getVal() {
        return val;
    }
    public static void setVal(String val) {
        CardGameEnum.val = val;
    }
    public static int getA() {
        return a;
    }
    public static void setA(int a) {
        CardGameEnum.a = a;
    }
    public static int getB() {
        return b;
    }
    public static void setB(int b) {
        CardGameEnum.b = b;
    }
    public static int getC() {
        return c;
    }
    public static void setC(int c) {
        CardGameEnum.c = c;
    }

    public enum Cards {
        One {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        point[0] = 0;
                        if (action == 1 && a < 4) {
                            ++a;
                            break;
                        }
                        if (action == 2 && a > 0) {
                            status[0] = 2;
                            --a;
                            break;
                        }
                        if (action == 3 && a > 0) {
                            status[0]= 3;
                            --a;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        point[0] = 0;
                        if (action == 1 && a < 3) {
                            a = a + 2;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 0) {
                            status[0] = 4;
                            --a;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        point[0] = 0;
                        if (action == 1 && a < 4 && b < 4) {
                            ++a;
                            ++b;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 0) {
                            status[0] = 4;
                            --a;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[0] = 0;
                        if (action == 1 && a < 3 && b < 4) {
                            a = a + 2;
                            ++b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[0];
            }
        },
        Two {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        point[1] = 0;
                        if (action == 1 && a < 4) {
                            ++a;
                            break;
                        }
                        if (action == 2 && a > 0) {
                            status[1] = 2;
                            --a;
                            break;
                        }
                        if (action == 3 && a > 0) {
                            status[1] = 3;
                            --a;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        point[1] = 0;
                        if (action == 1 && a < 3) {
                            a = a + 2;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 0) {
                            status[1] = 4;
                            --a;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        point[1] = 0;
                        if (action == 1 && a < 4 && b < 4) {
                            ++a;
                            ++b;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 0) {
                            status[1] = 4;
                            --a;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[1] = 0;
                        if (action == 1 && a < 3 && b < 4) {
                            a = a + 2;
                            ++b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[1];
            }
        },
        Three {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        point[2] = 0;
                        if (action == 1 && a < 4) {
                            ++a;
                            break;
                        }
                        if (action == 2 && a > 0) {
                            status[2] = 2;
                            --a;
                            break;
                        }
                        if (action == 3 && a > 0) {
                            status[2] = 3;
                            --a;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        point[2] = 0;
                        if (action == 1 && a < 3) {
                            a = a + 2;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 0) {
                            status[2] = 4;
                            --a;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        point[2] = 0;
                        if (action == 1 && a < 4 && b < 4) {
                            ++a;
                            ++b;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 0) {
                            status[2] = 4;
                            --a;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[2] = 0;
                        if (action == 1 && a < 3 && b < 4) {
                            a = a + 2;
                            ++b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[2];
            }
        },
        Four {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        if (action == 1 && b < 4) {
                            ++b;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 0) {
                            status[3] = 2;
                            point[3] = 1;
                            --a;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        if (action == 1 && b < 4) {
                            ++b;
                            break;
                        }
                        if (action == 2 && b > 0 && c > 0) {
                            status[3] = 3;
                            point[3] = 2;
                            --b;
                            --c;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        if (action == 1 && b < 43) {
                            b = b + 2;
                            break;
                        }
                        if (action == 2 && b > 1 && c > 1) {
                            status[3] = 4;
                            point[3] = 5;
                            b = b - 2;
                            c = c - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[3] = 5;
                        if (action == 1 || action == 2 || action == 3) {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[3];
            }
        },
        Five {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        if (action == 1 && b < 4) {
                            ++b;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 0) {
                            status[4] = 2;
                            point[4] = 1;
                            --a;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        if (action == 1 && b < 4) {
                            ++b;
                            break;
                        }
                        if (action == 2 && b > 0 && c > 0) {
                            status[4] = 3;
                            point[4] = 2;
                            --b;
                            --c;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        if (action == 1 && b < 3) {
                            b = b + 2;
                            break;
                        }
                        if (action == 2 && b > 1 && c > 1) {
                            status[4] = 4;
                            point[4] = 5;
                            b = b - 2;
                            c = c - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[4] = 5;
                        if (action == 1 || action == 2 || action == 3) {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[4];
            }
        },
        Six {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        if (action == 1 && b < 4) {
                            ++b;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 0) {
                            status[5] = 2;
                            point[5] = 1;
                            --a;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        if (action == 1 && b < 4) {
                            ++b;
                            break;
                        }
                        if (action == 2 && b > 0 && c > 0) {
                            status[5] = 3;
                            point[5] = 2;
                            --b;
                            --c;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        if (action == 1 && b < 3) {
                            b = b + 2;
                            break;
                        }
                        if (action == 2 && b > 1 && c > 1) {
                            status[5] = 4;
                            point[5] = 5;
                            b = b - 2;
                            c = c - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[5] = 5;
                        if (action == 1 || action == 2 || action == 3) {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[5];
            }
        },
        Seven {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        point[6] = 0;
                        if (action == 1 && b > 1) {
                            status[6] = 2;
                            b = b - 2;
                            break;
                        }
                        if (action == 2 && a > 1) {
                            status[6] = 3;
                            a = a - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        point[6] = 0;
                        if (action == 1 && c < 4) {
                            ++c;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 1) {
                            status[6] = 4;
                            --a;
                            b = b - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        if (action == 1 && c < 4) {
                            ++c;
                            break;
                        }
                        if (action == 2 && a > 1 && b > 0) {
                            status[6] = 4;
                            point[6] = 2;
                            a = a - 2;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[6] = 2;
                        if (action == 1 && c < 3) {
                            c = c + 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[6];
            }
        },
        Eight {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        point[7] = 0;
                        if (action == 1 && b > 1) {
                            status[7] = 2;
                            b = b - 2;
                            break;
                        }
                        if (action == 2 && a > 1) {
                            status[7] = 3;
                            a = a - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        point[7] = 0;
                        if (action == 1 && c < 4) {
                            ++c;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 1) {
                            status[7] = 4;
                            --a;
                            b = b - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        if (action == 1) {
                            ++c;
                            break;
                        }
                        if (action == 2 && a > 1 && b > 0) {
                            status[7] = 4;
                            point[7] = 2;
                            a = a - 2;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[7] = 2;
                        if (action == 1 && c < 3) {
                            c = c + 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[7];
            }
        },
        Nine {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        point[8] = 0;
                        if (action == 1 && b > 1) {
                            status[8] = 2;
                            b = b - 2;
                            break;
                        }
                        if (action == 2 && a > 1) {
                            status[8] = 3;
                            a = a - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        point[8] = 0;
                        if (action == 1 && c < 4) {
                            ++c;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 1) {
                            status[8] = 4;
                            --a;
                            b = b - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        if (action == 1 && c < 4) {
                            ++c;
                            break;
                        }
                        if (action == 2 && a > 1 && b > 0) {
                            status[8] = 4;
                            point[8] = 2;
                            a = a - 2;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[8] = 2;
                        if (action == 1 && c < 3) {
                            c = c + 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[8];
            }
        },
        Ten {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        point[9] = 0;
                        if (action == 1) {
                            if (val.contains("A") && a > 0 && c < 4) {
                                --a;
                                ++c;
                                break;
                            }
                            if (val.contains("B") && b > 0 && c < 4) {
                                --b;
                                ++c;
                                break;
                            }
                            else {
                                kom = "Niedozwolona akcja";
                            }
                            break;
                        }
                        if (action == 2 && b > 1) {
                            status[9] = 2;
                            b = b - 2;
                            break;
                        }
                        if (action == 3 && a > 1) {
                            status[9] = 3;
                            a = a - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        point[9] = 0;
                        if (action == 1 && b > 0 && a < 4 && c < 4) {
                            --b;
                            ++a;
                            ++c;
                            break;
                        }
                        if (action == 2 && b > 0 && c > 0) {
                            status[9] = 4;
                            --b;
                            --c;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        point[9] = 0;
                        if (action == 1 && a > 0 && b < 4 && c < 4) {
                            --a;
                            ++b;
                            ++c;
                            break;
                        }
                        if (action == 2 && a > 0 && c > 0) {
                            status[9] = 4;
                            --a;
                            --c;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[9] = 0;
                        if (action == 1) {
                            if (val.contains("A") && a > 0 && a < 4 && b < 4 && c < 4){
                                --a;
                                ++a;
                                ++b;
                                ++c;
                                break;
                            }
                            if (val.contains("B") && b > 0 && a < 4 && b < 4 && c < 4){
                                --b;
                                ++a;
                                ++b;
                                ++c;
                                break;
                            }
                            if (val.contains("C") && c > 0 && a < 4 && b < 4 && c < 4){
                                --c;
                                ++a;
                                ++b;
                                ++c;
                                break;
                            }
                            else {
                                kom = "Niedozwolona akcja";
                            }
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[9];
            }
        },
        Eleven {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        point[10] = 0;
                        if (action == 1) {
                            if (val.contains("A") && a > 1 && a < 4 && b < 4) {
                                a = a - 2;
                                ++a;
                                ++b;
                                break;
                            }
                            if (val.contains("B") && b > 1 && a < 4 && b < 4) {
                                b = b - 2;
                                ++a;
                                ++b;
                                break;
                            }
                            else {
                                kom = "Niedozwolona akcja";
                            }
                            break;
                        }
                        if (action == 2 && a > 0) {
                            status[10] = 2;
                            --a;
                            break;
                        }
                        if (action == 3 && b > 0) {
                            status[10] = 3;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        point[10] = 0;
                        if (action == 1) {
                            if (val.contains("A") && a > 1 && b < 2) {
                                a = a - 2;
                                b = b + 3;
                                break;
                            }
                            if (val.contains("C") && c > 1 && b < 2) {
                                c = c - 2;
                                b = b + 3;
                                break;
                            }
                            else {
                                kom = "Niedozwolona akcja";
                            }
                            break;
                        }
                        if (action == 2 && a > 0 && b > 0) {
                            status[10] = 4;
                            --a;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        point[10] = 0;
                        if (action == 1) {
                            if (val.contains("B") && b > 1 && a < 2) {
                                b = b - 2;
                                a = a + 3;
                                break;
                            }
                            if (val.contains("C") && c > 1 && a < 2){
                                c = c - 2;
                                a = a + 3;
                                break;
                            }
                            else {
                                kom = "Niedozwolona akcja";
                            }
                            break;
                        }
                        if (action == 2 && a > 0 && b > 0) {
                            status[10] = 4;
                            --a;
                            --b;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[10] = 0;
                        if (action == 1) {
                            if (val.contains("A") && a > 1 && c < 2){
                                a = a - 2;
                                c = c + 3;
                                break;
                            }
                            if (val.contains("B") && b > 1 && c < 2){
                                b = b - 2;
                                c = c + 3;
                                break;
                            }
                            else {
                                kom = "Niedozwolona akcja";
                            }
                            break;
                        }
                        if (action == 2 && c > 0) {
                            status[10] = 2;
                            --c;
                            break;
                        }
                        if (action == 3 && c > 0) {
                            status[10] = 3;
                            --c;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[10];
            }
        },
        Twelve {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        point[11] = 0;
                        if (action == 1 && a > 0 && b > 0) {
                            status[11] = 2;
                            --a;
                            --b;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 0 && c > 1) {
                            status[11] = 4;
                            --a;
                            --b;
                            c = c - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        point[11] = 0;
                        if (action == 1 && a < 4 && b < 4) {
                            ++a;
                            ++b;
                            break;
                        }
                        if (action == 2 && a > 0 && b > 0 && c > 0) {
                            status[11] = 3;
                            --a;
                            --b;
                            --c;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        if (action == 1 && a < 4 && b < 4 && c < 4) {
                            ++a;
                            ++b;
                            ++c;
                            break;
                        }
                        if (action == 2 && a > 1 && b > 1 && c > 1) {
                            status[11] = 4;
                            point[11] = 4;
                            a = a - 2;
                            b = b - 2;
                            c = c - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[11] = 4;
                        if (action == 1 || action == 2 || action == 3) {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[11];
            }
        },
        Thirteen {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        if (action == 1 && a > 0 && b > 0) {
                            status[12] = 2;
                            point[12] = 1;
                            --a;
                            --b;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        if (action == 1 && a > 0 && b > 0 && c > 0) {
                            status[12] = 3;
                            point[12] = 3;
                            --a;
                            --b;
                            --c;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        if (action == 1 && a > 1 && b > 1 && c > 1) {
                            status[12] = 4;
                            point[12] = 6;
                            a = a - 2;
                            b = b - 2;
                            c = c - 2;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[12] = 6;
                        if (action == 1 || action == 2 || action == 3) {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[12];
            }
        },
        Fourteen {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        if (action == 1 && a > 0 && b > 0) {
                            status[13] = 2;
                            point[13] = 1;
                            --a;
                            --b;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        if (action == 1 && a > 0 && b > 0 && c > 0) {
                            status[13] = 3;
                            point[13] = 3;
                            --a;
                            --b;
                            --c;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        if (action == 1 && a > 1 && b > 1 && c > 1) {
                            status[13] = 4;
                            point[13] = 6;
                            a = a - 2;
                            b = b - 2;
                            c = c - 2;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[13] = 6;
                        if (action == 1 || action == 2 || action == 3) {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[13];
            }
        },
        Fifteen {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        if (action == 1 && a > 0 && b > 0 && c > 1) {
                            status[14] = 2;
                            point[14] = 3;
                            --a;
                            --b;
                            c = c - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        if (action == 1 && a > 1 && b > 1 && c > 2) {
                            status[14] = 3;
                            point[14] = 6;
                            a = a - 2;
                            b = b - 2;
                            c = c - 3;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        if (action == 1 && a > 2 && b > 2 && c > 3) {
                            status[14] = 4;
                            point[14] = 10;
                            a = a - 3;
                            b = b - 3;
                            c = c - 4;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[14] = 10;
                        if (action == 1 || action == 2 || action == 3) {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[14];
            }
        },
        Sixteen {
            public int perform(int stat, int action, String val) {
                switch (stat) {
                    case 0:
                        if (action == 1 && a > 0 && b > 0 && c > 1) {
                            status[15] = 2;
                            point[15] = 3;
                            --a;
                            --b;
                            c = c - 2;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 2:
                        if (action == 1 && a > 1 && b > 1 && c > 2) {
                            status[15] = 3;
                            point[15] = 6;
                            a = a - 2;
                            b = b - 2;
                            c = c - 3;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 3:
                        if (action == 1 && a > 2 && b > 2 && c > 3) {
                            status[15] = 4;
                            point[15] = 10;
                            a = a - 3;
                            b = b - 3;
                            c = c - 4;
                            break;
                        }
                        else {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                    case 4:
                        point[15] = 10;
                        if (action == 1 || action == 2 || action == 3) {
                            kom = "Niedozwolona akcja";
                        }
                        break;
                }
                return status[15];
            }
        };
        public abstract int perform(int stat, int action, String val);

        public static void main(String[] args) {
            System.out.println("Wynik:" + Cards.Four.perform(3, 2, "B"));
            System.out.println(b);
            System.out.println(point[3]);
        }
    }
}
