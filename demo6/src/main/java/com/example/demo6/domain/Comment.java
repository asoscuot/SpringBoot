package com.example.demo6.domain;

import javax.persistence.*;

/**
 * @author 梁松涛
 * @version 1.0
 **/
@Entity(name = "t_comment") //设置ORM实体类，并且指定映射的表名
public class Comment {
    @Id//表明映射对应的主键id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //设置主键自增策略
    private Integer id;
    private String content;
    private String author;
    @Column(name = "a_id") //指定映射的表字段名
    private Integer aId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", aId=" + aId +
                '}';
    }
}
