
public class DTPMWebsiteBuilder implements WebsiteBuilder {
	private final String websiteName = "Dac ta phan mem";
	private final WebsiteSubject websiteSubject = new WebsiteSubject(websiteName);

	public void buildDeCuong() {
		// TODO Auto-generated method stub
		this.websiteSubject.setDeCuong("De cuong ve DesignPatterns");
		
	}
	public void buildTaiLieu() {
		this.websiteSubject.setTaiLieu("Tai lieu on tap Builder, Tai lieu on tap");
		
	}
	public void buildCacBaiGiang() {
		this.websiteSubject.setCacBaiGiang("Bai giang DesignPattern Builder");
		
	}
	public void buildCacBaiThucHanh() {
		this.websiteSubject.setCacBaiThucHanh("Bai thuc hanh DesignPattern Builder");
		
	}
	public void buildCacBaiTap() {
		this.websiteSubject.setCacBaiThucHanh("Bai thuc hanh DesignPattern Builder");
		
	}
	public void buildCachChamDiemTP() {
		this.websiteSubject.setCachChamDiemTP("50% chuyen can, 50% kiem tra");
		
	}
	public void buildHinhThucThi() {
		this.websiteSubject.setHinhThucThi("Mot buoi nghiem thu mon hoc");
		
	}
	public WebsiteSubject getWebsiteSubject() {
		return this.websiteSubject;
	}

}

