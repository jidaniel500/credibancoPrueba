package tarjetas.entidades;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "TRANSACCIONES", schema = "CREDIBANCO", catalog = "")
public class TransaccionesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Basic
    @Column(name = "FECHA_TRANSACCION")
    private Date fechaTransaccion;
    @Basic
    @Column(name = "ESTADO")
    private String estado;
    @Basic
    @Column(name = "COD_TARJETA")
    private BigInteger codTarjeta;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigInteger getCodTarjeta() {
        return codTarjeta;
    }

    public void setCodTarjeta(BigInteger codTarjeta) {
        this.codTarjeta = codTarjeta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransaccionesEntity that = (TransaccionesEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(fechaTransaccion, that.fechaTransaccion) && Objects.equals(estado, that.estado) && Objects.equals(codTarjeta, that.codTarjeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fechaTransaccion, estado, codTarjeta);
    }
}
