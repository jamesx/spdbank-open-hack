package com.chinasofti.training.controller;

import java.util.Arrays;
import java.util.Map;

import com.chinasofti.training.utils.PageUtils;
import com.chinasofti.training.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.training.entity.PersonEntity;
import com.chinasofti.training.service.PersonService;



/**
 * 
 *
 * @author august
 * @email 379249906@qq.com
 * @date 2021-10-26 10:54:02
 */
@RestController
@RequestMapping("training/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = personService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		PersonEntity person = personService.getById(id);

        return R.ok().put("person", person);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PersonEntity person){
		personService.save(person);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PersonEntity person){
		personService.updateById(person);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		personService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
