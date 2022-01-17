package com.chinasofti.training.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chinasofti.training.entity.SessionEntity;
import com.chinasofti.training.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author august
 * @email 379249906@qq.com
 * @date 2021-10-26 13:19:23
 */
public interface SessionService extends IService<SessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

