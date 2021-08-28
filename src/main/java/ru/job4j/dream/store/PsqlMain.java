package ru.job4j.dream.store;

import ru.job4j.dream.model.Post;

import java.sql.SQLException;

public class PsqlMain {
    public static void main(String[] args) throws SQLException {
        Store store = PsqlStore.instOf();
        store.save(new Post(0, "Java Job"));
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }
        Post post = store.findById(0);
        System.out.println(post);
    }
}
