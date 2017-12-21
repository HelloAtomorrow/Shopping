package cn.uestc.tmail.mapper;

import cn.uestc.tmail.pojo.Category;
import cn.uestc.tmail.util.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {

    public List<Category> list(Page page);

    public Integer total();
}
