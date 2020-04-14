package com.example.springrest.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Post;

public interface PostRepository extends CrudRepository<Post, Integer>  {

}
