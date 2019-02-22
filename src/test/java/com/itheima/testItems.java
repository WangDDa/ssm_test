package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class testItems {
        @Autowired
        private ItemsDao itemsDao;
        @Autowired
        private ItemsService itemsService; //注：不要用serviceImpl

        @Test
        public void testDao(){
            Items byId = itemsDao.findById(1);
            System.out.println("byId = " + byId);
        }

        @Test
        public void testService(){
            Items byId = itemsService.findById(1);
            System.out.println("byId = " + byId);
        }
}
