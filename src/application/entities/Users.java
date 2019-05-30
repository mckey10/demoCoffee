package application.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name="users")
public class Users {


    @Id
    @Column(length = 100)
    @NotNull
    private String nameUser;

    public Users(@NotNull String nameUser) {
       this.nameUser = nameUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        return nameUser != null ? nameUser.equals(users.nameUser) : users.nameUser == null;
    }

    @Override
    public int hashCode() {
        return nameUser != null ? nameUser.hashCode() : 0;
    }
}
