package com.chinasofti.training.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chinasofti.training.entity.PersonEntity;
import com.chinasofti.training.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author august
 * @email 379249906@qq.com
 * @date 2021-10-26 10:54:02
 */
public interface PersonService extends IService<PersonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

