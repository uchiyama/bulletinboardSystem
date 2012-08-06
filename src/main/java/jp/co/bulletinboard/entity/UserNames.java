package jp.co.bulletinboard.entity;

import javax.annotation.Generated;
import jp.co.bulletinboard.entity.CommentNames._CommentNames;
import jp.co.bulletinboard.entity.ContributionNames._ContributionNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link User}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/08/06 12:59:30")
public class UserNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<String> id() {
        return new PropertyName<String>("id");
    }

    /**
     * passwordのプロパティ名を返します。
     * 
     * @return passwordのプロパティ名
     */
    public static PropertyName<String> password() {
        return new PropertyName<String>("password");
    }

    /**
     * storeNameのプロパティ名を返します。
     * 
     * @return storeNameのプロパティ名
     */
    public static PropertyName<String> storeName() {
        return new PropertyName<String>("storeName");
    }

    /**
     * commentListのプロパティ名を返します。
     * 
     * @return commentListのプロパティ名
     */
    public static _CommentNames commentList() {
        return new _CommentNames("commentList");
    }

    /**
     * contributionListのプロパティ名を返します。
     * 
     * @return contributionListのプロパティ名
     */
    public static _ContributionNames contributionList() {
        return new _ContributionNames("contributionList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _UserNames extends PropertyName<User> {

        /**
         * インスタンスを構築します。
         */
        public _UserNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _UserNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _UserNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<String> id() {
            return new PropertyName<String>(this, "id");
        }

        /**
         * passwordのプロパティ名を返します。
         *
         * @return passwordのプロパティ名
         */
        public PropertyName<String> password() {
            return new PropertyName<String>(this, "password");
        }

        /**
         * storeNameのプロパティ名を返します。
         *
         * @return storeNameのプロパティ名
         */
        public PropertyName<String> storeName() {
            return new PropertyName<String>(this, "storeName");
        }

        /**
         * commentListのプロパティ名を返します。
         * 
         * @return commentListのプロパティ名
         */
        public _CommentNames commentList() {
            return new _CommentNames(this, "commentList");
        }

        /**
         * contributionListのプロパティ名を返します。
         * 
         * @return contributionListのプロパティ名
         */
        public _ContributionNames contributionList() {
            return new _ContributionNames(this, "contributionList");
        }
    }
}