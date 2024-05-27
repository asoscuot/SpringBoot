package com.example.demo6.service;

import com.example.demo6.domain.Comment;
import com.example.demo6.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author 梁松涛
 * @version 1.0
 **/
@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    public Comment findById(int comment_id){
        Optional<Comment> optional = commentRepository.findById(comment_id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }
    public Comment updateComment(Comment comment){
        commentRepository.updateComment(comment.getAuthor(),comment.getaId());
        return comment;
    }

    public void deleteComment(int comment_id){
        commentRepository.deleteById(comment_id);
    }
}
