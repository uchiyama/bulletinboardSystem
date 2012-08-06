package jp.co.bulletinboard.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import jp.co.bulletinboard.entity.Contribution;

import static jp.co.bulletinboard.entity.ContributionNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Contribution}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2012/08/06 12:59:20")
public class ContributionService extends AbstractService<Contribution> {

	private static final String DATE_PATTERN = "yyyy.MM.dd HH:mm";

    /**
     * 識別子でエンティティを検索します。
     *
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Contribution findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<Contribution> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<Contribution> findAllContributionAndComment() {
    	SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
    	String date = sdf.format(new Date());
    	System.out.println(date);
        return select().leftOuterJoin("commentList").
        		where("DATE_FORMAT(open_date,'%Y-%m-%d %h:%m') <= DATE_FORMAT(now(),'%Y-%m-%d %h:%m')").
        		orderBy(asc(id())).getResultList();
    }
}