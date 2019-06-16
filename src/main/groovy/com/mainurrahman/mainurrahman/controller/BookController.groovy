package com.mainurrahman.mainurrahman.controller

import com.mainurrahman.mainurrahman.entity.Books
import com.mainurrahman.mainurrahman.service.BooksService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/book")
class BookController {
    @Autowired
    private final BooksService booksService

    @GetMapping("")
    List<Books> findAll() {
        booksService.findAll()
    }

    @GetMapping("/{id}")
    Books findById(@PathVariable('id') int id) {
        booksService.findById(id)
    }

    @PostMapping("/")
    void addBooks(@RequestBody Books books) {
        Books p = new Books()
        p.kd_kategori = books.kd_kategori
        booksService.saveBooks(books)
    }

    @PutMapping("/{id}")
    void updateBooks(@PathVariable int id, @RequestBody Books books) {
        booksService.updateBooks(id, books)
    }

    @DeleteMapping("/{id}")
    void deleteBooks(@PathVariable int id) {
        booksService.deleteBooks(id)
    }

}