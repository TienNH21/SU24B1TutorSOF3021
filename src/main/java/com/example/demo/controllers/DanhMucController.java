package com.example.demo.controllers;

import com.example.demo.entities.DanhMuc;
import com.example.demo.repositories.DanhMucRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("danh-muc")
public class DanhMucController {
    private DanhMucRepository cateRepo = new DanhMucRepository();

    @GetMapping("index")
    public String index(Model model)
    {
        List<DanhMuc> ds = this.cateRepo.findAll();
        model.addAttribute("data", ds);
        return "danh_muc/index";
    }
}
