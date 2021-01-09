package hellojpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

    //외래 키가 있는 있는 곳을 주인으로 정해라
    //private Team team;
    //가짜 매핑
//    @OneToMany(mappedBy = "team")
//    private List<Member> members = new ArrayList<>();

    //연관관계 편의 메소드
//    public void addMember(Member member) {
//        member.setTeam(this);
//        members.add(member);
//    }

    @OneToMany
    @JoinColumn(name = "TEAM_ID")
    private List<Member> members = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    //    public List<Member> getMembers() {
//        return members;
//    }

//    public void setMembers(List<Member> members) {
//        this.members = members;
//    }

//    @Override
//    public String toString() {
//        return "Team{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", members=" + members +
//                '}';
//    }
}
