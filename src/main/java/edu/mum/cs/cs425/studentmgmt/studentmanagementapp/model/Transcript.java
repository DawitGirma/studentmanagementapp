package edu.mum.cs.cs425.studentmgmt.studentmanagementapp.model;

import javax.persistence.*;


@Entity
@Table(name = "TRANSCRIPT")
public class Transcript
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transcript_id")
    long transcriptId;

    @Column(name = "degree_title")
    String degreeTitle;

    public Transcript(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    public long getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }
}
