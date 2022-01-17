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

import com.chinasofti.training.entity.SessionEntity;
import com.chinasofti.training.service.SessionService;



/**
 * 
 *
 * @author august
 * @email 379249906@qq.com
 * @date 2021-10-26 13:19:23
 */
@RestController
@RequestMapping("api")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    /**
     * 列表
     */
    @RequestMapping("/sessions")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sessionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
//    @RequestMapping("/info/{id}")
//    public R info(@PathVariable("id") String id){
//		SessionEntity session = sessionService.getById(id);
//
//        return R.ok().put("session", session);
//    }
//
//    /**
//     * 保存
//     */
    @RequestMapping("/session/save")
    public R save(@RequestBody SessionEntity session){
		sessionService.save(session);
        return R.ok();
    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    public R update(@RequestBody SessionEntity session){
//		sessionService.updateById(session);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    public R delete(@RequestBody String[] ids){
//		sessionService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }

}
