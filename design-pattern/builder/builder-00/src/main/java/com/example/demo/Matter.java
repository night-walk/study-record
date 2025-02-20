package com.example.demo;

import java.math.BigDecimal;

/**
 * @Author: zhoujing
 * @Date: 2025/2/5 13:48
 * @Description:
 */
public interface Matter {

    /**
     * 场景；地板、地砖、涂料、吊顶
     */
    String scene();

    /**
     * 品牌
     */
    String brand();

    /**
     * 型号
     */
    String model();

    /**
     * 平米报价
     */
    BigDecimal price();

    /**
     * 描述
     */
    String desc();
}
