package com.example.demomongodb.server;

import com.example.demomongodb.domain.ToPoDO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈toposervice〉
 *
 * @author zyz
 * @date 2019/5/2
 * @since 1.0.0
 */
@Service
public interface ToPoService {

    /**
     * 查找所有
     *
     * @return 返回所有的值
     */

    List<ToPoDO> findAll();

    /**
     * 通过ID查找
     *
     * @param id id值
     * @return 返回所查找id的值
     */

    List<ToPoDO> findById(int id);

    /**
     * 增加
     *
     * @param po 需要增加的对象
     */

    void save(ToPoDO po);

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
