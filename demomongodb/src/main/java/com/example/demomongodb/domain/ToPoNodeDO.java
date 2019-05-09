package com.example.demomongodb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 〈一句话功能简述〉<br>
 * 〈toponodedo〉
 *
 * @author zyz
 * @date 2019/5/3
 * @since 1.0.0
 */
@Document(collection="topo_node")
public class ToPoNodeDO {

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

    private String topoName;

    public String getTopoName() {

        return topoName;
    }

    public void setTopoName(String topoName) {

        this.topoName = topoName;
    }

    private String topoLayer;

    public String getTopoLayer() {

        return topoLayer;
    }

    public void setTopoLayer(String topoLayer) {

        this.topoLayer = topoLayer;
    }


}
