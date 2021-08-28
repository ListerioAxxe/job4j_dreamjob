package ru.job4j.dream.store;
import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;

import java.sql.SQLException;
import java.util.Collection;

public interface Store {
    Collection<Post> findAllPosts();

    Collection<Candidate> findAllCandidates() throws SQLException;

    void save(Post post) throws SQLException;

    Post findById(int id) throws SQLException;
}
