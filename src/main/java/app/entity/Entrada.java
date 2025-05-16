
package app.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela ENTRADA
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"ENTRADA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Entrada")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class Entrada implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_produto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Produto produto;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Qtd Entrada")
    @Column(name = "QtdEntrada", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtdEntrada;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data")
    @Column(name = "Data", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date data;


    /**
    * Construtor
    * @generated
    */
    public Entrada(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Entrada setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém produto
    * return produto
    * @generated
    */
    public Produto getProduto() {
        return this.produto;
    }

    /**
    * Define produto
    * @param produto produto
    * @generated
    */
    public Entrada setProduto(Produto produto) {
        this.produto = produto;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    public User getUser() {
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Entrada setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém qtdEntrada
    * return qtdEntrada
    * @generated
    */
    public java.lang.Integer getQtdEntrada() {
        return this.qtdEntrada;
    }

    /**
    * Define qtdEntrada
    * @param qtdEntrada qtdEntrada
    * @generated
    */
    public Entrada setQtdEntrada(java.lang.Integer qtdEntrada) {
        this.qtdEntrada = qtdEntrada;
        return this;
    }
    /**
    * Obtém data
    * return data
    * @generated
    */
    public java.util.Date getData() {
        return this.data;
    }

    /**
    * Define data
    * @param data data
    * @generated
    */
    public Entrada setData(java.util.Date data) {
        this.data = data;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Entrada object = (Entrada)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
