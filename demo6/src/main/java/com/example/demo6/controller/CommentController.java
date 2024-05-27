package com.example.demo6.controller;

import com.example.demo6.domain.Comment;
import com.example.demo6.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 梁松涛
 * @version 1.0
 **/
@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;
    @GetMapping("get/{id}")
    public Comment findById(@PathVariable("id") int comment_id){
        Comment comment = commentService.findById(comment_id);
        return comment;
    }

    @GetMapping("update/{id}/{author}")
    public Comment updateComment(@PathVariable("id") int comment_id,@PathVariable("author") String author){
        Comment comment = commentService.findById(comment_id);
        comment.setAuthor(author);
        Comment updateComment = commentService.updateComment(comment);
        return updateComment;
    }

    @GetMapping("/delete/{id}")
    public void deleteComment(@PathVariable("id") int comment_id){
        commentService.deleteComment(comment_id);
    }
}
