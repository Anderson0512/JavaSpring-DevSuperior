package com.devsuperior.home.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;

public class Pageable implements Serializable {
    @Serial
    private static final long serialVersionUID = -753749465559432781L;
    @JsonProperty("_limit")
    private Integer limit;
    @JsonProperty("_offset")
    private Integer offset;
    @JsonProperty("_pageNumber")
    private Integer pageNumber;
    @JsonProperty("_pageElements")
    private Integer pageElements;
    @JsonProperty("_totalPages")
    private Integer totalPages;
    @JsonProperty("_totalElements")
    private Integer totalElements;

    public Pageable(String valor) {
        this.initializeAttributes();
    }

    public void initializeAttributes() {
        this.limit = 50;
        this.offset = 0;
        this.pageNumber = 0;
        this.pageElements = 0;
        this.totalPages = 1;
        this.totalElements = 0;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public Integer getPageElements() {
        return this.pageElements;
    }

    public Integer getTotalPages() {
        return this.totalPages;
    }

    public Integer getTotalElements() {
        return this.totalElements;
    }

    @JsonProperty("_limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @JsonProperty("_offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonProperty("_pageNumber")
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    @JsonProperty("_pageElements")
    public void setPageElements(Integer pageElements) {
        this.pageElements = pageElements;
    }

    @JsonProperty("_totalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    @JsonProperty("_totalElements")
    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }
}

