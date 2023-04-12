package com.xujie.utils;

/**
 * @Description 查询业务实体
 * 这里仅仅定义了三个参数，在实际应用中可以定义多个参数
 */
public class QueryDTO {
    private Integer pageNo;    //页码
    private Integer pageSize;  //页面大小
    private String keyword;    //关键字

    public QueryDTO() {
    }

    public QueryDTO(Integer pageNo, Integer pageSize, String keyword) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.keyword = keyword;
    }

    /**
     * 获取
     *
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     * 设置
     *
     * @param pageNo
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    /**
     * 获取
     *
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获取
     *
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * 设置
     *
     * @param keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "QueryDTO{pageNo = " + pageNo + ", pageSize = " + pageSize + ", keyword = " + keyword + "}";
    }
    //省略getter、setter

}