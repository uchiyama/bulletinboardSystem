package jp.co.bulletinboard.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

/**
 * ユーザー情報保持クラス
 *
 * @author uchiyama_takayuki
 *
 */
@Component(instance=InstanceType.SESSION)
public class UserDto implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/** ID */
	public String id;

	/** ユーザーID */
	public String userId;

	/** パスワード */
	public String password;

	/** 店舗名 */
	public String storeName;

}
