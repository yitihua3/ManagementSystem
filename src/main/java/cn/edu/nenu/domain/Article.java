package cn.edu.nenu.domain;

import cn.edu.nenu.config.orm.IdEntity;
import cn.edu.nenu.util.Constants;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T-ARTICLE")
public class Article  extends IdEntity {

    @Column(name = "type")
    private String type;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "sort")
    private float sort;

    @Column(name = "status")
    private Constants.Status status = Constants.Status.DISABLE;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSort() {
        return sort;
    }

    public void setSort(float sort) {
        this.sort = sort;
    }

    public Constants.Status getStatus() {
        return status;
    }

    public void setStatus(Constants.Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Article{" +
                "type='" + type + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                ", status=" + status +
                ", id=" + id +
                '}';
    }
}
