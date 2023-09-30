package bean;
// Generated 13/09/2023 17:40:18 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UsuariosBjf generated by hbm2java
 */
@Entity
@Table(name="usuarios_bjf"
    ,catalog="db_bianca_ferraz"
)
public class UsuariosBjf  implements java.io.Serializable {


     private int idusuariosBjf;
     private String nomeBjf;
     private Date dataNascBjf;
     private String emailBjf;
     private String cpfBjf;
     private char sexoBjf;
     private String ativoBjf;
     private String senhaBjf;
     private ClienteBjf clienteBjf;
     private FuncionarioBjf funcionarioBjf;

    public UsuariosBjf() {
    }

	
    public UsuariosBjf(int idusuariosBjf, String nomeBjf, Date dataNascBjf, String emailBjf, String cpfBjf, char sexoBjf, String ativoBjf, String senhaBjf) {
        this.idusuariosBjf = idusuariosBjf;
        this.nomeBjf = nomeBjf;
        this.dataNascBjf = dataNascBjf;
        this.emailBjf = emailBjf;
        this.cpfBjf = cpfBjf;
        this.sexoBjf = sexoBjf;
        this.ativoBjf = ativoBjf;
        this.senhaBjf = senhaBjf;
    }
    public UsuariosBjf(int idusuariosBjf, String nomeBjf, Date dataNascBjf, String emailBjf, String cpfBjf, char sexoBjf, String ativoBjf, String senhaBjf, ClienteBjf clienteBjf, FuncionarioBjf funcionarioBjf) {
       this.idusuariosBjf = idusuariosBjf;
       this.nomeBjf = nomeBjf;
       this.dataNascBjf = dataNascBjf;
       this.emailBjf = emailBjf;
       this.cpfBjf = cpfBjf;
       this.sexoBjf = sexoBjf;
       this.ativoBjf = ativoBjf;
       this.senhaBjf = senhaBjf;
       this.clienteBjf = clienteBjf;
       this.funcionarioBjf = funcionarioBjf;
    }
   
     @Id 

    
    @Column(name="idusuarios_bjf", unique=true, nullable=false)
    public int getIdusuariosBjf() {
        return this.idusuariosBjf;
    }
    
    public void setIdusuariosBjf(int idusuariosBjf) {
        this.idusuariosBjf = idusuariosBjf;
    }

    
    @Column(name="nome_bjf", nullable=false, length=50)
    public String getNomeBjf() {
        return this.nomeBjf;
    }
    
    public void setNomeBjf(String nomeBjf) {
        this.nomeBjf = nomeBjf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataNasc_bjf", nullable=false, length=10)
    public Date getDataNascBjf() {
        return this.dataNascBjf;
    }
    
    public void setDataNascBjf(Date dataNascBjf) {
        this.dataNascBjf = dataNascBjf;
    }

    
    @Column(name="email_bjf", nullable=false, length=50)
    public String getEmailBjf() {
        return this.emailBjf;
    }
    
    public void setEmailBjf(String emailBjf) {
        this.emailBjf = emailBjf;
    }

    
    @Column(name="cpf_bjf", nullable=false, length=15)
    public String getCpfBjf() {
        return this.cpfBjf;
    }
    
    public void setCpfBjf(String cpfBjf) {
        this.cpfBjf = cpfBjf;
    }

    
    @Column(name="sexo_bjf", nullable=false, length=1)
    public char getSexoBjf() {
        return this.sexoBjf;
    }
    
    public void setSexoBjf(char sexoBjf) {
        this.sexoBjf = sexoBjf;
    }

    
    @Column(name="ativo_bjf", nullable=false, length=1)
    public String getAtivoBjf() {
        return this.ativoBjf;
    }
    
    public void setAtivoBjf(String ativoBjf) {
        this.ativoBjf = ativoBjf;
    }

    
    @Column(name="senha_bjf", nullable=false, length=20)
    public String getSenhaBjf() {
        return this.senhaBjf;
    }
    
    public void setSenhaBjf(String senhaBjf) {
        this.senhaBjf = senhaBjf;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="usuariosBjf")
    public ClienteBjf getClienteBjf() {
        return this.clienteBjf;
    }
    
    public void setClienteBjf(ClienteBjf clienteBjf) {
        this.clienteBjf = clienteBjf;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="usuariosBjf")
    public FuncionarioBjf getFuncionarioBjf() {
        return this.funcionarioBjf;
    }
    
    public void setFuncionarioBjf(FuncionarioBjf funcionarioBjf) {
        this.funcionarioBjf = funcionarioBjf;
    }




}


