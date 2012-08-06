package jp.co.bulletinboard.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Contributionエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2012/08/06 12:58:46")
public class Contribution implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    /** subjectプロパティ */
    @Column(length = 50, nullable = false, unique = false)
    public String subject;

    /** bodyプロパティ */
    @Column(length = 65535, nullable = false, unique = false)
    public String body;

    /** entryDateプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp entryDate;

    /** entryUserプロパティ */
    @Column(length = 20, nullable = false, unique = false)
    public String entryUser;

    /** openDateプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp openDate;

    /** commentList関連プロパティ */
    @OneToMany(mappedBy = "contribution")
    public List<Comment> commentList;

    /** user関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "entry_user", referencedColumnName = "id")
    public User user;
}