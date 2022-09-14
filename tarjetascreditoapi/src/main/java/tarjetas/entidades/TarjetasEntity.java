package tarjetas.entidades;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "TARJETAS", schema = "CREDIBANCO", catalog = "")
public class TarjetasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "COD")
    private BigInteger cod;
    @Basic
    @Column(name = "NUM_PAN")
    private BigInteger numPan;
    @Basic
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
    @Basic
    @Column(name = "FECHA_ACTIVACION")
    private Date fechaActivacion;
    @Basic
    @Column(name = "ID_PERSONA")
    private BigInteger idPersona;
    @Basic
    @Column(name = "COD_TIPO")
    private BigInteger codTipo;
    @Basic
    @Column(name = "ESTADO")
    private BigInteger estado;

    public BigInteger getCod() {
        return cod;
    }

    public void setCod(BigInteger cod) {
        this.cod = cod;
    }

    public BigInteger getNumPan() {
        return numPan;
    }

    public void setNumPan(BigInteger numPan) {
        this.numPan = numPan;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActivacion() {
        return fechaActivacion;
    }

    public void setFechaActivacion(Date fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    public BigInteger getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(BigInteger idPersona) {
        this.idPersona = idPersona;
    }

    public BigInteger getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(BigInteger codTipo) {
        this.codTipo = codTipo;
    }

    public BigInteger getEstado() {
        return estado;
    }

    public void setEstado(BigInteger estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TarjetasEntity that = (TarjetasEntity) o;
        return Objects.equals(cod, that.cod) && Objects.equals(numPan, that.numPan) && Objects.equals(fechaCreacion, that.fechaCreacion) && Objects.equals(fechaActivacion, that.fechaActivacion) && Objects.equals(idPersona, that.idPersona) && Objects.equals(codTipo, that.codTipo) && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod, numPan, fechaCreacion, fechaActivacion, idPersona, codTipo, estado);
    }
}
