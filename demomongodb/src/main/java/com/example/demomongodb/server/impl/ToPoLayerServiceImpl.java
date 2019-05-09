package com.example.demomongodb.server.impl;

import com.example.demomongodb.dao.ToPoLayerDAO;
import com.example.demomongodb.domain.ToPoLayerDO;
import com.example.demomongodb.server.ToPoLayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈layerimpl〉
 *
 * @author zyz
 * @date 2019/5/3
 * @since 1.0.0
 */
@Service
public class ToPoLayerServiceImpl implements ToPoLayerService {

    @Autowired
    ToPoLayerDAO toPoLayerDAO;

    @Override
    public List<ToPoLayerDO> findAll() {

        return toPoLayerDAO.findAll();
    }

    @Override
    public List<ToPoLayerDO> findById(int id) {

        return toPoLayerDAO.findById(id);
    }


    @Override
    public void save(ToPoLayerDO po) {

        toPoLayerDAO.save(po);
    }

    @Override
    public void deleteAll() {

        toPoLayerDAO.deleteAll();

    }

    @Override
    public void deleteById(int id) {

        toPoLayerDAO.deleteById(id);
    }


}
