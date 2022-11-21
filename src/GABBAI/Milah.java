package GABBAI;

/*
 Todo:
  1) Shift from private to protected
  2) add getters and setters
  3) Abstracts
  4) Prints
  5) Test

 */

public class Milah extends Shoresh {

    //Adult congregant
    protected String name; //name
    protected int age;
    protected String pNouns; //pronouns
    protected String shevet; // tribe - who are your people--Can include interpreters, PCAs, caregivers, parents
    protected String sup; //Support needs
    protected String saf; //Safety needs
    protected String accs; //Access needs
    protected boolean isSober;
    protected boolean aliyotReq;

    //contructor
    public Milah(String name, int age, String pNouns, String shevet, String sup, String saf, String accs, boolean isSober, boolean aliyotReq) {
        this.name = name;
        this.age = age;
        this.pNouns = pNouns;
        this.shevet = shevet;
        this.sup = sup;
        this.saf = saf;
        this.accs = accs;
        this.isSober = isSober;
        this.aliyotReq = aliyotReq;
    }

//getters/settters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getpNouns() {
        return pNouns;
    }

    public void setpNouns(String pNouns) {
        this.pNouns = pNouns;
    }

    public String getShevet() {
        return shevet;
    }

    public void setShevet(String shevet) {
        this.shevet = shevet;
    }

    public String getSup() {
        return sup;
    }

    public void setSup(String sup) {
        this.sup = sup;
    }

    public String getSaf() {
        return saf;
    }

    public void setSaf(String saf) {
        this.saf = saf;
    }

    public String getAccs() {
        return accs;
    }

    public void setAccs(String accs) {
        this.accs = accs;
    }

    public boolean isSober() {
        return isSober;
    }

    public void setSober(boolean sober) {
        isSober = sober;
    }

    public boolean isAliyotReq() {
        return aliyotReq;
    }

    public void setAliyotReq(boolean aliyotReq) {
        this.aliyotReq = aliyotReq;
    }



    //Abstract A
    @Override
    public void bpHagefen() {
        if (isSober)
            System.out.println("This congregant is sober from alcohol. Please provide them with pri hagafen alternative.");

    }

    //Abstract B
    @Override
    public void aliyotReq() {
        if(aliyotReq)
        System.out.println("This person has requested an alia");//aliyot for Shabbat
    }

    //Print method
    @Override
    public String toString() {
        return "Milah{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pNouns='" + pNouns + '\'' +
                ", shevet='" + shevet + '\'' +
                ", sup='" + sup + '\'' +
                ", saf='" + saf + '\'' +
                ", accs='" + accs + '\'' +
                ", isSober=" + isSober +
                ", aliyotReq=" + aliyotReq +
                '}';
    }
}


