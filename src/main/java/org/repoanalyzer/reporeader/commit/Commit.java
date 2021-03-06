package org.repoanalyzer.reporeader.commit;

import org.repoanalyzer.reporeader.author.Author;

import org.joda.time.DateTime;

final public class Commit {

    private final String sha;
    private final Author author;
    private final DateTime dateTime;
    private final String message;
    private final int deletedLinesNumber;
    private final int addedLinesNumber;
    private final int changedLinesNumber;

    Commit(String sha, Author author, DateTime dateTime, String message, int deletedLinesNumber, int addedLinesNumber, int changedLinesNumber) {
        this.sha = sha;
        this.author = author;
        this.dateTime = dateTime;
        this.message = message;
        this.deletedLinesNumber = deletedLinesNumber;
        this.addedLinesNumber = addedLinesNumber;
        this.changedLinesNumber = changedLinesNumber;
    }

    public String getSHA() {
        return this.sha;
    }

    public Author getAuthor() {
        return this.author;
    }

    public DateTime getDateTime() {
        return this.dateTime;
    }

    public String getMessage() {
        return this.message;
    }

    public int getDeletedLinesNumber() {
        return this.deletedLinesNumber;
    }

    public int getAddedLinesNumber() {
        return this.addedLinesNumber;
    }

    public int getChangedLinesNumber() {
        return this.changedLinesNumber;
    }
}
