package com.joelparkerhenderson.makertakersolver;
import java.util.*;

public class Maker {
    String id;
    String name;
    List<Tag> tags;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(final List<Tag> tags) {
        this.tags = tags;
    }

	public Maker(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Maker() {
    }
}