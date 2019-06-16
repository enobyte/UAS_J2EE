package com.mainurrahman.mainurrahman.repository

import com.mainurrahman.mainurrahman.entity.Books
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BooksRepository extends JpaRepository<Books, Integer> {
    List<Books> findAll()

    Books findById(Integer id)
}