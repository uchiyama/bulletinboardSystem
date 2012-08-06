package jp.co.bulletinboard.service;

import java.util.List;
import javax.annotation.Generated;
import jp.co.bulletinboard.entity.User;

import static jp.co.bulletinboard.entity.UserNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link User}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/08/06 12:59:20")
public class UserService extends AbstractService<User> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param id
     *            識別子
     * @return エンティティ
     */
    public User findById(String id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<User> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public int userUpdate(User user, String targetId) {
        return jdbcManager.updateBySql(
        		"update user set id = ?, store_name = ? where id = ?",
        		String.class, String.class, String.class)
        		.params(user.id, user.storeName, targetId).execute();
    }
}