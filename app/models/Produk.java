package models;
import play.data.validation.*;
import play.db.jpa.Model;

import javax.persistence.*;

import java.util.*;


@Entity
@Table(name="tb_Produk")
public class Produk extends Model{
	
	
	@Required
	@Column(unique=true)
	@MinSize(5)
	@MaxSize(20)
	public String NamaProduk;
	@Required
	public Float HargaProduk;
	
	public String toString(){
		return NamaProduk;
	}

}
