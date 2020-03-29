package cz.czechitas.webapp;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

import static java.util.Arrays.*;

@Controller
public class HlavniController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView kalkulackaZena() {
        ModelAndView data = new ModelAndView("index");
        return data;
    }

    @RequestMapping(value = "/zena.html", method = RequestMethod.GET)
    public ModelAndView zobrazIndex(Model predvyplnenyModel) {
        ModelAndView data = new ModelAndView("zena");
        if (!predvyplnenyModel.containsAttribute("formular")) {
            data.addObject("formular", new ZenaForm());
        }
        return data;
    }

    @RequestMapping(value = "/zena.html", method = RequestMethod.POST)
    public ModelAndView zpracujZenu(@Valid ZenaForm vyplnenyFormular, BindingResult validacniChyby, RedirectAttributes flashScope) {
        if (validacniChyby.hasErrors()) {
            ModelAndView data = new ModelAndView("redirect:/zena.html");
            flashScope.addFlashAttribute("formular", vyplnenyFormular);
            flashScope.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "formular", validacniChyby);
            return data;
        }

        ModelAndView data = new ModelAndView("vysledek");
        Integer pocetVelbloudu = 0;
        String osloveni = "Vaše partnerka ";

        osloveni += vyplnenyFormular.getJmeno();

        ///////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        Integer vyska = Integer.parseInt(vyplnenyFormular.getVelikostBot());
        Integer velikostBot = Integer.parseInt(vyplnenyFormular.getVyska();
        Integer velikostBot = Integer.parseInt(vyplnenyFormular.getVyska();
        Integer velikostBot = Integer.parseInt(vyplnenyFormular.getVyska();
        Integer velikostBot = Integer.parseInt(vyplnenyFormular.getVyska();
        Integer velikostBot = Integer.parseInt(vyplnenyFormular.getVyska();


        if (vyplnenyFormular.getVyska() < 160 || vyplnenyFormular.getVyska() > 180) {
            pocetVelbloudu += 3;
        } else {
            pocetVelbloudu += 6;
        }

        if (vyplnenyFormular.getVelikostBot() < 38 || vyplnenyFormular.getVelikostBot() > 42) {
            pocetVelbloudu += 2;
        } else {
            pocetVelbloudu += 5;
        }
        System.out.println("jméno je: " + vyplnenyFormular.getJmeno());

        pocetVelbloudu += vyplnenyFormular.getDopravniProstredek() + vyplnenyFormular.getBarvaOci() + vyplnenyFormular.getHory() +
                vyplnenyFormular.getJava() + vyplnenyFormular.getSrdce() + vyplnenyFormular.getSranda() + vyplnenyFormular.getKrecek() + vyplnenyFormular.getLego();

        data.addObject("velbloudi", pocetVelbloudu);
        data.addObject("jmeno", osloveni);
        return data;
    }
}