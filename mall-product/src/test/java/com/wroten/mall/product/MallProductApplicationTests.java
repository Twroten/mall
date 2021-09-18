package com.wroten.mall.product;

import com.wroten.mall.product.entity.BrandEntity;
import com.wroten.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MallProductApplication.class)
class MallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("xiaomi");

        brandService.save(brandEntity);
        System.out.println("保存成功！");
    }

}
