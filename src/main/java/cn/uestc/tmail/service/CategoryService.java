package cn.uestc.tmail.service;

import cn.uestc.tmail.pojo.Category;
import cn.uestc.tmail.util.Page;

import java.util.List;

public interface CategoryService {

    List<Category> list(Page page);

    Integer total();
}
