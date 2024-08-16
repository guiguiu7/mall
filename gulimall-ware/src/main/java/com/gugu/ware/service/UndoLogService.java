package com.gugu.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gugu.common.utils.PageUtils;
import com.gugu.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author Gwynliu7
 * @email 2249012464@qq.com
 * @date 2024-08-16 14:56:01
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

