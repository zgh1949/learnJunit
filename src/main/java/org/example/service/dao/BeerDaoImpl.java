package org.example.service.dao;

import org.example.service.pojo.BeanInfo;
import org.springframework.stereotype.Repository;

@Repository
public class BeerDaoImpl implements BeerDao {
    @Override
    public BeanInfo selectBeanInfoByName(String name) {
        // 没有实现
        return null;
    }
}
