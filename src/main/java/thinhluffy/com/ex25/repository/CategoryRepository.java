package thinhluffy.com.ex25.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import thinhluffy.com.ex25.model.Category;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer> {
}
