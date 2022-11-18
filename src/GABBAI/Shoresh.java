package GABBAI;
/* TODO: 11/18/22
    1) Refactor to not include previous comments
    2) Review all variables and methods
    3) Pseudo-code refactor
    4) Break
    5) Refactor


 */

import java.util.ArrayList;
import java.util.HashMap;

abstract class Shoresh {

    private String name; //name
    private int age;
    private String pNouns; //pronouns
    private String shevet; // tribe - who are your people--Can include interpreters, PCAs, caregivers, parents
    private String sup; //Support needs
    private String saf; //Safety needs
    private String accs; //Access needs

   /* Methods I want aaliyot private HashMap<> aliyot; //Aliyahs request method make a method (this will be children under bne'i mitzavh age)
   //  isSober; Make an empty method called hagafen - kids -pritns this person is underage, sober adults will print somn else

    */

    public Shoresh(String name, int age, String pNouns, String shevet, String sup, String saf, String accs) {
        this.name = name;
        this.age = age;
        this.pNouns = pNouns;
        this.shevet = shevet;
        this.sup = sup;
        this.saf = saf;
        this.accs = accs;
    }

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

    public abstract void bpHagefen(); //ot v milah

    public abstract void aliyotReq(); //ot v milah

    @Override
    public String toString() {
        return "Shoresh{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pNouns='" + pNouns + '\'' +
                ", shevet='" + shevet + '\'' +
                ", sup='" + sup + '\'' +
                ", saf='" + saf + '\'' +
                ", accs='" + accs + '\'' +
                '}';
    }
}

