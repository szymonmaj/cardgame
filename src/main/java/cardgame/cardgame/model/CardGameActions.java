package cardgame.cardgame.model;

import org.springframework.lang.NonNull;
import java.util.*;

public class CardGameActions {
    private static List<String> baseList = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen");
    private static List<String> auxList = new ArrayList<>();
    private static int n = 0;
    private static int r = 1;
    private static String valueEnum = "One";
    private static String valueEnumNext = "One";
    private static Boolean disabled = false;
    private static Boolean revDisabled = true;
    private static Boolean disabledOption = false;
    private static Boolean finalDisabled = false;
    private static int countEnum = 0;
    private static int countNextEnum = 0;
    private int sumpoint = 0;

    @NonNull
    public void result1(String val){
        int resultEnum = CardGameEnum.Cards.valueOf(valueEnum).perform(CardGameEnum.status[countEnum], 1, val);
    }
    public void result2() {
        int resultEnum = CardGameEnum.Cards.valueOf(valueEnum).perform(CardGameEnum.status[countEnum], 2, "Z");
    }
    public void result3() {
        int resultEnum = CardGameEnum.Cards.valueOf(valueEnum).perform(CardGameEnum.status[countEnum], 3, "Z");
    }
    public String display(String val) {
        System.out.println(n);
        String[] resultEnum2 = CardGameDeckEnum.Deck.valueOf(valueEnum).show(CardGameEnum.status[countEnum]);
        String resultEnum3 = null;
        if (val.equals("nazwa")) {
            resultEnum3 = resultEnum2[1];
        }
        if (val.equals("numer")) {
            resultEnum3 = resultEnum2[0];
        }
        if (val.equals("poziom")) {
            resultEnum3 = resultEnum2[3];
        }
        if (val.equals("punkty")) {
            resultEnum3 = resultEnum2[4];
        }
        if (val.equals("opis")) {
            resultEnum3 = resultEnum2[5];
        }
        return resultEnum3;
    }

    public String displayNext(String val) {
        String[] resultEnum2 = CardGameDeckEnum.Deck.valueOf(valueEnumNext).show(CardGameEnum.status[countNextEnum]);
        String resultEnum3 = null;
        if (val.equals("nazwa")) {
            resultEnum3 = resultEnum2[1];
        }
        if (val.equals("numer")) {
            resultEnum3 = resultEnum2[0];
        }
        if (val.equals("poziom")) {
            resultEnum3 = resultEnum2[3];
        }
        if (val.equals("punkty")) {
            resultEnum3 = resultEnum2[4];
        }
        if (val.equals("opis")) {
            resultEnum3 = resultEnum2[5];
        }
        return resultEnum3;
    }

    public void mill(){
        takeList();
    }

    public static List<String> shuffleList(){
        Collections.shuffle(baseList);
        System.out.println(baseList);
        System.out.println(n);
        System.out.println(valueEnum);
        System.out.println(countEnum);
        auxList = new ArrayList<>(baseList);
        auxList.add("Seventeen");
        baseList = auxList;
        return baseList;
        }

    public int counter(){
        n++;
        if (n == 16) {
            n = 0;
            r++;
            CardGameEnum cardGameEnum = new CardGameEnum();
            cardGameEnum.setKom("Runda: " + r);
        }
        if (r == 9) {
            CardGameEnum cardGameEnum = new CardGameEnum();
            setRevDisabled(true);
            setFinalDisabled(true);
            cardGameEnum.setKom("Koniec gry, Twoje punkty: " + sumPoints());
        }
        return n;
    }

    public void takeList(){
        System.out.println("takie likst" + this);
        valueEnum = baseList.get(n);
        valueEnumNext = baseList.get(n + 1);
        counter();
        System.out.println(valueEnum);
        System.out.println(valueEnumNext);
        if (valueEnum.equals("One")){
            countEnum = 0;
            countNextEnum = 0;
        }
        if (valueEnum.equals("Two")){
            countEnum = 1;
            countNextEnum = 1;
        }
        if (valueEnum.equals("Three")){
            countEnum = 2;
            countNextEnum = 2;
        }
        if (valueEnum.equals("Four")){
            countEnum = 3;
            countNextEnum = 3;
        }
        if (valueEnum.equals("Five")){
            countEnum = 4;
            countNextEnum = 4;
        }
        if (valueEnum.equals("Six")){
            countEnum = 5;
            countNextEnum = 5;
        }
        if (valueEnum.equals("Seven")){
            countEnum = 6;
            countNextEnum = 6;
        }
        if (valueEnum.equals("Eight")){
            countEnum = 7;
            countNextEnum = 7;
        }
        if (valueEnum.equals("Nine")){
            countEnum = 8;
            countNextEnum = 8;
        }
        if (valueEnum.equals("Ten")){
            countEnum = 9;
            countNextEnum = 9;
        }
        if (valueEnum.equals("Eleven")){
            countEnum = 10;
            countNextEnum = 10;
        }
        if (valueEnum.equals("Twelve")){
            countEnum = 11;
            countNextEnum = 11;
        }
        if (valueEnum.equals("Thirteen")){
            countEnum = 12;
            countNextEnum = 12;
        }
        if (valueEnum.equals("Fourteen")){
            countEnum = 13;
            countNextEnum = 13;
        }
        if (valueEnum.equals("Fifteen")){
            countEnum = 14;
            countNextEnum = 14;
        }
        if (valueEnum.equals("Sixteen")){
            countEnum = 15;
            countNextEnum = 15;
        }
//        Map<Integer, String> mapOfEnum = new HashMap<Integer, String>();
//        Set<Map.Entry<Integer, String>> entries = mapOfEnum.entrySet();
//        Iterator<Map.Entry<Integer, String>> moviesIterator = entries.iterator();
//        Map.Entry<Integer, String> entry = moviesIterator.next();
//        entry.getKey();
//        mapOfEnum.put(countEnum, valueEnum);
    }

    public int sumPoints() {
        sumpoint = Arrays.stream(CardGameEnum.point).sum();
        return sumpoint;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public static void setDisabled(Boolean disabled) {
        CardGameActions.disabled = disabled;
    }

    public Boolean getRevDisabled() {
        return revDisabled;
    }

    public static void setRevDisabled(Boolean revDisabled) {
        CardGameActions.revDisabled = revDisabled;
    }

    public Boolean getDisabledOption() {
        return disabledOption;
    }

    public static void setDisabledOption(Boolean disabledOption) {
        CardGameActions.disabledOption = disabledOption;
    }

    public static Boolean getFinalDisabled() {
        return finalDisabled;
    }

    public static void setFinalDisabled(Boolean finalDisabled) {
        CardGameActions.finalDisabled = finalDisabled;
    }

    public static List<String> getBaseList() {
        return baseList;
    }

    public static void setBaseList(List<String> baseList) {
        CardGameActions.baseList = baseList;
    }

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        CardGameActions.n = n;
    }

    public static int getR() {
        return r;
    }

    public static void setR(int r) {
        CardGameActions.r = r;
    }

    public CardGameActions() {
        System.out.println("dupa");
        System.out.println(this);
    }
}


