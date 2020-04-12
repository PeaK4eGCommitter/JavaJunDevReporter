package ru.levelup.nm.model.tables;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import ru.levelup.nm.model.EntityType;
import ru.levelup.nm.model.publicModels.PublicModelUserFullInfo;
import ru.levelup.nm.model.publicModels.PublicModelUserShortInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = User.TABLE_NAME)
@Data
public class User extends Description {
    public static final String TABLE_NAME = "Users";

    public User(){
        setEntityType(EntityType.USER);
    }

    @Column
    private String email;

    @Column
    @JsonIgnore
    @Size(min = 4, max = 50)
    private String password;

    @Column(length = 50, nullable = false, unique = true)
    @Size(min = 4, max = 50)
    @Pattern(regexp = "[a-zA-Z-_.0-9]*", message = "Regexp check like '[a-zA-Z-_.0-9]*'")
    private String login;

    public PublicModelUserFullInfo getPublicInfoFull(){
        return new PublicModelUserFullInfo(
                this.getId(),
                this.getLogin(),
                this.getEmail(),
                this.getName(),
                this.getDescription(),
                this.getEntityType(),
                this.getLog()
        );
    }

    public PublicModelUserShortInfo getPublicInfoShort(){
        return new PublicModelUserShortInfo(
                this.getLogin(),
                this.getName(),
                this.getDescription()
        );
    }
}
