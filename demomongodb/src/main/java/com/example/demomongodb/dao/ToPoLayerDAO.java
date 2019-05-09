package com.example.demomongodb.dao;

import com.example.demomongodb.domain.ToPoLayerDO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈topolayerDAO〉
 *
 * @author zyz
 * @date 2019/5/3
 * @since 1.0.0
 */

public interface ToPoLayerDAO extends MongoRepository<ToPoLayerDO, Integer> {
    /**
     * 通过id查找
     *
     * @param id id值
     * @return 返回
     */

    List<ToPoLayerDO> findById(int id);


}
