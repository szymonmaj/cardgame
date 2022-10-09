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
        },
        Four {
            public String[] show(int stat) {
                description[0] = "karta = 4";
                description[1] = "Chata drwala";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 1";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Drewno" +
                                " kosztem 1 Drewno i 1 Ruda";
                        break;
                    case 3:
                        description[3] = "level = 3";
                        description[4] = "punkty = 2";
                        description[5] = "OPCJA 1: Zdobądź 2 Drewno lub OPCJA 2: Awansuj na poziom 4" +
                                " kosztem 2 Drewno i 2 Ruda";
                        break;
                    case 4:
                        description[3] = "level = 4";
                        description[4] = "punkty = 5";
                        description[5] = "BRAK OPCJI";
                        break;
                }
                return description;
            }
        },
        Five {
            public String[] show(int stat) {
                description[0] = "karta = 5";
                description[1] = "Chata drwala";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 1";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Drewno" +
                                " kosztem 1 Drewno i 1 Ruda";
                        break;
                    case 3:
                        description[3] = "level = 3";
                        description[4] = "punkty = 2";
                        description[5] = "OPCJA 1: Zdobądź 2 Drewno lub OPCJA 2: Awansuj na poziom 4" +
                                " kosztem 2 Drewno i 2 Ruda";
                        break;
                    case 4:
                        description[3] = "level = 4";
                        description[4] = "punkty = 5";
                        description[5] = "BRAK OPCJI";
                        break;
                }
                return description;
            }
        },
        Six {
            public String[] show(int stat) {
                description[0] = "karta = 6";
                description[1] = "Chata drwala";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Drewno kosztem 1 Ryba i 1 Drewno";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 1";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Drewno" +
                                " kosztem 1 Drewno i 1 Ruda";
                        break;
                    case 3:
                        description[3] = "level = 3";
                        description[4] = "punkty = 2";
                        description[5] = "OPCJA 1: Zdobądź 2 Drewno lub OPCJA 2: Awansuj na poziom 4" +
                                " kosztem 2 Drewno i 2 Ruda";
                        break;
                    case 4:
                        description[3] = "level = 4";
                        description[4] = "punkty = 5";
                        description[5] = "BRAK OPCJI";
                        break;
                }
                return description;
            }
        },
        Seven {
            public String[] show(int stat) {
                description[0] = "karta = 7";
                description[1] = "Kamieniołom";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Ryba";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ruda" +
                                " kosztem 1 Ryba i 2 Drewno";
                        break;
                    case 3:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ruda" +
                                " kosztem 2 Ryba i 1 Drewno";
                        break;
                    case 4:
                        description[3] = "level = 3";
                        description[4] = "punkty = 2";
                        description[5] = "OPCJA 1: Zdobądź 2 Ruda";
                        break;
                }
                return description;
            }
        },
        Eight {
            public String[] show(int stat) {
                description[0] = "karta = 8";
                description[1] = "Kamieniołom";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Ryba";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ruda" +
                                " kosztem 1 Ryba i 2 Drewno";
                        break;
                    case 3:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ruda" +
                                " kosztem 2 Ryba i 1 Drewno";
                        break;
                    case 4:
                        description[3] = "level = 3";
                        description[4] = "punkty = 2";
                        description[5] = "OPCJA 1: Zdobądź 2 Ruda";
                        break;
                }
                return description;
            }
        },
        Nine {
            public String[] show(int stat) {
                description[0] = "karta = 9";
                description[1] = "Kamieniołom";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Ruda kosztem 2 Ryba";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ruda" +
                                " kosztem 1 Ryba i 2 Drewno";
                        break;
                    case 3:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Ruda" +
                                " kosztem 2 Ryba i 1 Drewno";
                        break;
                    case 4:
                        description[3] = "level = 3";
                        description[4] = "punkty = 2";
                        description[5] = "OPCJA 1: Zdobądź 2 Ruda";
                        break;
                }
                return description;
            }
        },
        Ten {
            public String[] show(int stat) {
                description[0] = "karta = 10";
                description[1] = "Targ";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ruda kosztem 1 Ryba/1 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Ryba i 1 Ruda kosztem 2 Drewno lub OPCJA 3: Awansuj na poziom 2, by zyskać 1 Drewno i 1 Ruda kosztem 2 Ryba";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Ruda kosztem 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 1 Ryba i 1 Drewno 1 Ruda" +
                                " kosztem 1 Drewno i 1 Ruda";
                        break;
                    case 3:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Drewno i 1 Ruda kosztem 1 Ryba lub OPCJA 2: Awansuj na poziom 3, by zyskać 1 Ryba i 1 Drewno 1 Ruda kosztem 1 Ryba i 1 Ruda";
                        break;
                    case 4:
                        description[3] = "level = 3";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno 1 Ruda kosztem 1 Ryba/1 Drewno/1 Ruda";
                        break;
                }
                return description;
            }
        },
        Eleven {
            public String[] show(int stat) {
                description[0] = "karta = 11";
                description[1] = "Chatka kupca";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno kosztem 2 Ryba/2 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 3 Drewno kosztem 1 Ryba lub OPCJA 3: Awansuj na poziom 2, by zyskać 3 Ryba i 1 Ruda kosztem 1 Drewno";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 3 Drewno kosztem 2 Ryba/2 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 3 Ruda kosztem 1 Ryba i 1 Drewno";
                        break;
                    case 3:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 3 Ryba kosztem 2 Drewno/2 Ruda lub OPCJA 2: Awansuj na poziom 3, by zyskać 3 Ruda kosztem 1 Ryba i 1 Drewno";
                        break;
                    case 4:
                        description[3] = "level = 3";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 3 Ruda kosztem 2 Ryba/2 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 3 Drewno kosztem 1 Ruda lub Opcja 3: Awansuj na poziom 2, by zyskać 3 Ryba kosztem 1 Ruda";
                        break;
                }
                return description;
            }
        },
        Twelve {
            public String[] show(int stat) {
                description[0] = "karta = 12";
                description[1] = "Warsztat";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2, by zyskać 1 Ryba i 1 Drewno kosztem 1 Ryba i 1 Drewno lub OPCJA 2: Awansuj na poziom 4 kosztem 1 Ryba i 1 Drewno i 2 Ruda";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 1 Ryba i 1 Drewno i 1 Ruda kosztem 1 Ryba i 1 Drewno i 1 Ruda";
                        break;
                    case 3:
                        description[3] = "level = 3";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Zdobądź 1 Ryba i 1 Drewno i 1 Ruda lub OPCJA 2: Awansuj na poziom 4 kosztem 2 Ryba i 2 Drewno i 2 Ruda";
                        break;
                    case 4:
                        description[3] = "level = 4";
                        description[4] = "punkty = 4";
                        description[5] = "BRAK OPCJI";
                        break;
                }
                return description;
            }
        },
        Thirteen {
            public String[] show(int stat) {
                description[0] = "karta = 13";
                description[1] = "Chatka mieszkalna";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2 kosztem 1 Ryba i 1 Drewno";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 1";
                        description[5] = "OPCJA 1: Awansuj na poziom 3 kosztem 1 Ryba i 1 Drewno i 1 Ruda";
                        break;
                    case 3:
                        description[3] = "level = 3";
                        description[4] = "punkty = 3";
                        description[5] = "OPCJA 1: Awansuj na poziom 4 kosztem 2 Ryba i 2 Drewno i 2 Ruda";
                        break;
                    case 4:
                        description[3] = "level = 4";
                        description[4] = "punkty = 6";
                        description[5] = "BRAK OPCJI";
                        break;
                }
                return description;
            }
        },
        Fourteen {
            public String[] show(int stat) {
                description[0] = "karta = 14";
                description[1] = "Chatka mieszkalna";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2 kosztem 1 Ryba i 1 Drewno";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 1";
                        description[5] = "OPCJA 1: Awansuj na poziom 3 kosztem 1 Ryba i 1 Drewno i 1 Ruda";
                        break;
                    case 3:
                        description[3] = "level = 3";
                        description[4] = "punkty = 3";
                        description[5] = "OPCJA 1: Awansuj na poziom 4 kosztem 2 Ryba i 2 Drewno i 2 Ruda";
                        break;
                    case 4:
                        description[3] = "level = 4";
                        description[4] = "punkty = 6";
                        description[5] = "BRAK OPCJI";
                        break;
                }
                return description;
            }
        },
        Fifteen {
            public String[] show(int stat) {
                description[0] = "karta = 15";
                description[1] = "Świątynia";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2 kosztem 1 Ryba i 1 Drewno i 2 Ruda";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 3";
                        description[5] = "OPCJA 1: Awansuj na poziom 3 kosztem 2 Ryba i 2 Drewno i 3 Ruda";
                        break;
                    case 3:
                        description[3] = "level = 3";
                        description[4] = "punkty = 6";
                        description[5] = "OPCJA 1: Awansuj na poziom 4 kosztem 3 Ryba i 3 Drewno i 4 Ruda";
                        break;
                    case 4:
                        description[3] = "level = 4";
                        description[4] = "punkty = 10";
                        description[5] = "BRAK OPCJI";
                        break;
                }
                return description;
            }
        },
        Sixteen {
            public String[] show(int stat) {
                description[0] = "karta = 16";
                description[1] = "Świątynia";
                description[2] = String.valueOf(stat);
                switch (stat) {
                    case 0:
                        description[3] = "level = 1";
                        description[4] = "punkty = 0";
                        description[5] = "OPCJA 1: Awansuj na poziom 2 kosztem 1 Ryba i 1 Drewno i 2 Ruda";
                        break;
                    case 2:
                        description[3] = "level = 2";
                        description[4] = "punkty = 3";
                        description[5] = "OPCJA 1: Awansuj na poziom 3 kosztem 2 Ryba i 2 Drewno i 3 Ruda";
                        break;
                    case 3:
                        description[3] = "level = 3";
                        description[4] = "punkty = 6";
                        description[5] = "OPCJA 1: Awansuj na poziom 4 kosztem 3 Ryba i 3 Drewno i 4 Ruda";
                        break;
                    case 4:
                        description[3] = "level = 4";
                        description[4] = "punkty = 10";
                        description[5] = "BRAK OPCJI";
                        break;
                }
                return description;
            }
        },
        Seventeen {
            public String[] show(int stat) {
                    description[0] = "karta = 7";
                    description[1] = "Chata drwala";
                    description[2] = String.valueOf(stat);
                    switch (stat) {
                        case 0:
                            description[3] = "level = 1";
                            description[4] = "punkty = 0";
//                            description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 2, by zyskać 1 Drewno kosztem 1 Ryba i 1 Drewno";
                            description[5] = "Nowa Runda";
                            break;
                        case 2:
                            description[3] = "level = 2";
                            description[4] = "punkty = 1";
                            description[5] = "OPCJA 1: Zdobądź 1 Drewno lub OPCJA 2: Awansuj na poziom 3, by zyskać 2 Drewno" +
                                    " kosztem 1 Drewno i 1 Ruda";
                            break;
                        case 3:
                            description[3] = "level = 3";
                            description[4] = "punkty = 2";
                            description[5] = "OPCJA 1: Zdobądź 2 Drewno lub OPCJA 2: Awansuj na poziom 4" +
                                    " kosztem 2 Drewno i 2 Ruda";
                            break;
                        case 4:
                            description[3] = "level = 4";
                            description[4] = "punkty = 5";
                            description[5] = "BRAK OPCJI";
                            break;
                    }
                    return description;
            }
        };
        public abstract String[] show(int stat);
    }
}
