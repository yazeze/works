package com.example.demomongodb.server.impl;

import com.example.demomongodb.dao.ToPoDAO;
import com.example.demomongodb.domain.ToPoDO;
import com.example.demomongodb.server.ToPoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈impltopo〉
 *
 * @author zyz
 * @date 2019/5/2
 * @since 1.0.0
 */
@Service
public class ToPoServiceImpl implements ToPoService {

    @Autowired
    private ToPoDAO toPoDAO;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<ToPoDO> findAll() {

        return toPoDAO.findAll();
    }

    @Override
    public List<ToPoDO> findById(int id) {

        return toPoDAO.findById(id);
    }

    @Override
    public void save(ToPoDO po) {

        toPoDAO.save(po);
    }

    @Override
    public void deleteAll() {

        toPoDAO.deleteAll();
    }

    @Override
    public void deleteById(int id) {

        Query q = new Query(new Criteria("id").is(id));
        mongoTemplate.remove(q, ToPoDO.class);
    }


}
