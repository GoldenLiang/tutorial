package com.lc.entity.custom;

import com.lc.entity.Book;

/**
 * Created by lc on 16-2-15.
 */
public class BookInfo extends Book {
    String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
