package althingi.data.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;

import althingi.data.CommitteeMembership;

/**
 * Class _Person was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Person extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<LocalDate> BIRTH_DATE = Property.create("birthDate", LocalDate.class);
    public static final Property<LocalDateTime> CREATION_DATE = Property.create("creationDate", LocalDateTime.class);
    public static final Property<LocalDateTime> MODIFICATION_DATE = Property.create("modificationDate", LocalDateTime.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<Long> ORIGINAL_ID = Property.create("originalID", Long.class);
    public static final Property<String> UNIQUE_ID = Property.create("uniqueID", String.class);
    public static final Property<List<CommitteeMembership>> COMMITEE_MEMBERSHIPS = Property.create("commiteeMemberships", List.class);

    protected LocalDate birthDate;
    protected LocalDateTime creationDate;
    protected LocalDateTime modificationDate;
    protected String name;
    protected Long originalID;
    protected String uniqueID;

    protected Object commiteeMemberships;

    public void setBirthDate(LocalDate birthDate) {
        beforePropertyWrite("birthDate", this.birthDate, birthDate);
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        beforePropertyRead("birthDate");
        return this.birthDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        beforePropertyWrite("creationDate", this.creationDate, creationDate);
        this.creationDate = creationDate;
    }

    public LocalDateTime getCreationDate() {
        beforePropertyRead("creationDate");
        return this.creationDate;
    }

    public void setModificationDate(LocalDateTime modificationDate) {
        beforePropertyWrite("modificationDate", this.modificationDate, modificationDate);
        this.modificationDate = modificationDate;
    }

    public LocalDateTime getModificationDate() {
        beforePropertyRead("modificationDate");
        return this.modificationDate;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setOriginalID(Long originalID) {
        beforePropertyWrite("originalID", this.originalID, originalID);
        this.originalID = originalID;
    }

    public Long getOriginalID() {
        beforePropertyRead("originalID");
        return this.originalID;
    }

    public void setUniqueID(String uniqueID) {
        beforePropertyWrite("uniqueID", this.uniqueID, uniqueID);
        this.uniqueID = uniqueID;
    }

    public String getUniqueID() {
        beforePropertyRead("uniqueID");
        return this.uniqueID;
    }

    public void addToCommiteeMemberships(CommitteeMembership obj) {
        addToManyTarget("commiteeMemberships", obj, true);
    }

    public void removeFromCommiteeMemberships(CommitteeMembership obj) {
        removeToManyTarget("commiteeMemberships", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<CommitteeMembership> getCommiteeMemberships() {
        return (List<CommitteeMembership>)readProperty("commiteeMemberships");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "birthDate":
                return this.birthDate;
            case "creationDate":
                return this.creationDate;
            case "modificationDate":
                return this.modificationDate;
            case "name":
                return this.name;
            case "originalID":
                return this.originalID;
            case "uniqueID":
                return this.uniqueID;
            case "commiteeMemberships":
                return this.commiteeMemberships;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "birthDate":
                this.birthDate = (LocalDate)val;
                break;
            case "creationDate":
                this.creationDate = (LocalDateTime)val;
                break;
            case "modificationDate":
                this.modificationDate = (LocalDateTime)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "originalID":
                this.originalID = (Long)val;
                break;
            case "uniqueID":
                this.uniqueID = (String)val;
                break;
            case "commiteeMemberships":
                this.commiteeMemberships = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.birthDate);
        out.writeObject(this.creationDate);
        out.writeObject(this.modificationDate);
        out.writeObject(this.name);
        out.writeObject(this.originalID);
        out.writeObject(this.uniqueID);
        out.writeObject(this.commiteeMemberships);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.birthDate = (LocalDate)in.readObject();
        this.creationDate = (LocalDateTime)in.readObject();
        this.modificationDate = (LocalDateTime)in.readObject();
        this.name = (String)in.readObject();
        this.originalID = (Long)in.readObject();
        this.uniqueID = (String)in.readObject();
        this.commiteeMemberships = in.readObject();
    }

}
