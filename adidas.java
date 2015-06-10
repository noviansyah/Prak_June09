/**
 * Created by ASUS on 6/10/2015.
 */
public class adidas {
    private String type;
    private String ukuran;
    private Double harga;

    public adidas(String type, String ukuran, Double harga) {
        this.type = type;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "adidas{" +
                "type='" + type + '\'' +
                ", ukuran='" + ukuran + '\'' +
                ", harga=" + harga +
                '}';
    }
}
