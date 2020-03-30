package cz.czechitas.webapp;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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


    ////////////  ŽENA:
    @RequestMapping(value = "/zena.html", method = RequestMethod.GET)
    public String zobrazZenu(ModelMap predvyplnenyDrzakNaData) {
        predvyplnenyDrzakNaData.putIfAbsent("formular", new ZenaForm());
        return "zena";
    }

    @RequestMapping(value = "/zena.html", method = RequestMethod.POST)
    public ModelAndView zpracujZenu(@Valid @ModelAttribute("formular") ZenaForm vyplnenyFormular,
                                    BindingResult validacniChyby,
                                    RedirectAttributes flashScope) {
        if (validacniChyby.hasErrors()) {
            ModelAndView data = new ModelAndView("redirect:/zena.html");
            flashScope.addFlashAttribute("formular", vyplnenyFormular);
            flashScope.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "formular", validacniChyby);
            return data;
        }

        ModelAndView data = new ModelAndView("vysledek");
        int pocetVelbloudu = 0;
        String osloveni = "Vaše partnerka ";

        osloveni += vyplnenyFormular.getJmeno();

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


    ////////////  MUŽ:
    @RequestMapping(value = "/muz.html", method = RequestMethod.GET)
    public String zobrazMuze(ModelMap predvyplnenyDrzakNaData) {
        predvyplnenyDrzakNaData.putIfAbsent("formular", new MuzForm());
        return "muz";
    }

    @RequestMapping(value = "/muz.html", method = RequestMethod.POST)
    public ModelAndView zpracujMuze(@Valid @ModelAttribute("formular") MuzForm vyplnenyFormular,
                                    BindingResult validacniChyby,
                                    RedirectAttributes flashScope) {
        if (validacniChyby.hasErrors()) {
            ModelAndView data = new ModelAndView("redirect:/muz.html");
            flashScope.addFlashAttribute("formular", vyplnenyFormular);
            flashScope.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "formular", validacniChyby);
            return data;
        }

        ModelAndView data = new ModelAndView("vysledek");
        int pocetVelbloudu = 0;
        String osloveni = "Váš partner ";

        osloveni += vyplnenyFormular.getJmeno();


        if (vyplnenyFormular.getVyska() < 180 || vyplnenyFormular.getVyska() > 190) {
            pocetVelbloudu += 3;
        } else {
            pocetVelbloudu += 6;
        }

        if (vyplnenyFormular.getVelikostBot() < 40 || vyplnenyFormular.getVelikostBot() > 46) {
            pocetVelbloudu += 2;
        } else {
            pocetVelbloudu += 5;
        }
        System.out.println("jméno je: " + vyplnenyFormular.getJmeno());

        pocetVelbloudu += vyplnenyFormular.getDopravniProstredek() + vyplnenyFormular.getBarvaAuta() + vyplnenyFormular.getHory() +
                vyplnenyFormular.getCpp() + vyplnenyFormular.getSrdce() + vyplnenyFormular.getSranda() + vyplnenyFormular.getMotorka() + vyplnenyFormular.getLego();

        data.addObject("velbloudi", pocetVelbloudu);
        data.addObject("jmeno", osloveni);
        return data;
    }



}


