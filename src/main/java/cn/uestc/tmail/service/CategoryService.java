package cn.uestc.tmail.service;

import cn.uestc.tmail.pojo.Category;
import cn.uestc.tmail.util.Page;

import java.util.List;

public interface CategoryService {

    List<Category> list();

    void add(Category category);

    void delete(Integer id);

    Category get(Integer id);

    void update(Category category);
}
