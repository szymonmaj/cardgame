package cardgame.cardgame.cardgame;

import cardgame.cardgame.model.CardGameActions;
import cardgame.cardgame.model.CardGameEnum;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@Controller
@AllArgsConstructor
public class CardGameController {
    CardGameActions cardGameActions;
    CardGameEnum cardGameEnum;
    @GetMapping("/")
    public String showForm(Model model, HttpSession session) {
        session.setAttribute("licznik", 0);
        model.addAttribute("cardGameActions", cardGameActions);
        return "start";
    }

    @GetMapping("/shuffle")
    public String shuffle(Model model, HttpSession session) {
        Integer licznik = (Integer) session.getAttribute("licznik");
        System.out.println(licznik);
        licznik++;
        session.setAttribute("licznik", licznik);
        model.addAttribute("cardGameActions", cardGameActions);
        model.addAttribute("cardGameEnum", cardGameEnum);
        return "shuffle";
    }

    @GetMapping("/deck")
    public String deck(Model model) {
        model.addAttribute("cardGameActions", cardGameActions);
        model.addAttribute("cardGameEnum", cardGameEnum);
        return "deck";
    }

    @PostMapping("/")
    public String submitForm(@ModelAttribute CardGameActions cardGameActions, @RequestParam(required = false) String name) {
        if (name.equals("Losuj")){
            CardGameActions.shuffleList();
            CardGameActions.setDisabled(true);
        }
        return "start";
    }

    @PostMapping("/shuffle")
    public String submitShuffle(@ModelAttribute CardGameActions cardGameActions, @RequestParam(required = false) String name) {
        if (name.equals("Pokaż kartę")){
            cardGameActions.mill();
            CardGameActions.setRevDisabled(false);
            CardGameActions.setDisabledOption(false);
            CardGameActions.setVisibleDisabled(true);
            if (CardGameActions.getN() != 0) {
                CardGameEnum.setKom(" ");
            }
            return "deck";
        }
        if (name.equals("Podejrzyj aktualną kartę")){
            if (!CardGameEnum.getKom().contains("Koniec")) {
                if (CardGameActions.getN() != 0 || !CardGameEnum.getKom().contains("Runda")) {
                CardGameEnum.setKom(" ");
                }
            }
            return "deck";
        }
        if (name.equals("Podejrzyj następną kartę")){
            if (!CardGameEnum.getKom().contains("Koniec")) {
                if (CardGameActions.getN() != 0 || !CardGameEnum.getKom().contains("Runda")) {
                    CardGameEnum.setKom(" ");
                }
            }
            return "nextCard";
        }
        else {
            return "deck";
        }
    }

    @PostMapping("/deck")
    public String submitDeck(@ModelAttribute CardGameActions cardGameActions, @ModelAttribute CardGameEnum cardGameEnum, @RequestParam(required = false) String name) {
        if (!cardGameEnum.getKom().contains("Runda:")) {
            cardGameEnum.setKom(" ");
        }
        if (name.equals("Opcja 1") || name.equals("A") || name.equals("B") || name.equals("C")){
            if (name.equals("A")){
                cardGameActions.result1("A");
                if (cardGameEnum.getKom().contains("akcja")){
                }
                else {
                    CardGameActions.setDisabledOption(true);
                }
            }
            if (name.equals("B")){
                cardGameActions.result1("B");
                if (cardGameEnum.getKom().contains("akcja")){
                }
                else {
                    CardGameActions.setDisabledOption(true);
                }
            }
            if (name.equals("C")){
                cardGameActions.result1("C");
                if (cardGameEnum.getKom().contains("akcja")){
                }
                else {
                    CardGameActions.setDisabledOption(true);
                }
            }
            if (name.equals("Opcja 1")) {
                cardGameActions.result1("Z");
                if (cardGameEnum.getKom().contains("akcja")) {
                } else {
                    CardGameActions.setDisabledOption(true);
                }
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
}
