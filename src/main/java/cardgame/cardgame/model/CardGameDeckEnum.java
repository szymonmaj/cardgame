package cardgame.cardgame.model;

import java.util.Arrays;
import java.util.List;

public class CardGameDeckEnum {

//    public static String desc;
//    public static String name;
//    public static int pageNumber;
//    public static int pointDeck;
//    public static int level;
    public static int status;
    public static String[] description = new String[6];



    public enum Deck{
        One {
            public String[] show(int stat) {
                description[0] = "karta = 1";
                description[1] = "Chata rybaka";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba lub OPCJA 2: Awansuj na poziom 2, by zyskać 2 Ryba kosztem 1 Ryba" +
                                " lub OPCJA 3: Awansuj na poziom 2, by zyskać 1 Ryba i 1 Drewno kosztem 1 Ryba";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 2 Ryba lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno" +
                                " kosztem 1 Ryba i 1 Drewno";
                        break;
                    case 3:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno" +
                                " kosztem 1 Ryba i 1 Drewno";
                        break;
                    case 4:
                        description[3] = "level = 3";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 2 Ryba i 1 Drewno";
                        break;
                }
                return description;
            }
        },
        Two {
            public String[] show(int stat) {
                description[0] = "karta = 2";
                description[1] = "Chata rybaka";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba lub OPCJA 2: Awansuj na poziom 2, by zyskać 2 Ryba kosztem 1 Ryba" +
                                " lub OPCJA 3: Awansuj na poziom 2, by zyskać 1 Ryba i 1 Drewno kosztem 1 Ryba";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 2 Ryba lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno" +
                                " kosztem 1 Ryba i 1 Drewno";
                        break;
                    case 3:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno" +
                                " kosztem 1 Ryba i 1 Drewno";
                        break;
                    case 4:
                        description[3] = "level = 3";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 2 Ryba i 1 Drewno";
                        break;
                }
                return description;
            }
        },
        Three {
            public String[] show(int stat) {
                description[0] = "karta = 3";
                description[1] = "Chata rybaka";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba lub OPCJA 2: Awansuj na poziom 2, by zyskać 2 Ryba kosztem 1 Ryba" +
                                " lub OPCJA 3: Awansuj na poziom 2, by zyskać 1 Ryba i 1 Drewno kosztem 1 Ryba";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 2 Ryba lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno" +
                                " kosztem 1 Ryba i 1 Drewno";
                        break;
                    case 3:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno" +
                                " kosztem 1 Ryba i 1 Drewno";
                        break;
                    case 4:
                        description[3] = "level = 3";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 2 Ryba i 1 Drewno";
                        break;
                }
                return description;
            }
        };
//        Four {
//
//        };
        public abstract String[] show(int stat);
    }
}
