/**
 * Created by ASUS on 6/10/2015.
 */
public class pemakai {
    private String nama;
    private String umur;
    private String jenisKelamin;

    public pemakai(String nama, String umur, String jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "pemakai{" +
                "nama='" + nama + '\'' +
                ", umur='" + umur + '\'' +
                ", jenisKelamin='" + jenisKelamin + '\'' +
                '}';
    }
}
