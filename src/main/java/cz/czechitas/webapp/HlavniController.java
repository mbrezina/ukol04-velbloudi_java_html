package cz.czechitas.webapp;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Arrays.*;

@Controller
public class HlavniController {

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
        ModelAndView data = new ModelAndView("vysledek");
        Integer pocetVelbloudu = 0;
        String osloveni = "Vaše partnerka ";

        System.out.println("je to pravda: " + vstup.getJmeno().isEmpty());
        if (!vstup.getJmeno().isEmpty()) {
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

        data.addObject("velbloudi", pocetVelbloudu);
        data.addObject("jmeno", osloveni);
        return data;
    }
}