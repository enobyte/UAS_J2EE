package com.mainurrahman.mainurrahman.service


import org.springframework.stereotype.Service

@Service
interface BooksService {

    List<com.mainurrahman.mainurrahman.entity.Books> findAll()

    com.mainurrahman.mainurrahman.entity.Books findById(int id)

    void saveBooks(com.mainurrahman.mainurrahman.entity.Books books)

    void updateBooks(int id, com.mainurrahman.mainurrahman.entity.Books books)

    void deleteBooks(int id)
}