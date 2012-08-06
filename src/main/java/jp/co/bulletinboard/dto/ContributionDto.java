package jp.co.bulletinboard.dto;

import java.sql.Timestamp;
import java.util.List;

import jp.co.bulletinboard.entity.Comment;

public class ContributionDto {

    public Integer id;

    public String subject;

    public String body;

    public Timestamp entryDate;

    public String entryUser;

    public Timestamp openDate;

    public List<Comment> commentList;

}
