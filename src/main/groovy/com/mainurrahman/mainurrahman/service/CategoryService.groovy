package com.mainurrahman.mainurrahman.service

import com.sun.xml.internal.bind.v2.model.core.ID
import org.springframework.stereotype.Service


@Service
interface CategoryService{

    List<com.mainurrahman.mainurrahman.entity.Category> findAll()

    com.mainurrahman.mainurrahman.entity.Category findById(int id)

    void saveCategory(com.mainurrahman.mainurrahman.entity.Category category)
    void updateCategory(int id, com.mainurrahman.mainurrahman.entity.Category category)
    void deleteCategory(int id)
}