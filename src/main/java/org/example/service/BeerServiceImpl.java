package org.example.service;

import org.example.service.dao.BeerDao;
import org.example.service.pojo.BeanInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService {

    @Autowired
    private BeerDao beerDao;  // 没有完成哦！

    @Override
    public BeanInfo getBeerInfo(String name) {
        return beerDao.selectBeanInfoByName(name);
    }
}
