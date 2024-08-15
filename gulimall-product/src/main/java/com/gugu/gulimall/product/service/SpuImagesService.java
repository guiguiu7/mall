package com.gugu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gugu.common.utils.PageUtils;
import com.gugu.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author Gwynliu7
 * @email sunlightcs@gmail.com
 * @date 2024-08-15 22:01:27
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

