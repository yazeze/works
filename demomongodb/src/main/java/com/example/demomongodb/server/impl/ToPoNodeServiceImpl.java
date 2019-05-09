package com.example.demomongodb.server.impl;

import com.example.demomongodb.dao.ToPoNodeDAO;
import com.example.demomongodb.domain.ToPoNodeDO;
import com.example.demomongodb.server.ToPoNodeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈nodeimpl〉
 *
 * @author zyz
 * @date 2019/5/3
 * @since 1.0.0
 */

public class ToPoNodeServiceImpl implements ToPoNodeService {

    @Autowired
    ToPoNodeDAO toPoNodeDAO;

    @Override
    public List<ToPoNodeDO> findAll() {

        return toPoNodeDAO.findAll();
    }

    @Override
    public List<ToPoNodeDO> findById(int id) {

        return toPoNodeDAO.findById(id);
    }

    @Override
    public void save(ToPoNodeDO po) {

        toPoNodeDAO.save(po);
    }


    @Override
    public void deleteAll() {

        toPoNodeDAO.deleteAll();

    }

    @Override
    public void deleteById(int id) {

        toPoNodeDAO.deleteById(id);
    }


}
