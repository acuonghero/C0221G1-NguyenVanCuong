package com.codegym.model.repository;
import com.codegym.model.entity.Blog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog,Long> {
    @Query(value="select * from blog where category_id = ?1",nativeQuery=true)
    List<Blog> findBlogWithCategory(Long id);
}
