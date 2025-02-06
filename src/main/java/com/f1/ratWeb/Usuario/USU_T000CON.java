package com.f1.ratWeb.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class USU_T000CON {
    
    @Id
    private Integer usu_codcon;

    @Getter
    @Setter
    private String usu_nomcon;

    @Getter
    @Setter
    private String usu_emacon;    
}
