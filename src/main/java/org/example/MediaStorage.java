package org.example;

import java.util.Objects;

public class MediaStorage {
private Integer id;
private String url;
private String text;

    public MediaStorage() {

    }

    public MediaStorage(Integer id, String url, String text) {
        this.id = id;
        this.url = url;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MediaStorage that = (MediaStorage) o;
        return Objects.equals(id, that.id) && Objects.equals(url, that.url) && Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, text);
    }
}
