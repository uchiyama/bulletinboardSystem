package jp.co.bulletinboard.entity;

import javax.annotation.Generated;
import jp.co.bulletinboard.entity.CommentNames._CommentNames;
import jp.co.bulletinboard.entity.ContributionNames._ContributionNames;
import jp.co.bulletinboard.entity.UserNames._UserNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2012/08/06 12:59:30")
public class Names {

    /**
     * {@link Comment}の名前クラスを返します。
     * 
     * @return Commentの名前クラス
     */
    public static _CommentNames comment() {
        return new _CommentNames();
    }

    /**
     * {@link Contribution}の名前クラスを返します。
     * 
     * @return Contributionの名前クラス
     */
    public static _ContributionNames contribution() {
        return new _ContributionNames();
    }

    /**
     * {@link User}の名前クラスを返します。
     * 
     * @return Userの名前クラス
     */
    public static _UserNames user() {
        return new _UserNames();
    }
}