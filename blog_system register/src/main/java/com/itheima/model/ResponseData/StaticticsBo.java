package com.itheima.model.ResponseData;

/**
 * 全站服务统计类
 */
/**
 * @author 梁松涛
 * @version 1.0
 **/
public class StaticticsBo {
    private Integer articles;
    private Integer comments;

    public Integer getArticles() {
        return articles;
    }

    public void setArticles(Integer articles) {
        this.articles = articles;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "StaticticsBo{" +
                "articles=" + articles +
                ", comments=" + comments +
                '}';
    }
}
