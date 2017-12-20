package cn.uestc.tmail.service.impl;

import cn.uestc.tmail.mapper.CategoryMapper;
import cn.uestc.tmail.pojo.Category;
import cn.uestc.tmail.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }
}
