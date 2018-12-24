
package model;

/**
 *
 * @author MinhMan
 */
public class sinhvien {
    private String Ma;
    private String TenFile;
    private String Size;
    private String Location;
    private String ID;
    private String Pass;
    private String Nam;
    private String Link;
   
    
    public sinhvien(){
        
    }

    public sinhvien(String Ma, String TenFile, String Size, String Location, String ID, String Pass, String Nam, String Link) {
        this.Ma = Ma;
        this.TenFile = TenFile;
        this.Size = Size;
        this.Location = Location;
        this.ID = ID;
        this.Pass = Pass;
        this.Nam = Nam;
        this.Link = Link;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTenFile() {
        return TenFile;
    }

    public void setTenFile(String TenFile) {
        this.TenFile = TenFile;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getNam() {
        return Nam;
    }

    public void setNam(String Nam) {
        this.Nam = Nam;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

}