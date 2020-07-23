package main.java.imagegalleryspring.controller;

import imagegalleryspring.model.Category;
import imagegalleryspring.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {


    private final CategoryService categoryService;

    @GetMapping("/")
    public String homePage(ModelMap modelMap){
        List<Category> category = categoryService.findAll();
        modelMap.addAttribute("categories", category);
        return "index";
    }
}
