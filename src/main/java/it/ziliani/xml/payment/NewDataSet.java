


package it.ziliani.xml.payment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="PAGA"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="CODICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DESCRIZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="IMG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RISCOSSO" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="ELETTRONICO" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="VISIBILE" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="LIMITE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="DARESTO" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="FINOAEURO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="MAGGEURO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="FINOAPERC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="MAGGPERC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="CODB2B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CODVO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PUBVO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PRIVO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="VERSABILE" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                   &lt;element name="AUTOMATICO" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paga"
})
@XmlRootElement(name = "NewDataSet")
public class NewDataSet {

    @XmlElement(name = "PAGA")
    protected List<NewDataSet.PAGA> paga;

    /**
     * Gets the value of the paga property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paga property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPAGA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewDataSet.PAGA }
     * 
     * 
     */
    public List<NewDataSet.PAGA> getPAGA() {
        if (paga == null) {
            paga = new ArrayList<NewDataSet.PAGA>();
        }
        return this.paga;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="CODICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DESCRIZIONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="IMG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RISCOSSO" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="ELETTRONICO" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="VISIBILE" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="LIMITE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *         &lt;element name="DARESTO" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="FINOAEURO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *         &lt;element name="MAGGEURO" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *         &lt;element name="FINOAPERC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *         &lt;element name="MAGGPERC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *         &lt;element name="CODB2B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CODVO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PUBVO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PRIVO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="VERSABILE" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *         &lt;element name="AUTOMATICO" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "codice",
        "descrizione",
        "img",
        "riscosso",
        "elettronico",
        "visibile",
        "limite",
        "daresto",
        "finoaeuro",
        "maggeuro",
        "finoaperc",
        "maggperc",
        "codb2B",
        "codvo",
        "pubvo",
        "privo",
        "versabile",
        "automatico"
    })
    public static class PAGA {

        @XmlElement(name = "ID")
        protected Integer id;
        @XmlElement(name = "CODICE")
        protected String codice;
        @XmlElement(name = "DESCRIZIONE")
        protected String descrizione;
        @XmlElement(name = "IMG")
        protected String img;
        @XmlElement(name = "RISCOSSO")
        protected Short riscosso;
        @XmlElement(name = "ELETTRONICO")
        protected Short elettronico;
        @XmlElement(name = "VISIBILE")
        protected Short visibile;
        @XmlElement(name = "LIMITE")
        protected Double limite;
        @XmlElement(name = "DARESTO")
        protected Short daresto;
        @XmlElement(name = "FINOAEURO")
        protected Double finoaeuro;
        @XmlElement(name = "MAGGEURO")
        protected Double maggeuro;
        @XmlElement(name = "FINOAPERC")
        protected Double finoaperc;
        @XmlElement(name = "MAGGPERC")
        protected Double maggperc;
        @XmlElement(name = "CODB2B")
        protected String codb2B;
        @XmlElement(name = "CODVO")
        protected String codvo;
        @XmlElement(name = "PUBVO")
        protected String pubvo;
        @XmlElement(name = "PRIVO")
        protected String privo;
        @XmlElement(name = "VERSABILE")
        protected Short versabile;
        @XmlElement(name = "AUTOMATICO")
        protected Short automatico;

        /**
         * Recupera il valore della proprietà id.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getID() {
            return id;
        }

        /**
         * Imposta il valore della proprietà id.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setID(Integer value) {
            this.id = value;
        }

        /**
         * Recupera il valore della proprietà codice.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODICE() {
            return codice;
        }

        /**
         * Imposta il valore della proprietà codice.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODICE(String value) {
            this.codice = value;
        }

        /**
         * Recupera il valore della proprietà descrizione.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIZIONE() {
            return descrizione;
        }

        /**
         * Imposta il valore della proprietà descrizione.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIZIONE(String value) {
            this.descrizione = value;
        }

        /**
         * Recupera il valore della proprietà img.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIMG() {
            return img;
        }

        /**
         * Imposta il valore della proprietà img.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIMG(String value) {
            this.img = value;
        }

        /**
         * Recupera il valore della proprietà riscosso.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getRISCOSSO() {
            return riscosso;
        }

        /**
         * Imposta il valore della proprietà riscosso.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setRISCOSSO(Short value) {
            this.riscosso = value;
        }

        /**
         * Recupera il valore della proprietà elettronico.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getELETTRONICO() {
            return elettronico;
        }

        /**
         * Imposta il valore della proprietà elettronico.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setELETTRONICO(Short value) {
            this.elettronico = value;
        }

        /**
         * Recupera il valore della proprietà visibile.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getVISIBILE() {
            return visibile;
        }

        /**
         * Imposta il valore della proprietà visibile.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setVISIBILE(Short value) {
            this.visibile = value;
        }

       
        public Double getLIMITE() {
            return limite;
        }

        /**
         * Imposta il valore della proprietà limite.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setLIMITE(Double value) {
            this.limite = value;
        }

        /**
         * Recupera il valore della proprietà daresto.
         * 
        
        public Short getDARESTO() {
            return daresto;
        }

        /**
         * Imposta il valore della proprietà daresto.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setDARESTO(Short value) {
            this.daresto = value;
        }

        /**
         * Recupera il valore della proprietà finoaeuro.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getFINOAEURO() {
            return finoaeuro;
        }

        /**
         * Imposta il valore della proprietà finoaeuro.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setFINOAEURO(Double value) {
            this.finoaeuro = value;
        }

        /**
         * Recupera il valore della proprietà maggeuro.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getMAGGEURO() {
            return maggeuro;
        }

        /**
         * Imposta il valore della proprietà maggeuro.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setMAGGEURO(Double value) {
            this.maggeuro = value;
        }

        /**
         * Recupera il valore della proprietà finoaperc.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getFINOAPERC() {
            return finoaperc;
        }

        /**
         * Imposta il valore della proprietà finoaperc.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setFINOAPERC(Double value) {
            this.finoaperc = value;
        }

        /**
         * Recupera il valore della proprietà maggperc.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getMAGGPERC() {
            return maggperc;
        }

        /**
         * Imposta il valore della proprietà maggperc.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setMAGGPERC(Double value) {
            this.maggperc = value;
        }

        /**
         * Recupera il valore della proprietà codb2B.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODB2B() {
            return codb2B;
        }

        /**
         * Imposta il valore della proprietà codb2B.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODB2B(String value) {
            this.codb2B = value;
        }

        /**
         * Recupera il valore della proprietà codvo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODVO() {
            return codvo;
        }

        /**
         * Imposta il valore della proprietà codvo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODVO(String value) {
            this.codvo = value;
        }

        /**
         * Recupera il valore della proprietà pubvo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPUBVO() {
            return pubvo;
        }

        /**
         * Imposta il valore della proprietà pubvo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPUBVO(String value) {
            this.pubvo = value;
        }

        /**
         * Recupera il valore della proprietà privo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRIVO() {
            return privo;
        }

        /**
         * Imposta il valore della proprietà privo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRIVO(String value) {
            this.privo = value;
        }

        /**
         * Recupera il valore della proprietà versabile.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getVERSABILE() {
            return versabile;
        }

        /**
         * Imposta il valore della proprietà versabile.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setVERSABILE(Short value) {
            this.versabile = value;
        }

        /**
         * Recupera il valore della proprietà automatico.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getAUTOMATICO() {
            return automatico;
        }

        /**
         * Imposta il valore della proprietà automatico.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setAUTOMATICO(Short value) {
            this.automatico = value;
        }

    }

}
