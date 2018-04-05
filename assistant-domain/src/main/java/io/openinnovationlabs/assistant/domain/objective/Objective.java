package io.openinnovationlabs.assistant.domain.objective;

/*
    This is really just a read model right now. We'll be adding domain logic here later.
 */
public class Objective {

    private String id;
    private String name;

    public Objective(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Objective objective = (Objective) o;

        if (id != null ? !id.equals(objective.id) : objective.id != null) return false;
        return name != null ? name.equals(objective.name) : objective.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Objective{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
