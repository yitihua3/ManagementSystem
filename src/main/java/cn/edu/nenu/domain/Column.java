package cn.edu.nenu.domain;

import cn.edu.nenu.config.orm.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T-COLUMN")
public class Column extends IdEntity {

    @javax.persistence.Column(name = "id")
    private Integer id;

    @javax.persistence.Column(name = "name")
    private String name;

    @javax.persistence.Column(name = "sort")
    private String sort;

    @javax.persistence.Column(name = "state")
    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Column{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
