package com.calculator.controller;

import com.calculator.model.CalcModel;
import com.calculator.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Conroller {

    CalcModel calcModel = new CalcModel();

    @Autowired
    private CalcService calcService;

    @GetMapping("/calc")
    public String getCalcPage(Model model){
        model.addAttribute("calcModel", calcModel);
        return "calc";
    }

    @PostMapping("/calc")
    public String add(@RequestParam(value ="add") CalcModel calcModel,
                      Model model){
        model.addAttribute("result", calcService.add(calcModel));
        return "calc";
    }





}
