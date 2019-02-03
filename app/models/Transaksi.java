package models;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.*;

import java.util.*;

@Entity
@Table(name="tb_Transaksi")
public class Transaksi extends Model {
	
	@Required
	public int Jumlah;
	
	@OneToMany(cascade=CascadeType.ALL)
	
	public List<Produk> listProduk ;
	
	//@Required
	//public Float SubTotal=Jumlah*HargaProduk;
	//public Float Total=sumSubtotal
}
