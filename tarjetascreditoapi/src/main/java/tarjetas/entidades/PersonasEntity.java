package tarjetas.entidades;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "PERSONAS", schema = "CREDIBANCO", catalog = "")
public class PersonasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CC")
    private BigInteger cc;
    @Basic
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic
    @Column(name = "APELLIDO")
    private String apellido;
    @Basic
    @Column(name = "CELULAR")
    private String celular;
    @Basic
    @Column(name = "TELFIJO")
    private String telfijo;

    public BigInteger getCc() {
        return cc;
    }

    public void setCc(BigInteger cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelfijo() {
        return telfijo;
    }

    public void setTelfijo(String telfijo) {
        this.telfijo = telfijo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonasEntity that = (PersonasEntity) o;
        return Objects.equals(cc, that.cc) && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(celular, that.celular) && Objects.equals(telfijo, that.telfijo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cc, nombre, apellido, celular, telfijo);
    }
}
