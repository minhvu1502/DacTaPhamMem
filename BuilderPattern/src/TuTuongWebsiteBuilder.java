
public class TuTuongWebsiteBuilder implements WebsiteBuilder {

	private final String websiteName = "Tu tuong Ho Chi Minh";
	private final WebsiteSubject websiteSubject = new WebsiteSubject(websiteName);

	public void buildDeCuong() {
		// TODO Auto-generated method stub
		this.websiteSubject.setDeCuong("De cuong Hoc tap va lam theo guong Bac Ho");
		
	}
	public void buildTaiLieu() {
		this.websiteSubject.setTaiLieu("Tai lieu on tap Tu Tuong Ho Chi Minh, Tai lieu on tap thi cuoi ki");
		
	}
	public void buildCacBaiGiang() {
		this.websiteSubject.setCacBaiGiang("Bai giang Tu tuong Ho Chi Minh");
		
	}
	public void buildCacBaiThucHanh() {
		this.websiteSubject.setCacBaiThucHanh("Bai thuc hanh Tu Tuong Ho Chi Minh");
		
	}
	public void buildCacBaiTap() {
		this.websiteSubject.setCacBaiThucHanh("Bai tap ve Tu tuong Ho Chi Minh");
		
	}
	public void buildCachChamDiemTP() {
		this.websiteSubject.setCachChamDiemTP("30% chuyen can, 70% kiem tra");
		
	}
	public void buildHinhThucThi() {
		this.websiteSubject.setHinhThucThi("Thi tren giay");
		
	}
	public WebsiteSubject getWebsiteSubject() {
		return this.websiteSubject;
	}


}
