package com.example.demomongodb.server.impl;

import com.example.demomongodb.dao.LogDAO;
import com.example.demomongodb.domain.SysLog;
import com.example.demomongodb.server.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈logservieceimpl〉
 *
 * @author zyz
 * @date 2019/5/9
 * @since 1.0.0
 */
@Service
public class LogServiceImpl implements  LogService {


    @Autowired
    LogDAO logDAO;
    @Override
    public List<SysLog> findAll() {

        return logDAO.findAll();
    }

    @Override
    public void save(SysLog po) {
        logDAO.save(po);

    }

}
