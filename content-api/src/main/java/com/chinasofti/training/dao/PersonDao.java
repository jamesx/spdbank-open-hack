package com.chinasofti.training.dao;

import com.chinasofti.training.entity.PersonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author august
 * @email 379249906@qq.com
 * @date 2021-10-26 10:54:02
 */
@Mapper
public interface PersonDao extends BaseMapper<PersonEntity> {
	
}
