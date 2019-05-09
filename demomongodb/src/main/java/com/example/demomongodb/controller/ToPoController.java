package com.example.demomongodb.controller;

import com.example.demomongodb.domain.ToPoDO;
import com.example.demomongodb.log.MyLog;
import com.example.demomongodb.server.ToPoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈toPoController〉
 *
 * @author zyz
 * @date 2019/5/2
 * @since 1.0.0
 */
@RestController
public class ToPoController {

    @Resource
    ToPoService toPoService;

    @RequestMapping(value = "/")
    public String index() {

        return "index";
    }
    @MyLog(value = "查询所有")
    @RequestMapping(value = "/api/v1/toPo", method = RequestMethod.GET)
    public List<ToPoDO> getAll() {

        return toPoService.findAll();
    }
    @MyLog(value = "根据某个Id查询")
    @RequestMapping(value = "/api/v1/toPo/{id}", method = RequestMethod.GET)
    public List<ToPoDO> getAll(@PathVariable("id") int id) {

        return toPoService.findById(id);
    }
    @MyLog(value = "保存或者更新")
    @RequestMapping(value = "/api/v1/toPo", method = RequestMethod.POST)
    public List<ToPoDO> getSave(@RequestBody ToPoDO po) {

        toPoService.save(po);
        return toPoService.findAll();
    }
    @MyLog(value = "删除所有")
    @RequestMapping(value = "/api/v1/toPo", method = RequestMethod.DELETE)
    public List<ToPoDO> deleteAll() {

        toPoService.deleteAll();
        return toPoService.findAll();
    }
    @MyLog(value = "根据Id删除")
    @RequestMapping(value = "/api/v1/toPo/{id}", method = RequestMethod.DELETE)
    public List<ToPoDO> deleteById(@PathVariable("id") int id) {

        toPoService.deleteById(id);
        return toPoService.findAll();
    }
}
