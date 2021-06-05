package ir.maktab.data.domain;

import javax.persistence.*;

@Entity
public class SpecialistComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double score;
    private String comment;
    @ManyToOne
    private Specialist specialist;

    public Integer getId() {
        return id;
    }

    public SpecialistComment setId(Integer id) {
        this.id = id;
        return this;
    }

    public Double getScore() {
        return score;
    }

    public SpecialistComment setScore(Double rate) {
        this.score = rate;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public SpecialistComment setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public ir.maktab.data.domain.Specialist getSpecialist() {
        return specialist;
    }

    public SpecialistComment setSpecialist(ir.maktab.data.domain.Specialist specialist) {
        this.specialist = specialist;
        return this;
    }
}
