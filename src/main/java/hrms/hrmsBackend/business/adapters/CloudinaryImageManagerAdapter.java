package hrms.hrmsBackend.business.adapters;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.ErrorDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;

@Service
public class CloudinaryImageManagerAdapter implements CloudinaryImageService{
	
	private Cloudinary cloudinary;
	
	
	public CloudinaryImageManagerAdapter() {
		
		this.cloudinary = new Cloudinary();
	}


	@Override
	public DataResult<Map> uploadImage(MultipartFile image) {
		
		try {
			Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(image.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(resultMap);
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		return new ErrorDataResult<Map>();
		
		
	}


	}
	
