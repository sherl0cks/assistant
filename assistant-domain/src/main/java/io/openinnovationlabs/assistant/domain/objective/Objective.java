package io.openinnovationlabs.assistant.domain.objective;

/*
    This is really just a read model right now. We'll be adding domain logic here later.
 */
public class Objective {

    protected String id;
    private String name;

    public Objective(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Objective objective = (Objective) o;

        return name != null ? name.equals(objective.name) : objective.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Objective{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
