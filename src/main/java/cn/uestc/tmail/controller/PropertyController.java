package cn.uestc.tmail.controller;

import cn.uestc.tmail.pojo.Category;
import cn.uestc.tmail.pojo.Property;
import cn.uestc.tmail.service.CategoryService;
import cn.uestc.tmail.service.PropertyService;
import cn.uestc.tmail.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("admin_property_list")
    public String list(Integer cid, Model model, Page page) {
        PageHelper.offsetPage(page.getCurrentLocation(), page.getEachPageDataNumber());
        List<Property> properties = propertyService.list(cid);
        Integer total = (int) new PageInfo<>(properties).getTotal();
        page.setTotalDataNumber(total);

        Category category = categoryService.get(cid);
        page.setParam("&cid=" + category.getId());

        model.addAttribute("properties", properties);
        model.addAttribute("category", category);
        model.addAttribute("page", page);

        return "admin/listProperty";
    }

    @RequestMapping("admin_property_add")
    public String add(Property property) {
        propertyService.add(property);
        return "redirect:admin_property_list?cid=" + property.getCid();
    }

    @RequestMapping("admin_property_edit")
    public String edit(Model model, Integer id) {
        Property property = propertyService.get(id);
        Category category = categoryService.get(property.getCid());
        property.setCategory(category);
        model.addAttribute("property", property);
        return "admin/editProperty";
    }

    @RequestMapping("admin_property_update")
    public String update(Property property) {
        propertyService.update(property);
        return "redirect:admin_property_list?cid=" + property.getCid();
    }

    @RequestMapping("admin_property_delete")
    public String delete(Integer id) {
        Property property = propertyService.get(id);
        propertyService.delete(id);
        return "redirect:admin_property_list?cid=" + property.getCid();
    }
}
