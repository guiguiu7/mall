package com.gugu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gugu.common.utils.PageUtils;
import com.gugu.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author Gwynliu7
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 22:01:27
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

