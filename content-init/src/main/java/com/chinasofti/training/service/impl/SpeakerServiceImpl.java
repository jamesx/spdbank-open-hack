package com.chinasofti.training.service.impl;

import com.chinasofti.training.utils.PageUtils;
import com.chinasofti.training.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.chinasofti.training.dao.SpeakerDao;
import com.chinasofti.training.entity.SpeakerEntity;
import com.chinasofti.training.service.SpeakerService;


@Service("speakerService")
public class SpeakerServiceImpl extends ServiceImpl<SpeakerDao, SpeakerEntity> implements SpeakerService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpeakerEntity> page = this.page(
                new Query<SpeakerEntity>().getPage(params),
                new QueryWrapper<SpeakerEntity>()
        );

        return new PageUtils(page);
    }

}