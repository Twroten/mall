package com.wroten.mall.product;

import com.wroten.mall.product.entity.BrandEntity;
import com.wroten.mall.product.service.BrandService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");

        brandService.save(brandEntity);
        System.out.println("保存成功！");
    }

}
