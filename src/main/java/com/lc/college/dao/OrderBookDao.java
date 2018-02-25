package com.lc.college.dao;

import com.lc.entity.OrderBook;
import com.lc.entity.custom.AddedBookVo;
import com.lc.entity.custom.ChangedItems;
import com.lc.entity.custom.OrderBookReviewVo;
import com.lc.entity.custom.ReviewedBookVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lc on 16-2-13.
 */
public interface OrderBookDao {
    public void add(OrderBook orderBook);

    public List<AddedBookVo> findAddedBookInfoList(String staffId);

    public int usedByOtherSec(@Param("bookTitle") String bookTitle, @Param("isbn") String isbn, @Param("secId") int secId);

    public void delete(@Param("secId") int secId, @Param("bookTitle") String bookTitle, @Param("isbn") String isbn);

    public List<OrderBookReviewVo> findAllNotReviewedBook();

    public void audit(@Param("secId") int secId, @Param("bookTitle") String bookTitle, @Param("isbn") String isbn);

    public List<ReviewedBookVo> findAllReviewedBook();
}
