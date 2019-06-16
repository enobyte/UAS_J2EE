package com.mainurrahman.mainurrahman.service.impl

import com.mainurrahman.mainurrahman.entity.Books
import com.mainurrahman.mainurrahman.repository.BooksRepository
import com.mainurrahman.mainurrahman.service.BooksService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody

import javax.validation.Valid

@Service
class BooksServiceImpl implements BooksService {
    @Autowired
    private final BooksRepository booksRepository

    @Override
    List<Books> findAll() {
        booksRepository.findAll()
    }

    @Override
    Books findById(int id) {
        booksRepository.findById(id)
    }

    @Override
    void saveBooks(@Valid @RequestBody Books category) {
        booksRepository.save(category)
    }

    @Override
    void updateBooks(int id, Books category) {
        booksRepository.save(category)

    }

    @Override
    void deleteBooks(int id) {
        booksRepository.deleteById(id)
    }
}