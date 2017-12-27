package cn.uestc.tmail.service.impl;

import cn.uestc.tmail.mapper.PropertyMapper;
import cn.uestc.tmail.pojo.Property;
import cn.uestc.tmail.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    PropertyMapper propertyMapper;

    @Override
    public List<Property> list(Integer cid) {
        return propertyMapper.list(cid);
    }

    @Override
    public Property get(Integer id) {
        return propertyMapper.get(id);
    }

    @Override
    public void add(Property property) {
        propertyMapper.add(property);
    }

    @Override
    public void delete(Integer id) {
        propertyMapper.delete(id);
    }

    @Override
    public void update(Property property) {
        propertyMapper.update(property);
    }
}
