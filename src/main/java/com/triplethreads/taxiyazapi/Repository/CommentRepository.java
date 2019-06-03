package com.triplethreads.taxiyazapi.Repository;

import com.triplethreads.taxiyazapi.Model.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository  extends CrudRepository<Comment, Long> {

    Iterable<Comment> findByRoute_id(long route_Id);
}