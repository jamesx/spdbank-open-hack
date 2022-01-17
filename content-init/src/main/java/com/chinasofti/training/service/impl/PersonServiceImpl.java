package com.chinasofti.training.service.impl;

import com.chinasofti.training.utils.PageUtils;
import com.chinasofti.training.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.chinasofti.training.dao.PersonDao;
import com.chinasofti.training.entity.PersonEntity;
import com.chinasofti.training.service.PersonService;


@Service("personService")
public class PersonServiceImpl extends ServiceImpl<PersonDao, PersonEntity> implements PersonService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PersonEntity> page = this.page(
                new Query<PersonEntity>().getPage(params),
                new QueryWrapper<PersonEntity>()
        );

        return new PageUtils(page);
    }

}