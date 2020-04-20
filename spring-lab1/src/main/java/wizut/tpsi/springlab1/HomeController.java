/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.springlab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author naeri
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/hello")
    public String hello(Model model, String imie, Integer wiek) {
        model.addAttribute("imie", imie);
        model.addAttribute("wiek", wiek);

        return "hello";
    }

    @RequestMapping("/dodajOsobe")
    public String dodajOsobe(Model model, OsobaForm osoba) {
        model.addAttribute("imie", osoba.getImie());
        model.addAttribute("nazwisko", osoba.getNazwisko());
        model.addAttribute("wiek", osoba.getWiek());
        return "dodajOsobe";
    }

}
