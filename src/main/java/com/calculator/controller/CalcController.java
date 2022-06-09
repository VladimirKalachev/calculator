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
        model.addAttribute("calcModel", calcModel);
        return "calc";
    }

    /* @GetMapping("/calc")
     public String add(@RequestParam (value = "/calc") CalcModel calcModel,
                       Model model){
         System.out.println(calcModel.getA());
         model.addAttribute("result", calcService.add(calcModel));
         return "calc";
     }
 */
    /*@RequestMapping(value = "/calc", params = "add", method = RequestMethod.POST)
    public String addAB(@ModelAttribute("calcModel") CalcModel calcModel, Model model) {

        System.out.println("A " + calcModel.getA());
        System.out.println("Calcmodel toString " + calcModel.toString());
        model.addAttribute("result", calcService.add(calcModel));
        return "calc";
    }*/

  /*  @RequestMapping(value = "/calc", params = "subtract", method = RequestMethod.POST)
    public String subAB(@ModelAttribute("calcModel") CalcModel calcModel,
                      Model model) {

        System.out.println("A " + calcModel.getA());
        System.out.println(calcModel.toString());
        model.addAttribute("result", calcService.sub(calcModel));
        return "calc";
    }*/

  /*  @GetMapping(value = "multiply")
    public String multAB(@RequestParam(name = "calcModel") CalcModel calcModel,
                       Model model) {
        System.out.println("Multiply " + calcModel.toString());
        System.out.println("A = " + calcModel.getA());
       model.addAttribute(calcModel.getA() * calcModel.getB());
        return "calc";
    }*/

    @GetMapping("/plus")
    public String addAB(@RequestBody CalcModel calcModel,
                       Model model) {
        System.out.println("Multiply " + calcModel.toString());
        System.out.println("A = " + calcModel.getA());
        model.addAttribute(calcModel.getA() + calcModel.getB());
        return "calc";
    }

}
