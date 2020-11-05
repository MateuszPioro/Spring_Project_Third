package com.mateuszpiorowicz.module.dashboard;


import com.mateuszpiorowicz.module.dashboard.dto.ArticleDto;
import com.mateuszpiorowicz.module.dashboard.dto.CommentDto;
import com.mateuszpiorowicz.module.dashboard.dto.MenuDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DashboardController {

    private MenuService menuService;
    private AcrticleService acrticleService;

    @Autowired
    public DashboardController(MenuService menuService, AcrticleService acrticleService) {
        this.menuService = menuService;
        this.acrticleService = acrticleService;
    }

    @RequestMapping("/dashboard")
    public String getHome(Model model) {
        model.addAttribute("menu", menuService.getMenu());
        model.addAttribute("article", acrticleService.getArticle());
        return "dashboard";
    }
}
