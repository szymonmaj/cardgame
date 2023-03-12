package cardgame.cardgame.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CardGameDeck {
    private int[] point = new int[16];
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int[] status = new int[16];
    private int statusNumber;
    private String kom = " ";
    private String val = "Z";
    public void setKom(String kom) {
        this.kom = kom;
    }
    public String getKom() {
        return kom;
    }
    public String getVal() {
        return val;
    }
    public void setVal(String val) {
        this.val = val;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int[] getPoint() {
        return point;
    }
    public int[] getStatus() {
        return status;
    }
    public void setPoint(int[] point) {
        this.point = point;
    }
    public void setStatus(int[] status) {
        this.status = status;
    }

    public int perform(String card, int stat, int action, String val) {
        if (card.equals("One")) {
            if (stat == 0) {
                point[0] = 0;
                if (action == 1 && a < 4) {
                    ++a;
                    return status[0];
                }
                if (action == 2 && a > 0) {
                    status[0] = 2;
                    --a;
                    return status[0];
                }
                if (action == 3 && a > 0) {
                    status[0]= 3;
                    --a;
                    return status[0];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                point[0] = 0;
                if (action == 1 && a < 3) {
                    a = a + 2;
                    return status[0];
                }
                if (action == 2 && a > 0 && b > 0) {
                    status[0] = 4;
                    --a;
                    --b;
                    return status[0];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                point[0] = 0;
                if (action == 1 && a < 4 && b < 4) {
                    ++a;
                    ++b;
                    return status[0];
                }
                if (action == 2 && a > 0 && b > 0) {
                    status[0] = 4;
                    --a;
                    --b;
                    return status[0];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[0] = 0;
                if (action == 1 && a < 3 && b < 4) {
                    a = a + 2;
                    ++b;
                    return status[0];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 0;
        }
        if (card.equals("Two")) {
            if (stat == 0) {
                point[1] = 0;
                if (action == 1 && a < 4) {
                    ++a;
                    return status[1];
                }
                if (action == 2 && a > 0) {
                    status[1] = 2;
                    --a;
                    return status[1];
                }
                if (action == 3 && a > 0) {
                    status[1]= 3;
                    --a;
                    return status[1];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                point[1] = 0;
                if (action == 1 && a < 3) {
                    a = a + 2;
                    return status[1];
                }
                if (action == 2 && a > 0 && b > 0) {
                    status[1] = 4;
                    --a;
                    --b;
                    return status[1];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                point[1] = 0;
                if (action == 1 && a < 4 && b < 4) {
                    ++a;
                    ++b;
                    return status[1];
                }
                if (action == 2 && a > 0 && b > 0) {
                    status[1] = 4;
                    --a;
                    --b;
                    return status[1];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[1] = 0;
                if (action == 1 && a < 3 && b < 4) {
                    a = a + 2;
                    ++b;
                    return status[1];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 1;
        }
        if (card.equals("Three")) {
            if (stat == 0) {
                point[2] = 0;
                if (action == 1 && a < 4) {
                    ++a;
                    return status[2];
                }
                if (action == 2 && a > 0) {
                    status[2] = 2;
                    --a;
                    return status[2];
                }
                if (action == 3 && a > 0) {
                    status[2]= 3;
                    --a;
                    return status[2];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                point[2] = 0;
                if (action == 1 && a < 3) {
                    a = a + 2;
                    return status[2];
                }
                if (action == 2 && a > 0 && b > 0) {
                    status[2] = 4;
                    --a;
                    --b;
                    return status[2];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                point[2] = 0;
                if (action == 1 && a < 4 && b < 4) {
                    ++a;
                    ++b;
                    return status[2];
                }
                if (action == 2 && a > 0 && b > 0) {
                    status[2] = 4;
                    --a;
                    --b;
                    return status[2];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[2] = 0;
                if (action == 1 && a < 3 && b < 4) {
                    a = a + 2;
                    ++b;
                    return status[2];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 2;
        }
        if (card.equals("Four")) {
            if (stat == 0) {
                if (action == 1 && b < 4) {
                    ++b;
                    return status[3];
                }
                if (action == 2 && a > 0 && b > 0) {
                    status[3] = 2;
                    point[3] = 1;
                    --a;
                    --b;
                    return status[3];
                } else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                if (action == 1 && b < 4) {
                    ++b;
                    return status[3];
                }
                if (action == 2 && b > 0 && c > 0) {
                    status[3] = 3;
                    point[3] = 2;
                    --b;
                    --c;
                    return status[3];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                if (action == 1 && b < 43) {
                    b = b + 2;
                    return status[3];
                }
                if (action == 2 && b > 1 && c > 1) {
                    status[3] = 4;
                    point[3] = 5;
                    b = b - 2;
                    c = c - 2;
                    return status[3];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[3] = 5;
                if (action == 1 || action == 2 || action == 3) {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 3;
        }
        if (card.equals("Five")) {
            if (stat == 0) {
                if (action == 1 && b < 4) {
                    ++b;
                    return status[4];
                }
                if (action == 2 && a > 0 && b > 0) {
                    status[4] = 2;
                    point[4] = 1;
                    --a;
                    --b;
                    return status[4];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                if (action == 1 && b < 4) {
                    ++b;
                    return status[4];
                }
                if (action == 2 && b > 0 && c > 0) {
                    status[4] = 3;
                    point[4] = 2;
                    --b;
                    --c;
                    return status[4];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                if (action == 1 && b < 43) {
                    b = b + 2;
                    return status[4];
                }
                if (action == 2 && b > 1 && c > 1) {
                    status[4] = 4;
                    point[4] = 5;
                    b = b - 2;
                    c = c - 2;
                    return status[4];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[4] = 5;
                if (action == 1 || action == 2 || action == 3) {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 4;
        }
        if (card.equals("Six")) {
            if (stat == 0) {
                if (action == 1 && b < 4) {
                    ++b;
                    return status[5];
                }
                if (action == 2 && a > 0 && b > 0) {
                    status[5] = 2;
                    point[5] = 1;
                    --a;
                    --b;
                    return status[5];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                if (action == 1 && b < 4) {
                    ++b;
                    return status[5];
                }
                if (action == 2 && b > 0 && c > 0) {
                    status[5] = 3;
                    point[5] = 2;
                    --b;
                    --c;
                    return status[5];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                if (action == 1 && b < 43) {
                    b = b + 2;
                    return status[5];
                }
                if (action == 2 && b > 1 && c > 1) {
                    status[5] = 4;
                    point[5] = 5;
                    b = b - 2;
                    c = c - 2;
                    return status[5];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[5] = 5;
                if (action == 1 || action == 2 || action == 3) {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 5;
        }
        if (card.equals("Seven")) {
            if (stat == 0) {
                point[6] = 0;
                if (action == 1 && b > 1) {
                    status[6] = 2;
                    b = b - 2;
                    return status[6];
                }
                if (action == 2 && a > 1) {
                    status[6] = 3;
                    a = a - 2;
                    return status[6];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                point[6] = 0;
                if (action == 1 && c < 4) {
                    ++c;
                    return status[6];
                }
                if (action == 2 && a > 0 && b > 1) {
                    status[6] = 4;
                    --a;
                    b = b - 2;
                    return status[6];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                if (action == 1 && c < 4) {
                    ++c;
                    return status[6];
                }
                if (action == 2 && a > 1 && b > 0) {
                    status[6] = 4;
                    point[6] = 2;
                    a = a - 2;
                    --b;
                    return status[6];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[6] = 2;
                if (action == 1 && c < 3) {
                    c = c + 2;
                    return status[6];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 6;
        }
        if (card.equals("Eight")) {
            if (stat == 0) {
                point[7] = 0;
                if (action == 1 && b > 1) {
                    status[7] = 2;
                    b = b - 2;
                    return status[7];
                }
                if (action == 2 && a > 1) {
                    status[7] = 3;
                    a = a - 2;
                    return status[7];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                point[7] = 0;
                if (action == 1 && c < 4) {
                    ++c;
                    return status[7];
                }
                if (action == 2 && a > 0 && b > 1) {
                    status[7] = 4;
                    --a;
                    b = b - 2;
                    return status[7];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                if (action == 1 && c < 4) {
                    ++c;
                    return status[7];
                }
                if (action == 2 && a > 1 && b > 0) {
                    status[7] = 4;
                    point[7] = 2;
                    a = a - 2;
                    --b;
                    return status[7];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[7] = 2;
                if (action == 1 && c < 3) {
                    c = c + 2;
                    return status[7];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 7;
        }
        if (card.equals("Nine")) {
            if (stat == 0) {
                point[8] = 0;
                if (action == 1 && b > 1) {
                    status[8] = 2;
                    b = b - 2;
                    return status[8];
                }
                if (action == 2 && a > 1) {
                    status[8] = 3;
                    a = a - 2;
                    return status[8];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                point[8] = 0;
                if (action == 1 && c < 4) {
                    ++c;
                    return status[8];
                }
                if (action == 2 && a > 0 && b > 1) {
                    status[8] = 4;
                    --a;
                    b = b - 2;
                    return status[8];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                if (action == 1 && c < 4) {
                    ++c;
                    return status[8];
                }
                if (action == 2 && a > 1 && b > 0) {
                    status[8] = 4;
                    point[8] = 2;
                    a = a - 2;
                    --b;
                    return status[8];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[8] = 2;
                if (action == 1 && c < 3) {
                    c = c + 2;
                    return status[8];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 8;
        }
        if (card.equals("Ten")) {
            if (stat == 0) {
                point[9] = 0;
                if (action == 1) {
                    if (val.contains("A") && a > 0 && c < 4) {
                        --a;
                        ++c;
                        return status[9];
                    }
                    if (val.contains("B") && b > 0 && c < 4) {
                        --b;
                        ++c;
                        return status[9];
                    }
                    else {
                        kom = "Niedozwolona akcja";
                    }
                }
                if (action == 2 && b > 1) {
                    status[9] = 2;
                    b = b - 2;
                    return status[9];
                }
                if (action == 3 && a > 1) {
                    status[9] = 3;
                    a = a - 2;
                    return status[9];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                point[9] = 0;
                if (action == 1 && b > 0 && a < 4 && c < 4) {
                    --b;
                    ++a;
                    ++c;
                    return status[9];
                }
                if (action == 2 && b > 0 && c > 0) {
                    status[9] = 4;
                    --b;
                    --c;
                    return status[9];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                point[9] = 0;
                if (action == 1 && a > 0 && b < 4 && c < 4) {
                    --a;
                    ++b;
                    ++c;
                    return status[9];
                }
                if (action == 2 && a > 0 && c > 0) {
                    status[9] = 4;
                    --a;
                    --c;
                    return status[9];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[9] = 0;
                if (action == 1) {
                    if (val.contains("A") && a > 0 && a < 4 && b < 4 && c < 4){
                        --a;
                        ++a;
                        ++b;
                        ++c;
                        return status[9];
                    }
                    if (val.contains("B") && b > 0 && a < 4 && b < 4 && c < 4){
                        --b;
                        ++a;
                        ++b;
                        ++c;
                        return status[9];
                    }
                    if (val.contains("C") && c > 0 && a < 4 && b < 4 && c < 4){
                        --c;
                        ++a;
                        ++b;
                        ++c;
                        return status[9];
                    }
                    else {
                        kom = "Niedozwolona akcja";
                    }
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 9;
        }
        if (card.equals("Eleven")) {
            if (stat == 0) {
                point[10] = 0;
                if (action == 1) {
                    if (val.contains("A") && a > 1 && a < 4 && b < 4) {
                        a = a - 2;
                        ++a;
                        ++b;
                        return status[10];
                    }
                    if (val.contains("B") && b > 1 && a < 4 && b < 4) {
                        b = b - 2;
                        ++a;
                        ++b;
                        return status[10];
                    }
                    else {
                        kom = "Niedozwolona akcja";
                    }
                }
                if (action == 2 && a > 0) {
                    status[10] = 2;
                    --a;
                    return status[10];
                }
                if (action == 3 && b > 0) {
                    status[10] = 3;
                    --b;
                    return status[10];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                point[10] = 0;
                if (action == 1) {
                    if (val.contains("A") && a > 1 && b < 2) {
                        a = a - 2;
                        b = b + 3;
                        return status[10];
                    }
                    if (val.contains("C") && c > 1 && b < 2) {
                        c = c - 2;
                        b = b + 3;
                        return status[10];
                    }
                    else {
                        kom = "Niedozwolona akcja";
                    }
                }
                if (action == 2 && a > 0 && b > 0) {
                    status[10] = 4;
                    --a;
                    --b;
                    return status[10];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                point[10] = 0;
                if (action == 1) {
                    if (val.contains("B") && b > 1 && a < 2) {
                        b = b - 2;
                        a = a + 3;
                        return status[10];
                    }
                    if (val.contains("C") && c > 1 && a < 2){
                        c = c - 2;
                        a = a + 3;
                        return status[10];
                    }
                    else {
                        kom = "Niedozwolona akcja";
                    }
                }
                if (action == 2 && a > 0 && b > 0) {
                    status[10] = 4;
                    --a;
                    --b;
                    return status[10];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[10] = 0;
                if (action == 1) {
                    if (val.contains("A") && a > 1 && c < 2){
                        a = a - 2;
                        c = c + 3;
                        return status[10];
                    }
                    if (val.contains("B") && b > 1 && c < 2){
                        b = b - 2;
                        c = c + 3;
                        return status[10];
                    }
                    else {
                        kom = "Niedozwolona akcja";
                    }
                }
                if (action == 2 && c > 0) {
                    status[10] = 2;
                    --c;
                    return status[10];
                }
                if (action == 3 && c > 0) {
                    status[10] = 3;
                    --c;
                    return status[10];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 10;
        }
        if (card.equals("Twelve")) {
            if (stat == 0) {
                point[11] = 0;
                if (action == 1 && a > 0 && b > 0) {
                    status[11] = 2;
                    --a;
                    --b;
                    return status[11];
                }
                if (action == 2 && a > 0 && b > 0 && c > 1) {
                    status[11] = 4;
                    --a;
                    --b;
                    c = c - 2;
                    return status[11];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                point[11] = 0;
                if (action == 1 && a < 4 && b < 4) {
                    ++a;
                    ++b;
                    return status[11];
                }
                if (action == 2 && a > 0 && b > 0 && c > 0) {
                    status[11] = 3;
                    --a;
                    --b;
                    --c;
                    return status[11];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                if (action == 1 && a < 4 && b < 4 && c < 4) {
                    ++a;
                    ++b;
                    ++c;
                    return status[11];
                }
                if (action == 2 && a > 1 && b > 1 && c > 1) {
                    status[11] = 4;
                    point[11] = 4;
                    a = a - 2;
                    b = b - 2;
                    c = c - 2;
                    return status[11];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[11] = 4;
                if (action == 1 || action == 2 || action == 3) {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 11;
        }
        if (card.equals("Thirteen")) {
            if (stat == 0) {
                if (action == 1 && a > 0 && b > 0) {
                    status[12] = 2;
                    point[12] = 1;
                    --a;
                    --b;
                    return status[12];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                if (action == 1 && a > 0 && b > 0 && c > 0) {
                    status[12] = 3;
                    point[12] = 3;
                    --a;
                    --b;
                    --c;
                    return status[12];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                if (action == 1 && a > 1 && b > 1 && c > 1) {
                    status[12] = 4;
                    point[12] = 6;
                    a = a - 2;
                    b = b - 2;
                    c = c - 2;
                    return status[12];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[12] = 6;
                if (action == 1 || action == 2 || action == 3) {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 12;
        }
        if (card.equals("Fourteen")) {
            if (stat == 0) {
                if (action == 1 && a > 0 && b > 0) {
                    status[13] = 2;
                    point[13] = 1;
                    --a;
                    --b;
                    return status[13];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                if (action == 1 && a > 0 && b > 0 && c > 0) {
                    status[13] = 3;
                    point[13] = 3;
                    --a;
                    --b;
                    --c;
                    return status[13];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                if (action == 1 && a > 1 && b > 1 && c > 1) {
                    status[13] = 4;
                    point[13] = 6;
                    a = a - 2;
                    b = b - 2;
                    c = c - 2;
                    return status[13];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[13] = 6;
                if (action == 1 || action == 2 || action == 3) {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 13;
        }
        if (card.equals("Fifteen")) {
            if (stat == 0) {
                if (action == 1 && a > 0 && b > 0 && c > 1) {
                    status[14] = 2;
                    point[14] = 3;
                    --a;
                    --b;
                    c = c - 2;
                    return status[14];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                if (action == 1 && a > 1 && b > 1 && c > 2) {
                    status[14] = 3;
                    point[14] = 6;
                    a = a - 2;
                    b = b - 2;
                    c = c - 3;
                    return status[14];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                if (action == 1 && a > 2 && b > 2 && c > 3) {
                    status[14] = 4;
                    point[14] = 10;
                    a = a - 3;
                    b = b - 3;
                    c = c - 4;
                    return status[14];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[14] = 10;
                if (action == 1 || action == 2 || action == 3) {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 14;
        }
        if (card.equals("Sixteen")) {
            if (stat == 0) {
                if (action == 1 && a > 0 && b > 0 && c > 1) {
                    status[15] = 2;
                    point[15] = 3;
                    --a;
                    --b;
                    c = c - 2;
                    return status[15];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 2) {
                if (action == 1 && a > 1 && b > 1 && c > 2) {
                    status[15] = 3;
                    point[15] = 6;
                    a = a - 2;
                    b = b - 2;
                    c = c - 3;
                    return status[15];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 3) {
                if (action == 1 && a > 2 && b > 2 && c > 3) {
                    status[15] = 4;
                    point[15] = 10;
                    a = a - 3;
                    b = b - 3;
                    c = c - 4;
                    return status[15];
                }
                else {
                    kom = "Niedozwolona akcja";
                }
            }
            if (stat == 4) {
                point[15] = 10;
                if (action == 1 || action == 2 || action == 3) {
                    kom = "Niedozwolona akcja";
                }
            }
            statusNumber = 15;
        }
        return status[statusNumber];
    }
}
