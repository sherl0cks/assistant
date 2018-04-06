package io.openinnovationlabs.assistant.domain.practice;

/*
    This is really just a read model right now. We'll be adding domain logic here later.
 */
public class Practice {

    protected String id;
    private String name;
    private String documentationUrl;
    private String message;
    private String objectiveId;

    public Practice(String name, String documentationUrl, String message, String objectiveId) {
        this.name = name;
        this.documentationUrl = documentationUrl;
        this.message = message;
        this.objectiveId = objectiveId;
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

    public String getDocumentationUrl() {
        return documentationUrl;
    }

    public String getMessage() {
        return message;
    }

    public String getObjectiveId() {
        return objectiveId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Practice practice = (Practice) o;

        if (name != null ? !name.equals(practice.name) : practice.name != null) return false;
        if (documentationUrl != null ? !documentationUrl.equals(practice.documentationUrl) : practice.documentationUrl != null)
            return false;
        if (message != null ? !message.equals(practice.message) : practice.message != null) return false;
        return objectiveId != null ? objectiveId.equals(practice.objectiveId) : practice.objectiveId == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (documentationUrl != null ? documentationUrl.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (objectiveId != null ? objectiveId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "name='" + name + '\'' +
                ", documentationUrl='" + documentationUrl + '\'' +
                ", message='" + message + '\'' +
                ", objectiveId='" + objectiveId + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
