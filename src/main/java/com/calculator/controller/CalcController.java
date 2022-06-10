package com.calculator.controller;

import com.calculator.model.CalcModel;
import com.calculator.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalcController {

    CalcModel calcModel = new CalcModel();

    @Autowired
    private CalcService calcService;

    @GetMapping("/calc")
    public String getCalcPage(Model model) {
        CalcModel calcModel = new CalcModel();
        model.addAttribute("calcModel", calcModel);
        return "calc";
    }

    @RequestMapping(value = "/calc", method = RequestMethod.POST, params = "plus")
    public String plusAB(@RequestParam(value = "a") int a,
                         @RequestParam(value = "b") int b,
                         Model model) {
        model.addAttribute("result", calcService.add(a, b));
        return "calc";
    }

    @RequestMapping(value = "/calc", method = RequestMethod.POST, params = "subst")
    public String subAB(@RequestParam(value = "a") int a,
                        @RequestParam(value = "b") int b,
                        Model model) {
        model.addAttribute("result", calcService.substr(a, b));
        return "calc";
    }

    @RequestMapping(value = "/calc", method = RequestMethod.POST, params = "mult")
    public void multiplyAB(@RequestParam(value = "a") int a,
                           @RequestParam(value = "b") int b,
                           Model model) {
        model.addAttribute("result", calcService.multiply(a, b));
    }

    @RequestMapping(value = "/calc", method = RequestMethod.POST, params = "divide")
    public void divideAB(@RequestParam(value = "a") int a,
                         @RequestParam(value = "b") int b,
                         Model model) {
        model.addAttribute("result", calcService.divide(a, b));
    }

    //advanced
    @RequestMapping(value = "/calc", method = RequestMethod.POST, params = "fact")
    public void factorial(@RequestParam(value = "c") int c,
                          Model model) {
        model.addAttribute("result", calcService.fact(c));
    }

    @RequestMapping(value = "/calc", method = RequestMethod.POST, params = "sqrt")
    public void sqrt(@RequestParam(value = "c") int c,
                     Model model) {
        model.addAttribute("result", calcService.sqrt(c));
    }

    @RequestMapping(value = "/calc", method = RequestMethod.POST, params = "pow")
    public void sqrt(@RequestParam(value = "a") int a,
                     @RequestParam(value = "b") int b,
                     Model model) {
        model.addAttribute("result", calcService.power(a, b));
    }

}
