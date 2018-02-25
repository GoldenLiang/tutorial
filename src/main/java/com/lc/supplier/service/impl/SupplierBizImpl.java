package com.lc.supplier.service.impl;

import com.lc.college.dao.OrderBookDao;
import com.lc.college.dao.TakesDao;
import com.lc.entity.custom.OrderBookReviewVo;
import com.lc.entity.custom.OrderBookVo;
import com.lc.entity.custom.ReviewedBookVo;
import com.lc.supplier.service.SupplierBiz;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lc on 16-2-16.
 */
@Service
public class SupplierBizImpl implements SupplierBiz {

    @Resource
    private OrderBookDao orderBookDao;


    //TODO 这个代码偷懒了！！！！！要多烂有多烂直接拷贝的。。
    public List<ReviewedBookVo> findAllReviewedBook() {
        List<ReviewedBookVo> reviewedBookVoList = orderBookDao.findAllReviewedBook();
        return reviewedBookVoList;
    }

}
