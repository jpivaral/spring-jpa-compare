package com.piva.springdatarestdemo.repository;

import com.piva.springdatarestdemo.model.Email;
import com.piva.springdatarestdemo.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface EmailRepository extends PagingAndSortingRepository<Email, Long> {
}
