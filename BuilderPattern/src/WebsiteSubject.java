
public class WebsiteSubject {
	private String TenWebsite;
	private String DeCuong;
	private String TaiLieu;
	private String CacBaiGiang;
	private String CacBaiThucHanh;
	private String CacBaiTap;
	private String	CachChamDiemTP;
	private String HinhThucThi;
	
	public WebsiteSubject(String tenWebsite) {
		this.TenWebsite = tenWebsite;
	}
	public String getDeCuong() {
		return DeCuong;
	}
	public void setDeCuong(String deCuong) {
		this.DeCuong = deCuong;
	}
	public String getTaiLieu() {
		return TaiLieu;
	}
	public void setTaiLieu(String taiLieu) {
		TaiLieu = taiLieu;
	}
	public String getCacBaiGiang() {
		return CacBaiGiang;
	}
	public void setCacBaiGiang(String cacBaiGiang) {
		CacBaiGiang = cacBaiGiang;
	}
	public String getCacBaiThucHanh() {
		return CacBaiThucHanh;
	}
	public void setCacBaiThucHanh(String cacBaiThucHanh) {
		CacBaiThucHanh = cacBaiThucHanh;
	}
	public String getCacBaiTap() {
		return CacBaiTap;
	}
	public void setCacBaiTap(String cacBaiTap) {
		CacBaiTap = cacBaiTap;
	}
	public String getCachChamDiemTP() {
		return CachChamDiemTP;
	}
	public void setCachChamDiemTP(String cachChamDiemTP) {
		CachChamDiemTP = cachChamDiemTP;
	}
	public String getHinhThucThi() {
		return HinhThucThi;
	}
	public void setHinhThucThi(String hinhThucThi) {
		HinhThucThi = hinhThucThi;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("--------------"+this.TenWebsite+"--------------------- \n");
		sb.append(" De cuong: ");
		sb.append(this.DeCuong);
		sb.append("\n Tai Lieu: ");
		sb.append(this.TaiLieu);
		sb.append("\n Cac bai giang: ");
		sb.append(this.CacBaiGiang);
		sb.append("\n Cac bai thuc hanh: ");
		sb.append(this.CacBaiThucHanh);
		sb.append("\n Cac bai tap: ");
		sb.append(this.CacBaiTap);
		sb.append("\n CachChamDiemTP: ");
		sb.append(this.CachChamDiemTP);
		sb.append("\n Hinh thuc thi: ");
		sb.append(this.HinhThucThi);
		
		return sb.toString();
	}
	
}
