package org.example.service;

import org.example.service.dao.BeerDao;
import org.example.service.pojo.Address;
import org.example.service.pojo.BeanInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) // 使用MockitoExtension来支持Mockito注解
@SpringBootTest
class BeerServiceTest {

    @MockBean  // BeanDao没有实现前，使用MockBean模拟这个B ean
    private BeerDao beerDao;

    @InjectMocks // 要测试的对象，里面有些依赖还没有完成，如beanDao
    private BeerServiceImpl beerService;

    @Test
    void getBeerInfo() {
        BeanInfo beanInfo = new BeanInfo();
        beanInfo.setName("Qingdao Beer");
        beanInfo.setBrand("Snow Flower");
        beanInfo.setAddress(Address.builder().city("qingdao").province("shandong").country("China").build());

        // beerDao还没有完成，但是可以@Mock模拟一个实现,这里丰富被模拟对象的逻辑
        when(beerDao.selectBeanInfoByName("qingdao")).thenReturn(beanInfo);

        // 测试mock对象
        BeanInfo beerInfo = beerService.getBeerInfo("qingdao");
        assertEquals(beerInfo.getBrand(), "Snow Flower");
    }
}