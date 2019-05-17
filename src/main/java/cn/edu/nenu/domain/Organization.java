package cn.edu.nenu.domain;

import cn.edu.nenu.config.orm.IdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T-ORGANIZATION")
public class Organization extends IdEntity {
    //id
    @Column(name = "id")
    private Integer  id;
   //名称
   @Column(name = "name")
    private String name;
   //别名
   @Column(name = "othername")
    private String othername;
   //编码
   @Column(name = "code")
    private String code;
   //排序
   @Column(name = "sort")
    private String sort;
    //状态
    @Column(name = "statue")
    private String statue;
    //上级id
    @Column(name = "topid")
    private Integer  topid;

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

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public Integer getTopid() {
        return topid;
    }

    public void setTopid(Integer topid) {
        this.topid = topid;
    }


    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", othername='" + othername + '\'' +
                ", code='" + code + '\'' +
                ", sort='" + sort + '\'' +
                ", statue='" + statue + '\'' +
                ", topid=" + topid +
                '}';
    }
}
