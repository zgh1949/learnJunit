package org.example.service.dao;

import org.example.service.pojo.BeanInfo;

public interface BeerDao {
    BeanInfo selectBeanInfoByName(String name);
}
