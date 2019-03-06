package thinhluffy.com.ex25.service;


import thinhluffy.com.ex25.model.Category;

public interface CategoryService {

    Iterable<Category> findAll();

    Category findById(int id);

    void save(Category category);

    void remove (int id);
}
