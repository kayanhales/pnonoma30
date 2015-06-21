package com.praisenation.pnonoma30.logger;

/**
 * Created by kayanhales on 6/18/15.
 */
public class DailyLogger {


    private int logID;
    private String nameOfGod;
    private String bibleVerse;
    private String sharedWith;
    private String verseMeaning;
    private String optionalComments;

    /**
     * Populated from the daily log form
     *
     */
    public DailyLogger(int logID, String nameOfGod, String bibleVerse, String sharedWith, String verseMeaning, String optionalComments)
    {
        this.logID=logID;
        this.nameOfGod=nameOfGod;
        this.bibleVerse=bibleVerse;
        this.sharedWith=sharedWith;
        this.verseMeaning=verseMeaning;
        this.optionalComments=optionalComments;
    }

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public String getNameOfGod() {
        return nameOfGod;
    }

    public void setNameOfGod(String nameOfGod) {
        this.nameOfGod = nameOfGod;
    }

    public String getBibleVerse() {
        return bibleVerse;
    }

    public void setBibleVerse(String bibleVerse) {
        this.bibleVerse = bibleVerse;
    }

    public String getSharedWith() {
        return sharedWith;
    }

    public void setSharedWith(String sharedWith) {
        this.sharedWith = sharedWith;
    }

    public String getVerseMeaning() {
        return verseMeaning;
    }

    public void setVerseMeaning(String verseMeaning) {
        this.verseMeaning = verseMeaning;
    }

    public String getOptionalComments() {
        return optionalComments;
    }

    public void setOptionalComments(String optionalComments) {
        this.optionalComments = optionalComments;
    }

    @Override
    public String toString() {
        return "DailyLogger{" +
                "logID=" + logID +
                ", nameOfGod='" + nameOfGod + '\'' +
                ", bibleVerse='" + bibleVerse + '\'' +
                ", sharedWith='" + sharedWith + '\'' +
                ", verseMeaning='" + verseMeaning + '\'' +
                ", optionalComments='" + optionalComments + '\'' +
                '}';
    }


}
