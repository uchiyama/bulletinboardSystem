package jp.co.bulletinboard.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import jp.co.bulletinboard.entity.ContributionNames._ContributionNames;
import jp.co.bulletinboard.entity.UserNames._UserNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Comment}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/08/06 12:59:30")
public class CommentNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * contributionIdのプロパティ名を返します。
     * 
     * @return contributionIdのプロパティ名
     */
    public static PropertyName<Integer> contributionId() {
        return new PropertyName<Integer>("contributionId");
    }

    /**
     * bodyのプロパティ名を返します。
     * 
     * @return bodyのプロパティ名
     */
    public static PropertyName<String> body() {
        return new PropertyName<String>("body");
    }

    /**
     * entryDateのプロパティ名を返します。
     * 
     * @return entryDateのプロパティ名
     */
    public static PropertyName<Timestamp> entryDate() {
        return new PropertyName<Timestamp>("entryDate");
    }

    /**
     * entryUserのプロパティ名を返します。
     * 
     * @return entryUserのプロパティ名
     */
    public static PropertyName<String> entryUser() {
        return new PropertyName<String>("entryUser");
    }

    /**
     * userのプロパティ名を返します。
     * 
     * @return userのプロパティ名
     */
    public static _UserNames user() {
        return new _UserNames("user");
    }

    /**
     * contributionのプロパティ名を返します。
     * 
     * @return contributionのプロパティ名
     */
    public static _ContributionNames contribution() {
        return new _ContributionNames("contribution");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _CommentNames extends PropertyName<Comment> {

        /**
         * インスタンスを構築します。
         */
        public _CommentNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CommentNames(final String name) {
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
        public _CommentNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * contributionIdのプロパティ名を返します。
         *
         * @return contributionIdのプロパティ名
         */
        public PropertyName<Integer> contributionId() {
            return new PropertyName<Integer>(this, "contributionId");
        }

        /**
         * bodyのプロパティ名を返します。
         *
         * @return bodyのプロパティ名
         */
        public PropertyName<String> body() {
            return new PropertyName<String>(this, "body");
        }

        /**
         * entryDateのプロパティ名を返します。
         *
         * @return entryDateのプロパティ名
         */
        public PropertyName<Timestamp> entryDate() {
            return new PropertyName<Timestamp>(this, "entryDate");
        }

        /**
         * entryUserのプロパティ名を返します。
         *
         * @return entryUserのプロパティ名
         */
        public PropertyName<String> entryUser() {
            return new PropertyName<String>(this, "entryUser");
        }

        /**
         * userのプロパティ名を返します。
         * 
         * @return userのプロパティ名
         */
        public _UserNames user() {
            return new _UserNames(this, "user");
        }

        /**
         * contributionのプロパティ名を返します。
         * 
         * @return contributionのプロパティ名
         */
        public _ContributionNames contribution() {
            return new _ContributionNames(this, "contribution");
        }
    }
}