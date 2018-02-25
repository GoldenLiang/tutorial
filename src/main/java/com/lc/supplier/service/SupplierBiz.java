package com.lc.supplier.service;

import com.lc.entity.custom.ReviewedBookVo;

import java.util.List;

/**
 * Created by lc on 16-2-16.
 */
public interface SupplierBiz {
    public List<ReviewedBookVo> findAllReviewedBook();
}
