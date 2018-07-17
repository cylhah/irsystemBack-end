package com.cylwyc.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Source {

    private Integer sourceId;

    private String sourceName;

    private String sourceType;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Source{" +
                "sourceId=" + sourceId +
                ", sourceName='" + sourceName + '\'' +
                ", sourceType='" + sourceType + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
