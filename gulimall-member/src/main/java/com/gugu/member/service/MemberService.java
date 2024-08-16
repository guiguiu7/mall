package com.gugu.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gugu.common.utils.PageUtils;
import com.gugu.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Gwynliu7
 * @email sunlightcs@gmail.com
 * @date 2024-08-16 14:42:29
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

