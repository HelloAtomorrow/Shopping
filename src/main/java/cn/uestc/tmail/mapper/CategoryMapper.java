package cn.uestc.tmail.mapper;

import cn.uestc.tmail.pojo.Category;
import cn.uestc.tmail.util.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {

    List<Category> list(Page page);

    Integer total();

    void add(Category category);

    void delete(Integer id);

    Category get(Integer id);

    void update(Category category);
}
