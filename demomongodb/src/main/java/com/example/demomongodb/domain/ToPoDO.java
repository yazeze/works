package com.example.demomongodb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 〈一句话功能简述〉<br>
 * 〈TOPO〉
 *
 * @author zyz
 * @date 2019/5/2
 * @since 1.0.0
 */
@Document(collection = "topo")
public class ToPoDO {

    @Id
    private int id;


    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }


    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


}
