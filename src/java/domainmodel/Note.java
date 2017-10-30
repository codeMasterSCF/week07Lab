package domainmodel;

import java.util.Date;

/**
 *
 * @author 463849
 */
public class Note {
    
    int NoteId;
    java.util.Date dateCreated;
    String contents;

    public Note() {
    }

    public Note(int NoteId, Date dateCreated, String contents) {
        this.NoteId = NoteId;
        this.dateCreated = dateCreated;
        this.contents = contents;
    }

    public int getNoteId() {
        return NoteId;
    }

    public void setNoteId(int NoteId) {
        this.NoteId = NoteId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
  
}
