package cardgame.cardgame.cardgame;

import cardgame.cardgame.model.CardGameActions;
import cardgame.cardgame.model.CardGameEnum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class CardGameController {
    @GetMapping("/")
    public String showForm(Model model) {
        CardGameActions cardGameActions = new CardGameActions();
        model.addAttribute("cardGameActions", cardGameActions);
        return "start";
    }

    @GetMapping("/shuffle")
    public String shuffle(Model model) {
        CardGameActions cardGameActions = new CardGameActions();
        CardGameEnum cardGameEnum = new CardGameEnum();
        model.addAttribute("cardGameActions", cardGameActions);
        model.addAttribute("cardGameEnum", cardGameEnum);
        return "shuffle";
    }

    @GetMapping("/deck")
    public String deck(Model model) {
        CardGameActions cardGameActions = new CardGameActions();
        CardGameEnum cardGameEnum = new CardGameEnum();
        model.addAttribute("cardGameActions", cardGameActions);
        model.addAttribute("cardGameEnum", cardGameEnum);
        return "deck";
    }

//    @GetMapping("/shuffle")
//    @RequestMapping(value = "/shuffle")
//    public String shuffle(@RequestParam("second") String second, Model model) {
//        CardGameActions cardGameActions = new CardGameActions();
//        model.addAttribute("cardGameActions", cardGameActions);
//        model.addAttribute("disableSecondButton", true);
//
//        return "shuffle";
//    }
//    public String disable(@RequestParam("second") String second, Model model) {
//        CardGameActions cardGameActions = new CardGameActions();
//        model.addAttribute("disableSecondButton", true);
//
//        return "shuffle";
//    }

    @PostMapping("/")
    public String submitForm(@ModelAttribute CardGameActions cardGameActions, @RequestParam(required = false) String name) {
        System.out.println(cardGameActions);

        if (name.equals("Losuj")){
            CardGameActions.shuffleList();
            CardGameActions.setDisabled(true);
        }
        return "start";
    }

    @PostMapping("/shuffle")
    public String submitShuffle(@ModelAttribute CardGameActions cardGameActions, @RequestParam(required = false) String name) {
//        System.out.println(cardGameActions);
//        CardGameActions.shuffleList();
//        CardGameActions.setDisabled(true);
        if (name.equals("Pokaż kartę")){
            cardGameActions.mill();
            CardGameActions.setRevDisabled(false);
            CardGameActions.setDisabledOption(false);
            return "deck";
        }
        if (name.equals("Podejrzyj aktualną kartę")){
            return "deck";
        }
        if (name.equals("Podejrzyj następną kartę")){
            return "nextCard";
        }
        else {
            return "deck";
        }
    }

    @PostMapping("/deck")
    public String submitDeck(@ModelAttribute CardGameActions cardGameActions, @ModelAttribute CardGameEnum cardGameEnum, @RequestParam(required = false) String name) {
        cardGameEnum.setKom(" ");
        if (name.equals("Opcja 1")){
            cardGameActions.result1();
            if (cardGameEnum.getKom().contains("akcja")){
            }
            else {
                CardGameActions.setDisabledOption(true);
            }
        }
        if (name.equals("Opcja 2")){
            cardGameActions.result2();
            if (cardGameEnum.getKom().contains("akcja")){
            }
            else {
                CardGameActions.setDisabledOption(true);
            }
        }
        if (name.equals("Opcja 3")){
            cardGameActions.result3();
            if (cardGameEnum.getKom().contains("akcja")){
            }
            else {
                CardGameActions.setDisabledOption(true);
            }
        }
        return "shuffle";
    }

    @PostMapping("/nextCard")
    public String submitNextCard(@ModelAttribute CardGameActions cardGameActions, @RequestParam(required = false) String name) {
        return "nextCard";
    }
//    @RequestMapping(value = "/shuffle")
//    public String disable(@RequestParam("second") String second, Model model) {
//        CardGameActions cardGameActions = new CardGameActions();
//        model.addAttribute("disableSecondButton", true);
//
//        return "start";
//    }
}
