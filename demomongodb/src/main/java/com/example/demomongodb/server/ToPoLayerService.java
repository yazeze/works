package com.example.demomongodb.server;

import com.example.demomongodb.domain.ToPoLayerDO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * demo
 *
 * @author zyz
 * @date 2019/5/30:03
 */
@Service
public interface ToPoLayerService {
    /**
     * 查找所有
     *
     * @return 返回所有的值
     */

    List<ToPoLayerDO> findAll();

    /**
     * 通过ID查找
     *
     * @param id id值
     * @return 返回所查找id的值
     */

    List<ToPoLayerDO> findById(int id);

    /**
     * 增加
     *
     * @param po 需要增加的对象
     */


    void save(ToPoLayerDO po);

    /**
     * 删除所有
     */

    void deleteAll();

    /**
     * 通过id进行删除
     *
     * @param id id值
     */

    void deleteById(int id);

}
