package com.example.demomongodb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 〈一句话功能简述〉<br>
 * 〈topolayerdo〉
 *
 * @author zyz
 * @date 2019/5/3
 * @since 1.0.0
 */
@Document(collection = "topo_layer")
public class ToPoLayerDO {

    @Id
    private int id;


    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    private String topoName;

    //PracticeToPoPO practiceToPoPO;

    public String getTopoName() {

        return topoName;
    }

    public void setTopoName(String topoName) {

        this.topoName = topoName;
    }

    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    @Override
    public String toString() {

        return "ToPoLayerDO{" +
                "id=" + id +
                ", topoName='" + topoName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
