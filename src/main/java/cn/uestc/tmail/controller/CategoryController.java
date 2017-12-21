package cn.uestc.tmail.controller;

import cn.uestc.tmail.pojo.Category;
import cn.uestc.tmail.service.CategoryService;
import cn.uestc.tmail.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/admin_category_list")
    public String list(Model model, Page page) {
        List<Category> categories = categoryService.list(page);
        Integer total = categoryService.total();
        page.setTotalDataNumber(total);
        model.addAttribute("categories", categories);
        model.addAttribute("page", page);
        return "admin/listCategory";
    }
}
