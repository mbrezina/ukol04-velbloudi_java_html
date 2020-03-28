package cz.czechitas.webapp;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class HlavniController {

    public Boolean neniJmeno(String jmeno) {
        String regex = "[a-zA-Zá-žÁ-Ž]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(jmeno);
        if (matcher.find()) {
            return Boolean.FALSE;
        } else {
            return Boolean.TRUE;
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView kalkulackaZena() {
        ModelAndView data = new ModelAndView("index");
        //data.addObject("seznamFotekKocekPsu", souboryKockyPsi);
        return data;
    }

    @RequestMapping(value = "/zena.html", method = RequestMethod.GET)
    public ModelAndView zobrazIndex() {
        ModelAndView data = new ModelAndView("zena");
        //data.addObject("seznamFotekKocekPsu", souboryKockyPsi);
        return data;
    }

    //@RequestMapping(value = {"/zena.html", "/muz.html"}, method = RequestMethod.POST)

    @RequestMapping(value = "/zena.html", method = RequestMethod.POST)
    public ModelAndView zpracujZenu(ZenaForm vstup) {


        final List<Odpoved> SEZNAMODPOVEDI = new ArrayList<Odpoved>();
        //slider:
        SEZNAMODPOVEDI.add(new Odpoved("velikostBot", 6, "lego_checked"));
        //slider:
        SEZNAMODPOVEDI.add(new Odpoved("vyska", 6, "lego_checked"));
        //options:
        SEZNAMODPOVEDI.add(new Odpoved("modre", 4, "lego_checked"));
        SEZNAMODPOVEDI.add(new Odpoved("hnede", 4, "lego_checked"));
        SEZNAMODPOVEDI.add(new Odpoved("sede", 4, "lego_checked"));
        SEZNAMODPOVEDI.add(new Odpoved("zelene", 4, "lego_checked"));
        SEZNAMODPOVEDI.add(new Odpoved("sedozelene", 4, "lego_checked"));
        //radio button:
        SEZNAMODPOVEDI.add(new Odpoved("kolo", 10, "lego_checked"));
        SEZNAMODPOVEDI.add(new Odpoved("auto", 2, "lego_checked"));
        SEZNAMODPOVEDI.add(new Odpoved("salina", 6, "lego_checked"));
        SEZNAMODPOVEDI.add(new Odpoved("pesky", 9, "lego_checked"));
        SEZNAMODPOVEDI.add(new Odpoved("letadlo", 0, "lego_checked"));
        //checkboxes:
        SEZNAMODPOVEDI.add(new Odpoved("krecek", 1, "lego_checked"));
        SEZNAMODPOVEDI.add(new Odpoved("lego", 8, "lego_checked"));
        SEZNAMODPOVEDI.add(new Odpoved("java", 6, "lego_checked"));
        SEZNAMODPOVEDI.add(new Odpoved("hory", 8, "lego_checked"));
        SEZNAMODPOVEDI.add(new Odpoved("sranda", 9, "lego_checked"));
        SEZNAMODPOVEDI.add(new Odpoved("srdce", 10, "lego_checked"));

        Integer pocetVelbloudu = 0;
        String osloveni = "Vaše partnerka ";

        System.out.println("je to pravda: " + vstup.getJmeno().isEmpty());
        if (vstup.getJmeno().isEmpty() || neniJmeno(vstup.getJmeno())) {
            ModelAndView data = new ModelAndView("zena");
            data.addObject("jmeno_feedback", "form-control is-invalid");
            return data;

        } else {
            osloveni += vstup.getJmeno();
        }

        if (vstup.getVyska() < 160 || vstup.getVyska() > 180) {
            pocetVelbloudu += 3;
        } else {
            pocetVelbloudu += 6;
        }

        if (vstup.getVelikostBot() < 38 || vstup.getVelikostBot() > 42) {
            pocetVelbloudu += 2;
        } else {
            pocetVelbloudu += 5;
        }
        System.out.println("jméno je: " + vstup.getJmeno());

        pocetVelbloudu += vstup.getDopravniProstredek() + vstup.getBarvaOci() + vstup.getHory() +
                vstup.getJava() + vstup.getSrdce() + vstup.getSranda() + vstup.getKrecek() + vstup.getLego();

        ModelAndView data = new ModelAndView("vysledek");
        data.addObject("velbloudi", pocetVelbloudu);
        data.addObject("jmeno", osloveni);
        return data;
    }
}