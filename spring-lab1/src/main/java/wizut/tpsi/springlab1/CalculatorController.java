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
public class CalculatorController {
    
    @RequestMapping("/call")
    public String call(Model model, CalculatorForm Call) {
        
        model.addAttribute("x", Call.getX());
        model.addAttribute("y", Call.getY());
        model.addAttribute("opera", Call.getOpera());
        model.addAttribute("wynik", Call.getWynik());

        return "call";
    }
}
