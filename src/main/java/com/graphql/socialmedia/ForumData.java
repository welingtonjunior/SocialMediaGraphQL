package com.graphql.socialmedia;

record Post(String id, String content) {}

record Comment(String id, String content, String postId){}
