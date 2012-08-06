package jp.co.bulletinboard.dto;

import java.sql.Timestamp;

public class CommentDto {

	public Integer id;

    public Integer contributionId;

    public String body;

    public Timestamp entryDate;

    public String entryUser;
}
