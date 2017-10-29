package althingi.data.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;

import althingi.data.CommitteeMembership;

/**
 * Class _Committee was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Committee extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<String> ABBREVIATION_LONG = Property.create("abbreviationLong", String.class);
    public static final Property<String> ABBREVIATION_SHORT = Property.create("abbreviationShort", String.class);
    public static final Property<LocalDateTime> CREATION_DATE = Property.create("creationDate", LocalDateTime.class);
    public static final Property<Long> FIRST_PARLIAMENT_NUMBER = Property.create("firstParliamentNumber", Long.class);
    public static final Property<Long> LAST_PARLIAMENT_NUMBER = Property.create("lastParliamentNumber", Long.class);
    public static final Property<LocalDateTime> MODIFICATION_DATE = Property.create("modificationDate", LocalDateTime.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<Long> ORIGINAL_ID = Property.create("originalID", Long.class);
    public static final Property<String> UNIQUE_ID = Property.create("uniqueID", String.class);
    public static final Property<List<CommitteeMembership>> COMMITTEE_MEMBERSHIPS = Property.create("committeeMemberships", List.class);

    protected String abbreviationLong;
    protected String abbreviationShort;
    protected LocalDateTime creationDate;
    protected Long firstParliamentNumber;
    protected Long lastParliamentNumber;
    protected LocalDateTime modificationDate;
    protected String name;
    protected Long originalID;
    protected String uniqueID;

    protected Object committeeMemberships;

    public void setAbbreviationLong(String abbreviationLong) {
        beforePropertyWrite("abbreviationLong", this.abbreviationLong, abbreviationLong);
        this.abbreviationLong = abbreviationLong;
    }

    public String getAbbreviationLong() {
        beforePropertyRead("abbreviationLong");
        return this.abbreviationLong;
    }

    public void setAbbreviationShort(String abbreviationShort) {
        beforePropertyWrite("abbreviationShort", this.abbreviationShort, abbreviationShort);
        this.abbreviationShort = abbreviationShort;
    }

    public String getAbbreviationShort() {
        beforePropertyRead("abbreviationShort");
        return this.abbreviationShort;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        beforePropertyWrite("creationDate", this.creationDate, creationDate);
        this.creationDate = creationDate;
    }

    public LocalDateTime getCreationDate() {
        beforePropertyRead("creationDate");
        return this.creationDate;
    }

    public void setFirstParliamentNumber(Long firstParliamentNumber) {
        beforePropertyWrite("firstParliamentNumber", this.firstParliamentNumber, firstParliamentNumber);
        this.firstParliamentNumber = firstParliamentNumber;
    }

    public Long getFirstParliamentNumber() {
        beforePropertyRead("firstParliamentNumber");
        return this.firstParliamentNumber;
    }

    public void setLastParliamentNumber(Long lastParliamentNumber) {
        beforePropertyWrite("lastParliamentNumber", this.lastParliamentNumber, lastParliamentNumber);
        this.lastParliamentNumber = lastParliamentNumber;
    }

    public Long getLastParliamentNumber() {
        beforePropertyRead("lastParliamentNumber");
        return this.lastParliamentNumber;
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

    public void addToCommitteeMemberships(CommitteeMembership obj) {
        addToManyTarget("committeeMemberships", obj, true);
    }

    public void removeFromCommitteeMemberships(CommitteeMembership obj) {
        removeToManyTarget("committeeMemberships", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<CommitteeMembership> getCommitteeMemberships() {
        return (List<CommitteeMembership>)readProperty("committeeMemberships");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "abbreviationLong":
                return this.abbreviationLong;
            case "abbreviationShort":
                return this.abbreviationShort;
            case "creationDate":
                return this.creationDate;
            case "firstParliamentNumber":
                return this.firstParliamentNumber;
            case "lastParliamentNumber":
                return this.lastParliamentNumber;
            case "modificationDate":
                return this.modificationDate;
            case "name":
                return this.name;
            case "originalID":
                return this.originalID;
            case "uniqueID":
                return this.uniqueID;
            case "committeeMemberships":
                return this.committeeMemberships;
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
            case "abbreviationLong":
                this.abbreviationLong = (String)val;
                break;
            case "abbreviationShort":
                this.abbreviationShort = (String)val;
                break;
            case "creationDate":
                this.creationDate = (LocalDateTime)val;
                break;
            case "firstParliamentNumber":
                this.firstParliamentNumber = (Long)val;
                break;
            case "lastParliamentNumber":
                this.lastParliamentNumber = (Long)val;
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
            case "committeeMemberships":
                this.committeeMemberships = val;
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
        out.writeObject(this.abbreviationLong);
        out.writeObject(this.abbreviationShort);
        out.writeObject(this.creationDate);
        out.writeObject(this.firstParliamentNumber);
        out.writeObject(this.lastParliamentNumber);
        out.writeObject(this.modificationDate);
        out.writeObject(this.name);
        out.writeObject(this.originalID);
        out.writeObject(this.uniqueID);
        out.writeObject(this.committeeMemberships);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.abbreviationLong = (String)in.readObject();
        this.abbreviationShort = (String)in.readObject();
        this.creationDate = (LocalDateTime)in.readObject();
        this.firstParliamentNumber = (Long)in.readObject();
        this.lastParliamentNumber = (Long)in.readObject();
        this.modificationDate = (LocalDateTime)in.readObject();
        this.name = (String)in.readObject();
        this.originalID = (Long)in.readObject();
        this.uniqueID = (String)in.readObject();
        this.committeeMemberships = in.readObject();
    }

}
