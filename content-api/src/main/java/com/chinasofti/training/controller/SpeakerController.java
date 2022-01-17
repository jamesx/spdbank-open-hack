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

import com.chinasofti.training.entity.SpeakerEntity;
import com.chinasofti.training.service.SpeakerService;



/**
 * 
 *
 * @author august
 * @email 379249906@qq.com
 * @date 2021-10-26 13:19:23
 */
@RestController
@RequestMapping("api")
public class SpeakerController {
    @Autowired
    private SpeakerService speakerService;

    /**
     * 列表
     */
    @RequestMapping("/speakers")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = speakerService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
//    @RequestMapping("/info/{id}")
//    public R info(@PathVariable("id") String id){
//		SpeakerEntity speaker = speakerService.getById(id);
//
//        return R.ok().put("speaker", speaker);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    public R save(@RequestBody SpeakerEntity speaker){
//		speakerService.save(speaker);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    public R update(@RequestBody SpeakerEntity speaker){
//		speakerService.updateById(speaker);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    public R delete(@RequestBody String[] ids){
//		speakerService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }

}
