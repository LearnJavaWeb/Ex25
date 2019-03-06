package thinhluffy.com.ex25.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import thinhluffy.com.ex25.model.Post;

public interface PostService {
    Iterable<Post> findAll();

    Post findById(int id);

    void remove(int id);

    void save(Post post);

    Iterable<Post> findAll(Sort sort);

    Page<Post> findAll(Pageable pageable);

    Page<Post> findAllByName(String name, Pageable pageable);

    Iterable<Post> findAllByName(String name, Sort sort);

    Page<Post> findAllByCategoryName(String name, Pageable pageable);

    Iterable<Post> findAllByCategoryName(String name, Sort sort);

    Page<Post> convert(Iterable<Post> myPosts, Pageable pageable);
}
