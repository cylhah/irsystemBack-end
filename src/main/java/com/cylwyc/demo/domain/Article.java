package com.cylwyc.demo.domain;

import java.util.Date;
import java.util.List;

public class Article {

    private Integer articleId;

    private String typeName;

    private String articleTitle;

    private String articleText;

    private String articlePicUrl;

    private Integer articleUpNumber;

    private Integer articleDownNumber;

    private Date articleTime;

    private Double articleScore;

    private Source source;

    private List<KeywordWeight> keywordWeights;

    private int upOrDown;

    private Date collectTime;

    private Date historyRecordTime;

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Date getHistoryRecordTime() {
        return historyRecordTime;
    }

    public void setHistoryRecordTime(Date historyRecordTime) {
        this.historyRecordTime = historyRecordTime;
    }

    public int getUpOrDown() {
        return upOrDown;
    }

    public void setUpOrDown(int upOrDown) {
        this.upOrDown = upOrDown;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }

    public String getArticlePicUrl() {
        return articlePicUrl;
    }

    public void setArticlePicUrl(String articlePicUrl) {
        this.articlePicUrl = articlePicUrl;
    }

    public Integer getArticleUpNumber() {
        return articleUpNumber;
    }

    public void setArticleUpNumber(Integer articleUpNumber) {
        this.articleUpNumber = articleUpNumber;
    }

    public Integer getArticleDownNumber() {
        return articleDownNumber;
    }

    public void setArticleDownNumber(Integer articleDownNumber) {
        this.articleDownNumber = articleDownNumber;
    }

    public Date getArticleTime() {
        return articleTime;
    }

    public void setArticleTime(Date articleTime) {
        this.articleTime = articleTime;
    }

    public Double getArticleScore() {
        return articleScore;
    }

    public void setArticleScore(Double articleScore) {
        this.articleScore = articleScore;
    }

    public List<KeywordWeight> getKeywordWeights() {
        return keywordWeights;
    }

    public void setKeywordWeights(List<KeywordWeight> keywordWeights) {
        this.keywordWeights = keywordWeights;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", typeName=" + typeName +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleText='" + articleText + '\'' +
                ", articlePicUrl='" + articlePicUrl + '\'' +
                ", articleUpNumber=" + articleUpNumber +
                ", articleDownNumber=" + articleDownNumber +
                ", articleTime=" + articleTime +
                ", articleScore=" + articleScore +
                ", source=" + source +
                ", keywordWeights=" + keywordWeights +
                ", upOrDown=" + upOrDown +
                ", collectTime=" + collectTime +
                ", historyRecordTime=" + historyRecordTime +
                '}';
    }
}
