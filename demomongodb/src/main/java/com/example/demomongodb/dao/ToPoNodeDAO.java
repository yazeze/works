package com.example.demomongodb.dao;

import com.example.demomongodb.domain.ToPoNodeDO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * demo
 *
 * @author zyz
 * @date 2019/5/30:13
 */
public interface ToPoNodeDAO extends MongoRepository<ToPoNodeDO, Integer> {
    /**
     * 通过id查找
     *
     * @param id id值
     * @return 返回
     */

    List<ToPoNodeDO> findById(int id);

}
