package com.example.demomongodb.dao;

import com.example.demomongodb.domain.SysLog;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 〈一句话功能简述〉<br>
 * 〈logdao〉
 *
 * @author zyz
 * @date 2019/5/9
 * @since 1.0.0
 */

public interface LogDAO extends MongoRepository<SysLog, Integer> {


}
