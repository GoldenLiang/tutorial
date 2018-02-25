package com.lc.college.dao;

import com.lc.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lc on 16-2-14.
 */
public interface BookDao {

    public void add(Book book);

    public void delete(@Param("bookTitle") String bookTitle, @Param("isbn") String isbn);

    public Book find(@Param("bookTitle") String bookTitle, @Param("isbn") String isbn);
}
