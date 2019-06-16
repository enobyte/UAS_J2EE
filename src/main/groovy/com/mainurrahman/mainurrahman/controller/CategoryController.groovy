package com.mainurrahman.mainurrahman.controller

import com.mainurrahman.mainurrahman.entity.Category
import com.mainurrahman.mainurrahman.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categories")
class CategoryController {
    @Autowired
    private final CategoryService categoryService

    @GetMapping("")
    List<Category> findAll() {
        categoryService.findAll()
    }

    @GetMapping("/{id}")
    Category findById(@PathVariable('id') int id) {
        categoryService.findById(id)
    }

    @PostMapping("/")
    void addCategory(@RequestBody Category category) {
        categoryService.saveCategory(category)
    }

    @PutMapping("/{id}")
    void updateCategory(@PathVariable int id, @RequestBody Category category) {
        categoryService.updateCategory(id, category)
    }

    @DeleteMapping("/{id}")
    void deleteCategory(@PathVariable int id) {
        categoryService.deleteCategory(id)
    }

}