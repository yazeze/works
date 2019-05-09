package com.example.demomongodb.controller;

import com.example.demomongodb.domain.ToPoLayerDO;
import com.example.demomongodb.server.ToPoLayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈layercontroller〉
 *
 * @author zyz
 * @date 2019/5/3
 * @since 1.0.0
 */
@RestController
public class ToPoLayerController {

    @Autowired
    ToPoLayerService toPoLayerService;

    @RequestMapping(value = "/api/v1/toPoLayer", method = RequestMethod.GET)
    public List<ToPoLayerDO> getAll() {

        return toPoLayerService.findAll();
    }

    @RequestMapping(value = "/api/v1/toPoLayer/{id}", method = RequestMethod.GET)
    public List<ToPoLayerDO> getAll(@PathVariable("id") int id) {

        return toPoLayerService.findById(id);
    }

    @RequestMapping(value = "/api/v1/toPoLayer", method = RequestMethod.POST)
    public List<ToPoLayerDO> getSave(@RequestBody ToPoLayerDO po) {

        toPoLayerService.save(po);
        return toPoLayerService.findAll();
    }

    @RequestMapping(value = "/api/v1/toPoLayer", method = RequestMethod.DELETE)
    public List<ToPoLayerDO> deleteAll() {

        toPoLayerService.deleteAll();
        return toPoLayerService.findAll();
    }

    @RequestMapping(value = "/api/v1/toPoLayer/{id}", method = RequestMethod.DELETE)
    public List<ToPoLayerDO> deleteById(@PathVariable("id") int id) {

        toPoLayerService.deleteById(id);
        return toPoLayerService.findAll();
    }


}
