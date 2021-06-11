package hrms.hrmsBackend.business.adapters;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import hrms.hrmsBackend.core.utilites.results.DataResult;



public interface CloudinaryImageService {
	DataResult<Map> uploadImage(MultipartFile image);
}
