package com.chinasofti.training.service.impl;

import com.chinasofti.training.utils.PageUtils;
import com.chinasofti.training.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.chinasofti.training.dao.SessionDao;
import com.chinasofti.training.entity.SessionEntity;
import com.chinasofti.training.service.SessionService;


@Service("sessionService")
public class SessionServiceImpl extends ServiceImpl<SessionDao, SessionEntity> implements SessionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SessionEntity> page = this.page(
                new Query<SessionEntity>().getPage(params),
                new QueryWrapper<SessionEntity>()
        );

        return new PageUtils(page);
    }

}