
package arraydemos23friam;


public class Student {
    //comment added at 9.00 am
    //comment for today
    //comment for merge and pull
    //new comment for merge
    //pull
    
    private String sId;
    private String sName;
    private String phoneno;
    private String address;

    public Student(String sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }   
    
    public String getsId() {
        return sId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
  

    

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
    
    
}
