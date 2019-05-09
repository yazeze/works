package com.example.demomongodb.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈log〉
 *
 * @author zyz
 * @date 2019/5/9
 * @since 1.0.0
 */
@Document(collection = "syslog")
public class SysLog implements Serializable {

//    private int id;

    private String username;

    private String operation;

    private String method;

    private String params;

    private String ip;

    private Date createDate;

    private List result;

    public List getResult() {

        return result;
    }

    public void setResult(List result) {

        this.result = result;
    }
//    public int getId() {
//
//        return id;
//    }
//
//    public void setId(int id) {
//
//        this.id = id;
//    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getOperation() {

        return operation;
    }

    public void setOperation(String operation) {

        this.operation = operation;
    }

    public String getMethod() {

        return method;
    }

    public void setMethod(String method) {

        this.method = method;
    }

    public String getParams() {

        return params;
    }

    public void setParams(String params) {

        this.params = params;
    }

    public String getIp() {

        return ip;
    }

    public void setIp(String ip) {

        this.ip = ip;
    }

    public Date getCreateDate() {

        return createDate;
    }

    public void setCreateDate(Date createDate) {

        this.createDate = createDate;
    }

}
