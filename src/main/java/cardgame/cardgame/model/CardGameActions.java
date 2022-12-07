package cardgame.cardgame.model;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CardGameActions {

    private List<String> baseList = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen");
    private List<String> auxList = new ArrayList<>();
    private int n = 0;
    private int r = 1;
    private String valueEnum = "One";
    private  String valueEnumNext = "One";
    private  Boolean disabled = false;
    private  Boolean revDisabled = true;
    private  Boolean disabledOption = false;
    private  Boolean finalDisabled = true;
    private  Boolean visibleDisabled = false;

    private  int countEnum = 0;
    private  int countNextEnum = 0;
    private int sumpoint = 0;
    private  Map <String, String> pictureHashMap = new HashMap<String, String>();

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
        if (val.equals("opcja1")) {
            resultEnum3 = resultEnum2[6];
        }
        if (val.equals("opcja2")) {
            resultEnum3 = resultEnum2[7];
        }
        if (val.equals("opcja3")) {
            resultEnum3 = resultEnum2[8];
        }
        if (val.equals("obraz")) {
            resultEnum3 = resultEnum2[9];
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
        if (val.equals("obraz")) {
            resultEnum3 = resultEnum2[9];
        }
        return resultEnum3;
    }

    public String sendImage(int val) {
        String tempResult = null;
        if (!pictureHashMap.isEmpty()) {
            if (baseList.get(val) == "One" || baseList.get(val) == "Two" || baseList.get(val) == "Three") {
                tempResult = pictureHashMap.get("One");
            }
            if (baseList.get(val) == "Four" || baseList.get(val) == "Five" || baseList.get(val) == "Six") {
                tempResult = pictureHashMap.get("Two");
            }
            if (baseList.get(val) == "Seven" || baseList.get(val) == "Eight" || baseList.get(val) == "Nine") {
                tempResult = pictureHashMap.get("Three");
            }
            if (baseList.get(val) == "Ten") {
                tempResult = pictureHashMap.get("Four");
            }
            if (baseList.get(val) == "Eleven") {
                tempResult = pictureHashMap.get("Five");
            }
            if (baseList.get(val) == "Twelve") {
                tempResult = pictureHashMap.get("Six");
            }
            if (baseList.get(val) == "Thirteen" || baseList.get(val) == "Fourteen") {
                tempResult = pictureHashMap.get("Seven");
            }
            if (baseList.get(val) == "Fifteen" || baseList.get(val) == "Sixteen") {
                tempResult = pictureHashMap.get("Eight");
            }
        }
        return tempResult;
    }

    public void mill(){
        takeList();
    }

    public  List<String> shuffleList(){
        Collections.shuffle(baseList);
        auxList = new ArrayList<>(baseList);
        auxList.add("Seventeen");
        baseList = auxList;
        pictureHashMap.put("One", "/gfx/fish_house.png");
        pictureHashMap.put("Two", "/gfx/lumber_house.png");
        pictureHashMap.put("Three", "/gfx/mine.png");
        pictureHashMap.put("Four", "/gfx/market.png");
        pictureHashMap.put("Five", "/gfx/merchant.png");
        pictureHashMap.put("Six", "/gfx/workshop.png");
        pictureHashMap.put("Seven", "/gfx/cottage.png");
        pictureHashMap.put("Eight", "/gfx/temple.png");
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
        if (valueEnum.equals("One")){
            countEnum = 0;
        }
        if (valueEnum.equals("Two")){
            countEnum = 1;
        }
        if (valueEnum.equals("Three")){
            countEnum = 2;
        }
        if (valueEnum.equals("Four")){
            countEnum = 3;
        }
        if (valueEnum.equals("Five")){
            countEnum = 4;
        }
        if (valueEnum.equals("Six")){
            countEnum = 5;
        }
        if (valueEnum.equals("Seven")){
            countEnum = 6;
        }
        if (valueEnum.equals("Eight")){
            countEnum = 7;
        }
        if (valueEnum.equals("Nine")){
            countEnum = 8;
        }
        if (valueEnum.equals("Ten")){
            countEnum = 9;
        }
        if (valueEnum.equals("Eleven")){
            countEnum = 10;
        }
        if (valueEnum.equals("Twelve")){
            countEnum = 11;
        }
        if (valueEnum.equals("Thirteen")){
            countEnum = 12;
        }
        if (valueEnum.equals("Fourteen")){
            countEnum = 13;
        }
        if (valueEnum.equals("Fifteen")){
            countEnum = 14;
        }
        if (valueEnum.equals("Sixteen")){
            countEnum = 15;
        }
        if (valueEnumNext.equals("One")){
            countNextEnum = 0;
        }
        if (valueEnumNext.equals("Two")){
            countNextEnum = 1;
        }
        if (valueEnumNext.equals("Three")){
            countNextEnum = 2;
        }
        if (valueEnumNext.equals("Four")){
            countNextEnum = 3;
        }
        if (valueEnumNext.equals("Five")){
            countNextEnum = 4;
        }
        if (valueEnumNext.equals("Six")){
            countNextEnum = 5;
        }
        if (valueEnumNext.equals("Seven")){
            countNextEnum = 6;
        }
        if (valueEnumNext.equals("Eight")){
            countNextEnum = 7;
        }
        if (valueEnumNext.equals("Nine")){
            countNextEnum = 8;
        }
        if (valueEnumNext.equals("Ten")){
            countNextEnum = 9;
        }
        if (valueEnumNext.equals("Eleven")){
            countNextEnum = 10;
        }
        if (valueEnumNext.equals("Twelve")){
            countNextEnum = 11;
        }
        if (valueEnumNext.equals("Thirteen")){
            countNextEnum = 12;
        }
        if (valueEnumNext.equals("Fourteen")){
            countNextEnum = 13;
        }
        if (valueEnumNext.equals("Fifteen")){
            countNextEnum = 14;
        }
        if (valueEnumNext.equals("Sixteen")){
            countNextEnum = 15;
        }
//        Map<Integer, String> mapOfEnum = new HashMap<Integer, String>();
//        Set<Map.Entry<Integer, String>> entries = mapOfEnum.entrySet();
//        Iterator<Map.Entry<Integer, String>> moviesIterator = entries.iterator();
//        Map.Entry<Integer, String> entry = moviesIterator.next();
//        entry.getKey();
//        mapOfEnum.put(countEnum, valueEnum);
    }

    public void terminate(){
        CardGameEnum cardGameEnum = new CardGameEnum();
        baseList = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen");
        auxList = new ArrayList<>();
        n = 0;
        r = 1;
        valueEnum = "One";
        valueEnumNext = "One";
        disabled = false;
        revDisabled = true;
        disabledOption = false;
        finalDisabled = true;
        visibleDisabled = false;
        countEnum = 0;
        countNextEnum = 0;
        sumpoint = 0;
        CardGameEnum.point = new int[16];
        CardGameEnum.status = new int[16];
        CardGameEnum.setA(0);
        CardGameEnum.setB(0);
        CardGameEnum.setC(0);
    }

    public int sumPoints() {
        sumpoint = Arrays.stream(CardGameEnum.point).sum();
        return sumpoint;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public  void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Boolean getRevDisabled() {
        return revDisabled;
    }

    public  void setRevDisabled(Boolean revDisabled) {
        this.revDisabled = revDisabled;
    }

    public Boolean getDisabledOption() {
        return disabledOption;
    }

    public  void setDisabledOption(Boolean disabledOption) {
        this.disabledOption = disabledOption;
    }

    public  Boolean getFinalDisabled() {
        return finalDisabled;
    }

    public  void setFinalDisabled(Boolean finalDisabled) {
        this.finalDisabled = finalDisabled;
    }

    public  Boolean getVisibleDisabled() {return visibleDisabled;}

    public  void setVisibleDisabled(Boolean visibleDisabled) {
        this.visibleDisabled = visibleDisabled;
    }

    public static void dupa() {

    }

    public  List<String> getBaseList() {
        return baseList;
    }

    public  void setBaseList(List<String> baseList) {
        this.baseList = baseList;
    }

    public  int getN() {
        return n;
    }

    public  void setN(int n) {
        this.n = n;
    }

    public  int getR() {
        return r;
    }

    public  void setR(int r) {
        this.r = r;
    }

    public  String getValueEnum() {
        return valueEnum;
    }

    public CardGameActions() {
        System.out.println("dupa");
        System.out.println(this);
    }
}


