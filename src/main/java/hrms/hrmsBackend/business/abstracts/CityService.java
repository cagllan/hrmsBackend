package hrms.hrmsBackend.business.abstracts;

import java.util.List;

import hrms.hrmsBackend.core.utilites.results.DataResult;
import hrms.hrmsBackend.core.utilites.results.Result;
import hrms.hrmsBackend.entities.concretes.City;

public interface CityService {
	Result add(City city);
	Result update(City city);
	Result delete(City city);
	DataResult<City> getById(int id);
	DataResult<List<City>> getAll();
}
