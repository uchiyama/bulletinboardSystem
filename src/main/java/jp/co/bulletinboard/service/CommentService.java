package jp.co.bulletinboard.service;

import java.util.List;
import javax.annotation.Generated;
import jp.co.bulletinboard.entity.Comment;

import static jp.co.bulletinboard.entity.CommentNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Comment}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/08/06 12:59:20")
public class CommentService extends AbstractService<Comment> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Comment findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Comment> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}