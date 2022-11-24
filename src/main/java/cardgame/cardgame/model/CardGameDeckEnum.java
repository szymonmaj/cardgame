package cardgame.cardgame.model;

import java.util.Arrays;
import java.util.List;

public class CardGameDeckEnum {
    public static String[] description = new String[9];

    public enum Deck{
        One {
            public String[] show(int stat) {
                description[0] = "  1";
                description[1] = "Chata rybaka";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba lub OPCJA 2: Awansuj na poziom 2, by zyskać 2 Ryba kosztem 1 Ryba" +
                                " lub OPCJA 3: Awansuj na poziom 2, by zyskać 1 Ryba i 1 Drewno kosztem 1 Ryba";
                        description[6] = "Zdobądź 1 Ryba";
                        description[7] = "Awansuj na poziom 2, by zyskać 2 Ryba kosztem 1 Ryba";
                        description[8] = "Awansuj na poziom 2, by zyskać 1 Ryba i 1 Drewno kosztem 1 Ryba";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 2 Ryba lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno" +
                                " kosztem 1 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 2 Ryba";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno" +
                                " kosztem 1 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 1 Ryba i 1 Drewno";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  3";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 2 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 2 Ryba i 1 Drewno";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Two {
            public String[] show(int stat) {
                description[0] = "  2";
                description[1] = "Chata rybaka";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba lub OPCJA 2: Awansuj na poziom 2, by zyskać 2 Ryba kosztem 1 Ryba" +
                                " lub OPCJA 3: Awansuj na poziom 2, by zyskać 1 Ryba i 1 Drewno kosztem 1 Ryba";
                        description[6] = "Zdobądź 1 Ryba";
                        description[7] = "Awansuj na poziom 2, by zyskać 2 Ryba kosztem 1 Ryba";
                        description[8] = "Awansuj na poziom 2, by zyskać 1 Ryba i 1 Drewno kosztem 1 Ryba";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 2 Ryba lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno" +
                                " kosztem 1 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 2 Ryba";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno" +
                                " kosztem 1 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 1 Ryba i 1 Drewno";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  3";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 2 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 2 Ryba i 1 Drewno";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Three {
            public String[] show(int stat) {
                description[0] = "  3";
                description[1] = "Chata rybaka";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba lub OPCJA 2: Awansuj na poziom 2, by zyskać 2 Ryba kosztem 1 Ryba" +
                                " lub OPCJA 3: Awansuj na poziom 2, by zyskać 1 Ryba i 1 Drewno kosztem 1 Ryba";
                        description[6] = "Zdobądź 1 Ryba";
                        description[7] = "Awansuj na poziom 2, by zyskać 2 Ryba kosztem 1 Ryba";
                        description[8] = "Awansuj na poziom 2, by zyskać 1 Ryba i 1 Drewno kosztem 1 Ryba";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 2 Ryba lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno" +
                                " kosztem 1 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 2 Ryba";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno" +
                                " kosztem 1 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 1 Ryba i 1 Drewno";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Ryba i 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  3";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 2 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 2 Ryba i 1 Drewno";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Four {
            public String[] show(int stat) {
                description[0] = "  4";
                description[1] = "Chata drwala";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 1 Drewno";
                        description[7] = "Awansuj na poziom 2, by zyskać 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  1";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Drewno" +
                                " kosztem 1 Drewno i 1 Ruda";
                        description[6] = "Zdobądź 1 Drewno";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Drewno kosztem 1 Drewno i 1 Ruda";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  3";
                        description[4] = "  2";
                        description[5] = "OPCJA 1: Zdobądź 2 Drewno lub OPCJA 2: Awansuj na poziom 4" +
                                " kosztem 2 Drewno i 2 Ruda";
                        description[6] = "Zdobądź 2 Drewno";
                        description[7] = "Awansuj na poziom 4 kosztem 2 Drewno i 2 Ruda";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  4";
                        description[4] = "  5";
                        description[5] = "BRAK OPCJI";
                        description[6] = "BRAK OPCJI";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Five {
            public String[] show(int stat) {
                description[0] = "  5";
                description[1] = "Chata drwala";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 1 Drewno";
                        description[7] = "Awansuj na poziom 2, by zyskać 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  1";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Drewno" +
                                " kosztem 1 Drewno i 1 Ruda";
                        description[6] = "Zdobądź 1 Drewno";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Drewno kosztem 1 Drewno i 1 Ruda";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  3";
                        description[4] = "  2";
                        description[5] = "OPCJA 1: Zdobądź 2 Drewno lub OPCJA 2: Awansuj na poziom 4" +
                                " kosztem 2 Drewno i 2 Ruda";
                        description[6] = "Zdobądź 2 Drewno";
                        description[7] = "Awansuj na poziom 4 kosztem 2 Drewno i 2 Ruda";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  4";
                        description[4] = "  5";
                        description[5] = "BRAK OPCJI";
                        description[6] = "BRAK OPCJI";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Six {
            public String[] show(int stat) {
                description[0] = "  6";
                description[1] = "Chata drwala";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 1 Drewno";
                        description[7] = "Awansuj na poziom 2, by zyskać 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  1";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Drewno" +
                                " kosztem 1 Drewno i 1 Ruda";
                        description[6] = "Zdobądź 1 Drewno";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Drewno kosztem 1 Drewno i 1 Ruda";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  3";
                        description[4] = "  2";
                        description[5] = "OPCJA 1: Zdobądź 2 Drewno lub OPCJA 2: Awansuj na poziom 4" +
                                " kosztem 2 Drewno i 2 Ruda";
                        description[6] = "Zdobądź 2 Drewno";
                        description[7] = "Awansuj na poziom 4 kosztem 2 Drewno i 2 Ruda";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  4";
                        description[4] = "  5";
                        description[5] = "BRAK OPCJI";
                        description[6] = "BRAK OPCJI";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Seven {
            public String[] show(int stat) {
                description[0] = "  7";
                description[1] = "Kamieniołom";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Ryba";
                        description[6] = "Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Drewno";
                        description[7] = "Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Ryba";
                        description[8] = " ";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ruda" +
                                " kosztem 1 Ryba i 2 Drewno";
                        description[6] = "Zdobądź 1 Ruda";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Ruda kosztem 1 Ryba i 2 Drewno";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ruda" +
                                " kosztem 2 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 1 Ruda";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Ruda kosztem 2 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  3";
                        description[4] = "  2";
                        description[5] = "OPCJA 1: Zdobądź 2 Ruda";
                        description[6] = "Zdobądź 2 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Eight {
            public String[] show(int stat) {
                description[0] = "  8";
                description[1] = "Kamieniołom";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Ryba";
                        description[6] = "Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Drewno";
                        description[7] = "Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Ryba";
                        description[8] = " ";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ruda" +
                                " kosztem 1 Ryba i 2 Drewno";
                        description[6] = "Zdobądź 1 Ruda";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Ruda kosztem 1 Ryba i 2 Drewno";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ruda" +
                                " kosztem 2 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 1 Ruda";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Ruda kosztem 2 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  3";
                        description[4] = "  2";
                        description[5] = "OPCJA 1: Zdobądź 2 Ruda";
                        description[6] = "Zdobądź 2 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Nine {
            public String[] show(int stat) {
                description[0] = "  9";
                description[1] = "Kamieniołom";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Ryba";
                        description[6] = "Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Drewno";
                        description[7] = "Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Ryba";
                        description[8] = " ";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ruda" +
                                " kosztem 1 Ryba i 2 Drewno";
                        description[6] = "Zdobądź 1 Ruda";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Ruda kosztem 1 Ryba i 2 Drewno";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ruda" +
                                " kosztem 2 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 1 Ruda";
                        description[7] = "Awansuj na poziom 3, by zyskać 2 Ruda kosztem 2 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  3";
                        description[4] = "  2";
                        description[5] = "OPCJA 1: Zdobądź 2 Ruda";
                        description[6] = "Zdobądź 2 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Ten {
            public String[] show(int stat) {
                description[0] = "  10";
                description[1] = "Targ";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda kosztem 1 Ryba/1 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Ryba i 1 Ruda kosztem 2 Drewno lub OPCJA 3: Awansuj na poziom 2, by zyskać 1 Drewno i 1 Ruda kosztem 2 Ryba";
                        description[6] = "Zdobądź 1 Ruda kosztem 1 Ryba/1 Drewno";
                        description[7] = "Awansuj na poziom 2, by zyskać 1 Ryba i 1 Ruda kosztem 2 Drewno";
                        description[8] = "Awansuj na poziom 2, by zyskać 1 Drewno i 1 Ruda kosztem 2 Ryba";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Ruda kosztem 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 1 Ryba i 1 Drewno 1 Ruda" +
                                " kosztem 1 Drewno i 1 Ruda";
                        description[6] = "Zdobądź 1 Ryba i 1 Ruda kosztem 1 Drewno";
                        description[7] = "Awansuj na poziom 3, by zyskać 1 Ryba i 1 Drewno 1 Ruda kosztem 1 Drewno i 1 Ruda";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno i 1 Ruda kosztem 1 Ryba lub OPCJA 2: Awansuj na poziom 3, by zyskać 1 Ryba i 1 Drewno i 1 Ruda kosztem 1 Ryba i 1 Ruda";
                        description[6] = "Zdobądź 1 Drewno i 1 Ruda kosztem 1 Ryba";
                        description[7] = "Awansuj na poziom 3, by zyskać 1 Ryba i 1 Drewno i 1 Ruda kosztem 1 Ryba i 1 Ruda";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  3";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno 1 Ruda kosztem 1 Ryba/1 Drewno/1 Ruda";
                        description[6] = "Zdobądź 1 Ryba i 1 Drewno 1 Ruda kosztem 1 Ryba/1 Drewno/1 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Eleven {
            public String[] show(int stat) {
                description[0] = "  11";
                description[1] = "Chatka kupca";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno kosztem 2 Ryba/2 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 3 Drewno kosztem 1 Ryba lub OPCJA 3: Awansuj na poziom 2, by zyskać 3 Ryba kosztem 1 Drewno";
                        description[6] = "Zdobądź 1 Ryba i 1 Drewno kosztem 2 Ryba/2 Drewno";
                        description[7] = "Awansuj na poziom 2, by zyskać 3 Drewno kosztem 1 Ryba";
                        description[8] = "Awansuj na poziom 2, by zyskać 3 Ryba kosztem 1 Drewno";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 3 Drewno kosztem 2 Ryba/2 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 3 Ruda kosztem 1 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 3 Drewno kosztem 2 Ryba/2 Ruda";
                        description[7] = "Awansuj na poziom 3, by zyskać 3 Ruda kosztem 1 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 3 Ryba kosztem 2 Drewno/2 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 3 Ruda kosztem 1 Ryba i 1 Drewno";
                        description[6] = "Zdobądź 3 Ryba kosztem 2 Drewno/2 Ruda";
                        description[7] = "Awansuj na poziom 3, by zyskać 3 Ruda kosztem 1 Ryba i 1 Drewno";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  3";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 3 Ruda kosztem 2 Ryba/2 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 3 Drewno kosztem 1 Ruda lub Opcja 3: Awansuj na poziom 2, by zyskać 3 Ryba kosztem 1 Ruda";
                        description[6] = "Zdobądź 3 Ruda kosztem 2 Ryba/2 Drewno";
                        description[7] = "Awansuj na poziom 2, by zyskać 3 Drewno kosztem 1 Ruda";
                        description[8] = "Awansuj na poziom 2, by zyskać 3 Ryba kosztem 1 Ruda";
                        break;
                }
                return description;
            }
        },
        Twelve {
            public String[] show(int stat) {
                description[0] = "  12";
                description[1] = "Warsztat";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2, by zyskać 1 Ryba i 1 Drewno kosztem 1 Ryba i 1 Drewno lub OPCJA 2: Awansuj na poziom 4 kosztem 1 Ryba i 1 Drewno i 2 Ruda";
                        description[6] = "Awansuj na poziom 2, by zyskać 1 Ryba i 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        description[7] = "Awansuj na poziom 4 kosztem 1 Ryba i 1 Drewno i 2 Ruda";
                        description[8] = " ";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 1 Ryba i 1 Drewno i 1 Ruda kosztem 1 Ryba i 1 Drewno i 1 Ruda";
                        description[6] = "Zdobądź 1 Ryba i 1 Drewno";
                        description[7] = "Awansuj na poziom 3, by zyskać 1 Ryba i 1 Drewno i 1 Ruda kosztem 1 Ryba i 1 Drewno i 1 Ruda";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  3";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno i 1 Ruda lub OPCJA 2: Awansuj na poziom 4 kosztem 2 Ryba i 2 Drewno i 2 Ruda";
                        description[6] = "Zdobądź 1 Ryba i 1 Drewno i 1 Ruda";
                        description[7] = "Awansuj na poziom 4 kosztem 2 Ryba i 2 Drewno i 2 Ruda";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  4";
                        description[4] = "  4";
                        description[5] = "BRAK OPCJI";
                        description[6] = "BRAK OPCJI";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Thirteen {
            public String[] show(int stat) {
                description[0] = "  13";
                description[1] = "Chatka mieszkalna";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2 kosztem 1 Ryba i 1 Drewno";
                        description[6] = "Awansuj na poziom 2 kosztem 1 Ryba i 1 Drewno";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  1";
                        description[5] = "OPCJA 1: Awansuj na poziom 3 kosztem 1 Ryba i 1 Drewno i 1 Ruda";
                        description[6] = "Awansuj na poziom 3 kosztem 1 Ryba i 1 Drewno i 1 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  3";
                        description[4] = "  3";
                        description[5] = "OPCJA 1: Awansuj na poziom 4 kosztem 2 Ryba i 2 Drewno i 2 Ruda";
                        description[6] = "Awansuj na poziom 4 kosztem 2 Ryba i 2 Drewno i 2 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  4";
                        description[4] = "  6";
                        description[5] = "BRAK OPCJI";
                        description[6] = "BRAK OPCJI";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Fourteen {
            public String[] show(int stat) {
                description[0] = "  14";
                description[1] = "Chatka mieszkalna";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2 kosztem 1 Ryba i 1 Drewno";
                        description[6] = "Awansuj na poziom 2 kosztem 1 Ryba i 1 Drewno";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  1";
                        description[5] = "OPCJA 1: Awansuj na poziom 3 kosztem 1 Ryba i 1 Drewno i 1 Ruda";
                        description[6] = "Awansuj na poziom 3 kosztem 1 Ryba i 1 Drewno i 1 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  3";
                        description[4] = "  3";
                        description[5] = "OPCJA 1: Awansuj na poziom 4 kosztem 2 Ryba i 2 Drewno i 2 Ruda";
                        description[6] = "Awansuj na poziom 4 kosztem 2 Ryba i 2 Drewno i 2 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  4";
                        description[4] = "  6";
                        description[5] = "BRAK OPCJI";
                        description[6] = "BRAK OPCJI";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Fifteen {
            public String[] show(int stat) {
                description[0] = "  15";
                description[1] = "Świątynia";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2 kosztem 1 Ryba i 1 Drewno i 2 Ruda";
                        description[6] = "Awansuj na poziom 2 kosztem 1 Ryba i 1 Drewno i 2 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  3";
                        description[5] = "OPCJA 1: Awansuj na poziom 3 kosztem 2 Ryba i 2 Drewno i 3 Ruda";
                        description[6] = "Awansuj na poziom 3 kosztem 2 Ryba i 2 Drewno i 3 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  3";
                        description[4] = "  6";
                        description[5] = "OPCJA 1: Awansuj na poziom 4 kosztem 3 Ryba i 3 Drewno i 4 Ruda";
                        description[6] = "Awansuj na poziom 4 kosztem 3 Ryba i 3 Drewno i 4 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  4";
                        description[4] = "  10";
                        description[5] = "BRAK OPCJI";
                        description[6] = "BRAK OPCJI";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Sixteen {
            public String[] show(int stat) {
                description[0] = "  16";
                description[1] = "Świątynia";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "  1";
                        description[4] = "  0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2 kosztem 1 Ryba i 1 Drewno i 2 Ruda";
                        description[6] = "Awansuj na poziom 2 kosztem 1 Ryba i 1 Drewno i 2 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                    case 2:
                        description[3] = "  2";
                        description[4] = "  3";
                        description[5] = "OPCJA 1: Awansuj na poziom 3 kosztem 2 Ryba i 2 Drewno i 3 Ruda";
                        description[6] = "Awansuj na poziom 3 kosztem 2 Ryba i 2 Drewno i 3 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                    case 3:
                        description[3] = "  3";
                        description[4] = "  6";
                        description[5] = "OPCJA 1: Awansuj na poziom 4 kosztem 3 Ryba i 3 Drewno i 4 Ruda";
                        description[6] = "Awansuj na poziom 4 kosztem 3 Ryba i 3 Drewno i 4 Ruda";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                    case 4:
                        description[3] = "  4";
                        description[4] = "  10";
                        description[5] = "BRAK OPCJI";
                        description[6] = "BRAK OPCJI";
                        description[7] = " ";
                        description[8] = " ";
                        break;
                }
                return description;
            }
        },
        Seventeen {
            public String[] show(int stat) {
                    description[0] = "";
                    description[1] = "";
                    description[2] = "";
                    description[3] = "";
                    description[4] = "";
                    description[5] = "Nowa Runda";
                    description[6] = "";
                    description[7] = "";
                    description[8] = "";
                    return description;
            }
        };
        public abstract String[] show(int stat);
    }
}
