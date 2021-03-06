package space.chensheng.wechatty.mp.material.upload;

import java.io.File;

import space.chensheng.wechatty.common.conf.AppContext;
import space.chensheng.wechatty.common.material.MediaType;

public class ImageTemporaryMedia extends TemporaryMedia {

	/**
	 * 
	 * @param media {@code size <= 2M}, format: PNG\JPEG\JPG\GIF
	 */
	public ImageTemporaryMedia(AppContext appContext, File media) {
		super(appContext, MediaType.IMAGE, media);
	}

}
