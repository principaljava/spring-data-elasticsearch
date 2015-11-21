package org.springframework.data.elasticsearch.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.entities.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface SampleBookRepository extends ElasticsearchRepository<Book,String> {
    Page<Book> findByNameAndPrice(String name, Integer price, Pageable pageable);
    Page<Book> findByNameOrPrice(String name, Integer price, Pageable pageable);
    Page<Book> findByName(String name, Pageable pageable);
}
