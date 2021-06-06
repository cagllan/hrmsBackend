package hrms.hrmsBackend.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrmsBackend.business.abstracts.CityService;
import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.core.utilites.results.SuccessDataResult;
import hrms.hrmsBackend.core.utilites.results.SuccessResult;
import hrms.hrmsBackend.dataAccess.abstracts.CityDao;
import hrms.hrmsBackend.entities.concretes.City;

@Service
public class CityManager implements CityService{
	private CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("şehir eklendi");
	}
	
	@Override
	public Result update(City city) {
		this.cityDao.save(city);
		return new SuccessResult("şehir güncellendi");
	}

	@Override
	public Result delete(City city) {
		this.cityDao.delete(city);
		return new SuccessResult("şehir silindi");
	}

	@Override
	public DataResult<City> getById(int id) {
		return new SuccessDataResult<City>(this.cityDao.getById(id),"şehir goruntulendi");
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"şehirler listelendi");
	}


	
	
}
