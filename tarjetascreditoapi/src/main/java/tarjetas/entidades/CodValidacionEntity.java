package tarjetas.entidades;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "COD_VALIDACION", schema = "CREDIBANCO", catalog = "")
public class CodValidacionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Basic
    @Column(name = "COD_VERIFICACION")
    private String codVerificacion;
    @Basic
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getCodVerificacion() {
        return codVerificacion;
    }

    public void setCodVerificacion(String codVerificacion) {
        this.codVerificacion = codVerificacion;
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
        CodValidacionEntity that = (CodValidacionEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(codVerificacion, that.codVerificacion) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codVerificacion, descripcion);
    }
}
