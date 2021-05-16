package com.example.demo.domain;


import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private ImportanceEnum importance;
    private String text;
    private Timestamp timestamp;

    public Note() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ImportanceEnum getImportance() {
        return importance;
    }

    public void setImportance(ImportanceEnum importance) {
        this.importance = importance;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(id, note.id) && importance == note.importance && Objects.equals(text, note.text) && Objects.equals(timestamp, note.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, importance, text, timestamp);
    }
}
