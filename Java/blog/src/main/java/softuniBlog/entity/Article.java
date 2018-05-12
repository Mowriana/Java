package softuniBlog.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "articles")
public class Article {
    private Integer id;

    private String title;

    private String content;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(columnDefinition = "text", nullable = false)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @ManyToOne()
    @JoinColumn(nullable = false, name = "authorId")
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    private User author;

    public Article(String title, String content, User author, Category category) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.category = category;
    }

    public Article() {
    }

    @Transient
    public String getSummary() {
        return this.getContent().substring(0, this.getContent().length() / 2) + "...";
    }

    private Category category;

    @ManyToOne()
    @JoinColumn(nullable = false, name = "categoryId")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Entity
    @Table(name = "tags")
    public class Tag {

        private Integer id;

        private String name;

        private Set<Article> articles;

        public Tag(String name) {
            this.name = name;
            this.articles = new HashSet<>();
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        @Column(unique = true, nullable = false)
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @ManyToMany(mappedBy = "tags")
        public Set<Article> getArticles() {
            return articles;
        }

        public void setArticles(Set<Article> articles) {
            this.articles = articles;
        }
    }

    private Set<Tag> tags;
    @ManyToMany()
    @JoinColumn(table = "articles_tags")
    public Set<Tag> getTags(){return tags;}
    public void setTags(Set<Tag> tags){this.tags=tags;}
}
