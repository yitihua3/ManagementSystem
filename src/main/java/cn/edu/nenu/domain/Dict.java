package cn.edu.nenu.domain;

import cn.edu.nenu.config.orm.IdEntity;
import cn.edu.nenu.util.Constants;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T-DICT")
public class Dict extends IdEntity {

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
//    //id
//    private Integer  id;
//    //字典名称
//    private  String name;
//    //属性名称
//    private String attrName;
//    //属性编码
//    private String attrCode;
//    //属性排序
//    private String attrSort;
//    //属性状态
//    private String attrState;
//   //get 和 set方法
//
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAttrName() {
//        return attrName;
//    }
//
//    public void setAttrName(String attrName) {
//        this.attrName = attrName;
//    }
//
//    public String getAttrCode() {
//        return attrCode;
//    }
//
//    public void setAttrCode(String attrCode) {
//        this.attrCode = attrCode;
//    }
//
//    public String getAttrSort() {
//        return attrSort;
//    }
//
//    public void setAttrSort(String attrSort) {
//        this.attrSort = attrSort;
//    }
//
//    public String getAttrState() {
//        return attrState;
//    }
//
//    public void setAttrState(String attrState) {
//        this.attrState = attrState;
//    }
//
//    //toString方法
//
//    @Override
//    public String toString() {
//        return "Dict{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", attrName='" + attrName + '\'' +
//                ", attrCode='" + attrCode + '\'' +
//                ", attrSort='" + attrSort + '\'' +
//                ", attrState='" + attrState + '\'' +
//                '}';
//    }
}
