package cardgame.cardgame.model;

import org.springframework.lang.NonNull;

import java.util.*;

//import static cardgame.cardgame.model.CardGameEnum.a;

public class CardGameActions {
    private static List<String> list2 = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen");
    private static List<String> list3 = new ArrayList<>();
    private static int n = 0;
//    public static int nn = 0;
//    public static int an = 0;
//    public static String vn = "Z";
    private static String valueEnum = "One";
    private static String valueEnumNext = "One";
    private static Boolean disabled = false;
    private static Boolean revDisabled = true;
    private static Boolean disabledOption = false;
    private static int countEnum = 1;
    private static int countNextEnum = 1;
//    public static Map mapOfEnum;
//    public static Set entries;
//    public static Iterator moviesIterator;

    @NonNull
    public static List<String> randomList(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        List<String> list1 = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen");
        Collections.shuffle(list1);
        Collections.shuffle(list);
        System.out.println(list1);
        System.out.println("Wynik:" + CardGameEnum.Cards.Four.perform(3, 2, "B"));
        System.out.println(CardGameEnum.point[3]);
        return list1;
    }
    public void result1(){
//        nn = CardGameEnum.status[countEnum];
//        an = 1;
        int resultEnum = CardGameEnum.Cards.valueOf(valueEnum).perform(CardGameEnum.status[countEnum], 1, "Z");
        System.out.println(resultEnum);
        System.out.println(CardGameEnum.getA());
//        takeList();
//        int resultEnum = CardGameEnum.Cards.valueOf(valueEnum).perform(3, 2, "B");
//        return resultEnum;
    }
    public void result2() {
//        nn = CardGameEnum.status[countEnum];
//        an = 2;
        int resultEnum = CardGameEnum.Cards.valueOf(valueEnum).perform(CardGameEnum.status[countEnum], 2, "Z");
        System.out.println(resultEnum);
        System.out.println(CardGameEnum.getA());
    }
    public void result3() {
//        nn = CardGameEnum.status[countEnum];
//        an = 3;
        int resultEnum = CardGameEnum.Cards.valueOf(valueEnum).perform(CardGameEnum.status[countEnum], 3, "Z");
        System.out.println(resultEnum);
        System.out.println(CardGameEnum.getA());
    }
    public String display(String val) {
//        nn = CardGameEnum.status[countEnum];
        System.out.println(n);
        System.out.println(valueEnum);
        System.out.println(countEnum);
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
        List<String> list2 = Arrays.asList("One", "Two", "Three");
        Collections.shuffle(list2);
        System.out.println(list2);
//        System.out.println(n);
        System.out.println(valueEnum);
        System.out.println(countEnum);
        list3 = list2;
        return list2;
        }

    public int counter(){
        n++;
        return n;
    }

    public void takeList(){
        valueEnum = list3.get(n);
        valueEnumNext = list3.get(n + 1);
        counter();
        System.out.println(valueEnum);
        if (valueEnum.equals("One")){
            countEnum = 1;
            countNextEnum = 1;
        }
        if (valueEnum.equals("Two")){
            countEnum = 2;
            countNextEnum = 2;
        }
        if (valueEnum.equals("Three")){
            countEnum = 3;
            countNextEnum = 3;
        }
        if (valueEnum.equals("Four")){
            countEnum = 4;
            countNextEnum = 4;
        }
        if (valueEnum.equals("Five")){
            countEnum = 5;
            countNextEnum = 5;
        }
        if (valueEnum.equals("Six")){
            countEnum = 6;
            countNextEnum = 6;
        }
        if (valueEnum.equals("Seven")){
            countEnum = 7;
            countNextEnum = 7;
        }
        if (valueEnum.equals("Eight")){
            countEnum = 8;
            countNextEnum = 8;
        }
        if (valueEnum.equals("Nine")){
            countEnum = 9;
            countNextEnum = 9;
        }
        if (valueEnum.equals("Ten")){
            countEnum = 10;
            countNextEnum = 10;
        }
        if (valueEnum.equals("Eleven")){
            countEnum = 11;
            countNextEnum = 11;
        }
        if (valueEnum.equals("Twelve")){
            countEnum = 12;
            countNextEnum = 12;
        }
        if (valueEnum.equals("Thirteen")){
            countEnum = 13;
            countNextEnum = 13;
        }
        if (valueEnum.equals("Fourteen")){
            countEnum = 14;
            countNextEnum = 14;
        }
        if (valueEnum.equals("Fifteen")){
            countEnum = 15;
            countNextEnum = 15;
        }
        if (valueEnum.equals("Sixteen")){
            countEnum = 16;
            countNextEnum = 16;
        }
//        Map<Integer, String> mapOfEnum = new HashMap<Integer, String>();
//        Set<Map.Entry<Integer, String>> entries = mapOfEnum.entrySet();
//        Iterator<Map.Entry<Integer, String>> moviesIterator = entries.iterator();
//        Map.Entry<Integer, String> entry = moviesIterator.next();
//        entry.getKey();
//        mapOfEnum.put(countEnum, valueEnum);
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

    public static List<String> getList3() {
        return list3;
    }

    public static void setList3(List<String> list3) {
        CardGameActions.list3 = list3;
    }

    //    public void clearKom() {
//        CardGameEnum.kom = " ";
//    }

    }


