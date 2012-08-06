package jp.co.bulletinboard.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Commentエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/08/06 12:58:45")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    /** contributionIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer contributionId;

    /** bodyプロパティ */
    @Column(length = 65535, nullable = false, unique = false)
    public String body;

    /** entryDateプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp entryDate;

    /** entryUserプロパティ */
    @Column(length = 20, nullable = false, unique = false)
    public String entryUser;

    /** user関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "entry_user", referencedColumnName = "id")
    public User user;

    /** contribution関連プロパティ */
    @ManyToOne
    public Contribution contribution;
}