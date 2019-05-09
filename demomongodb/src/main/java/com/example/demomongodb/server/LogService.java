package com.example.demomongodb.server;

import com.example.demomongodb.domain.SysLog;
import com.example.demomongodb.domain.ToPoDO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * demo
 *
 * @author zyz
 * @date 2019/5/920:24
 */

@Service
public interface LogService {

    /**
     * 查找所有
     *
     * @return 返回所有的值
     */

    List<SysLog> findAll();


    /**
     * 增加
     *
     * @param po 需要增加的对象
     */

    void save(SysLog po);

    /**
     * 删除所有
     */


}
