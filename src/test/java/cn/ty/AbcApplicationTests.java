package cn.ty;

import cn.ty.pojo.Abc;
import cn.ty.service.AbcService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AbcApplicationTests {

    @Autowired
    private AbcService service;

    @Test
    void contextLoads() {
    }

    @Test
    void add(){
        Abc abc = new Abc();
        abc.setId(1);
        abc.setName("马跃飞");
        abc.setPassword("12222");
        service.save(abc);
    }

}
