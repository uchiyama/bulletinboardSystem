package jp.co.bulletinboard.entity;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Userエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/08/06 12:58:46")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @Column(length = 20, nullable = false, unique = true)
    public String id;

    /** passwordプロパティ */
    @Column(length = 40, nullable = false, unique = false)
    public String password;

    /** storeNameプロパティ */
    @Column(length = 20, nullable = false, unique = false)
    public String storeName;

    /** commentList関連プロパティ */
    @OneToMany(mappedBy = "user")
    public List<Comment> commentList;

    /** contributionList関連プロパティ */
    @OneToMany(mappedBy = "user")
    public List<Contribution> contributionList;
}