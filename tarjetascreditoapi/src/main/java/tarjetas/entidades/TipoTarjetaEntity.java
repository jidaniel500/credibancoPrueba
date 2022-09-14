package tarjetas.entidades;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "TIPO_TARJETA", schema = "CREDIBANCO", catalog = "")
public class TipoTarjetaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Basic
    @Column(name = "NOM_TIPO")
    private String nomTipo;
    @Basic
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNomTipo() {
        return nomTipo;
    }

    public void setNomTipo(String nomTipo) {
        this.nomTipo = nomTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoTarjetaEntity that = (TipoTarjetaEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(nomTipo, that.nomTipo) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomTipo, descripcion);
    }
}
