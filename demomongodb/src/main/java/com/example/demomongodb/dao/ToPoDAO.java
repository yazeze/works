package com.example.demomongodb.dao;

import com.example.demomongodb.domain.ToPoDO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈topodao〉
 *
 * @author zyz
 * @date 2019/5/2
 * @since 1.0.0
 */

public interface ToPoDAO extends MongoRepository<ToPoDO, Integer> {

    /**
     * 通过id查找
     *
     * @param id id值
     * @return 返回
     */

    List<ToPoDO> findById(int id);

}
