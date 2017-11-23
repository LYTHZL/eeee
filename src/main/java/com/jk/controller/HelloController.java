package com.jk.controller;


import com.jk.model.Sale;
import com.jk.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mr.wangbin on 2017/11/14.
 */
@Controller
public class HelloController {
    @Autowired
    private SaleService saleService;


    @RequestMapping("/add")
    public String add(Sale sale) {

        saleService.save(sale);
        return "redirect:/list1";
    }

    @RequestMapping("/test")
    public void test(HttpServletResponse response){
        try {
            response.getWriter().write("a");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/list1")
    public String list1(Model model,@RequestParam(value = "page", defaultValue = "0") Integer page,
                        @RequestParam(value = "size", defaultValue = "2") Integer size,Sale sale) {
        Page<Sale> sales = saleService.findBookNoCriteria(page, size ,sale);
        model.addAttribute("datas", sales);
        return "user/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<Sale> sales=saleService.getUserList();
        model.addAttribute("sales", sales);
        return "user/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "user/userAddTo";
    }

    @RequestMapping("/A")
    public void test(HttpServletResponse response, HttpServletRequest request){

        System.out.println("HELLER WORLD!");
    }
        }
