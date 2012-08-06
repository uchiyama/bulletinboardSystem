package jp.co.bulletinboard.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import jp.co.bulletinboard.entity.CommentNames._CommentNames;
import jp.co.bulletinboard.entity.UserNames._UserNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Contribution}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2012/08/06 12:59:30")
public class ContributionNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * subjectのプロパティ名を返します。
     * 
     * @return subjectのプロパティ名
     */
    public static PropertyName<String> subject() {
        return new PropertyName<String>("subject");
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
     * openDateのプロパティ名を返します。
     * 
     * @return openDateのプロパティ名
     */
    public static PropertyName<Timestamp> openDate() {
        return new PropertyName<Timestamp>("openDate");
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
     * userのプロパティ名を返します。
     * 
     * @return userのプロパティ名
     */
    public static _UserNames user() {
        return new _UserNames("user");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _ContributionNames extends PropertyName<Contribution> {

        /**
         * インスタンスを構築します。
         */
        public _ContributionNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _ContributionNames(final String name) {
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
        public _ContributionNames(final PropertyName<?> parent, final String name) {
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
         * subjectのプロパティ名を返します。
         *
         * @return subjectのプロパティ名
         */
        public PropertyName<String> subject() {
            return new PropertyName<String>(this, "subject");
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
         * openDateのプロパティ名を返します。
         *
         * @return openDateのプロパティ名
         */
        public PropertyName<Timestamp> openDate() {
            return new PropertyName<Timestamp>(this, "openDate");
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
         * userのプロパティ名を返します。
         * 
         * @return userのプロパティ名
         */
        public _UserNames user() {
            return new _UserNames(this, "user");
        }
    }
}