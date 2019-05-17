package cn.edu.nenu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T-ROUTE")
public class Route {
    //id
    @Column(name = "id")
    private Integer id;
    //路径
    @Column(name = "route")
    private String route;
    //路径描述
    @Column(name = "routeDescribe")
    private String routeDescribe;
    //存储类型
    @Column(name = "storageType")
    private String  storageType;

    //get和set方法


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getRouteDescribe() {
        return routeDescribe;
    }

    public void setRouteDescribe(String routeDescribe) {
        this.routeDescribe = routeDescribe;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    //toString方法

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", route='" + route + '\'' +
                ", routeDescribe='" + routeDescribe + '\'' +
                ", storageType='" + storageType + '\'' +
                '}';
    }
}
