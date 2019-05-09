package com.example.demomongodb.controller;

import com.example.demomongodb.domain.ToPoNodeDO;
import com.example.demomongodb.server.ToPoNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈nodecontroller〉
 *
 * @author zyz
 * @date 2019/5/3
 * @since 1.0.0
 */

public class ToPoNodeController {

    @Autowired
    ToPoNodeService toPoNodeService;

    @RequestMapping(value = "/api/v1/toPoNode", method = RequestMethod.GET)
    public List<ToPoNodeDO> getAll() {

        return toPoNodeService.findAll();
    }

    @RequestMapping(value = "/api/v1/toPoNode/{id}", method = RequestMethod.GET)
    public List<ToPoNodeDO> getAll(@PathVariable("id") int id) {

        return toPoNodeService.findById(id);
    }

    @RequestMapping(value = "/api/v1/toPoNode", method = RequestMethod.POST)
    public List<ToPoNodeDO> getSave(@RequestBody ToPoNodeDO po) {

        toPoNodeService.save(po);
        return toPoNodeService.findAll();
    }

    @RequestMapping(value = "/api/v1/toPoNode", method = RequestMethod.DELETE)
    public List<ToPoNodeDO> deleteAll() {

        toPoNodeService.deleteAll();
        return toPoNodeService.findAll();
    }

    @RequestMapping(value = "/api/v1/toPoNode/{id}", method = RequestMethod.DELETE)
    public List<ToPoNodeDO> deleteById(@PathVariable("id") int id) {

        toPoNodeService.deleteById(id);
        return toPoNodeService.findAll();
    }


}
