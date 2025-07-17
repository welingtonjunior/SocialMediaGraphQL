package com.graphql.socialmedia;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
class PostService {

    Map<String, Post> posts = new HashMap<>();

    Collection<Post> createPost(String content){
        var newPost = new Post(UUID.randomUUID().toString(), content);
        posts.put(newPost.id(), newPost);
        return posts.values();
    }

    Post postById(String id) {
        return posts.get(id);
    }
}

@Service
class CommentsService {

    Map<String, Comment> comments = new HashMap<>();

    Collection<Comment> createComment(String content, String postId){
        var newComment = new Comment(UUID.randomUUID().toString(), content, postId);
        comments.put(newComment.id(), newComment);
        return comments.values();
    }

    public Collection<Comment> findByPost(String postId) {
        return comments.values().stream()
                .filter(comment -> comment.postId().equals(postId)).toList();
    }
}
