package com.lc.college.service;

import com.lc.entity.Section;
import com.lc.entity.custom.AddedBookVo;
import com.lc.entity.custom.ChangedItems;
import com.lc.entity.custom.OrderBookReviewVo;
import com.lc.entity.custom.OrderBookVo;

import java.util.List;

/**
 * Created by lc on 16-2-13.
 */
public interface OrderBookBiz {
    public List<Section> findSelectedSection(String staffId, String year);

    public void add(OrderBookVo orderBookVo);

    public List<AddedBookVo> findAddedBookInfoList(String staffId);

    public void update(ChangedItems changedItems, String staffId);

    public void audit(List<OrderBookReviewVo> orderBookReviewVoList);

    public List<OrderBookReviewVo> findAllNotReviewedBook();
}
