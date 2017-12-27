package cn.uestc.tmail.mapper;

import cn.uestc.tmail.pojo.Property;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyMapper {

    List<Property> list(Integer cid);

    Property get(Integer id);

    void add(Property property);

    void delete(Integer id);

    void update(Property property);
}
