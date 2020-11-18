
public class WebsiteDirector {
	private WebsiteBuilder _websiteBuilder;

	public WebsiteDirector(WebsiteBuilder websiteBuilder) {
		super();
		this._websiteBuilder = websiteBuilder;
	}
	public void build() {
		this._websiteBuilder.buildDeCuong();
		this._websiteBuilder.buildTaiLieu();
		this._websiteBuilder.buildCacBaiGiang();
		this._websiteBuilder.buildCacBaiThucHanh();
		this._websiteBuilder.buildCacBaiTap();
		this._websiteBuilder.buildCachChamDiemTP();
		this._websiteBuilder.buildHinhThucThi();
	}
	
}
