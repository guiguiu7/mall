package com.gugu.member.dao;

import com.gugu.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Gwynliu7
 * @email sunlightcs@gmail.com
 * @date 2024-08-16 14:42:29
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
