package com.gugu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gugu.common.utils.PageUtils;
import com.gugu.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author Gwynliu7
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 22:01:27
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

