package thinhluffy.com.ex25.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import thinhluffy.com.ex25.model.Post;

public interface PostRepository extends PagingAndSortingRepository<Post, Integer> {
    Page<Post>findAllByName(String name, Pageable pageable);
    Iterable<Post> findAllByName(String name, Sort sort);

    Page<Post> findAllByCategoryName(String name, Pageable pageable);
    Iterable<Post> findAllByCategoryName(String name, Sort sort);
}
