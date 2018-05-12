package softuniBlog.repository;

import softuniBlog.entity.Tag;


public interface TagRepository extends JpaRepository<Tag, Integer> {
    Tag findByName(String name);
}
