package pl.mpas.firstspringexample.domain;

import javax.persistence.*;

@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nick;

//    // property: wiek, pole age
//    private int age;
//
//    public int getWiek() {
//        return age;
//    }

    @OneToOne
    private Pet pet;

    public Owner() {
    }

    public Owner(String nick, Pet pet) {
        this.nick = nick;
        this.pet = pet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Pet getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", nick='" + nick + '\'' +
                ", pet=" + pet +
                '}';
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
