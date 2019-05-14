package com.mainurrahman.mainurrahman.service.impl

import com.mainurrahman.mainurrahman.entity.Category
import com.mainurrahman.mainurrahman.repository.CategoryRepository
import com.mainurrahman.mainurrahman.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryServiceImpl implements CategoryService {
    @Autowired
    private final CategoryRepository categoryRepository

    @Override
    List<Category> findAll() {
        categoryRepository.findAll()
    }

    @Override
    Category findById(int id) {
        categoryRepository.findById(id)
    }

    @Override
    void saveCategory(Category category) {
        categoryRepository.save(category)
    }

    @Override
    void updateCategory(int id, Category category) {
        categoryRepository.save(category)

    }

    @Override
    void deleteCategory(int id) {
        categoryRepository.deleteById(id)
    }
}