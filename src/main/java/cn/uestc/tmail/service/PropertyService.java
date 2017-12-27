package cn.uestc.tmail.service;

import cn.uestc.tmail.pojo.Property;

import java.util.List;

public interface PropertyService {

    List<Property> list(Integer cid);

    Property get(Integer id);

    void add(Property property);

    void delete(Integer id);

    void update(Property property);

}
