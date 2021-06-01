
  package hrms.hrmsBackend.business.adapters;
  
  import java.rmi.RemoteException; 
  import java.util.Locale;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
  

  import hrms.hrmsBackend.entities.concretes.JobSeeker;
  import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
  
  @Component
  public class MernisServiceAdapter implements JobSeekerCheckServiceAdapter{
  
  @Override 
  public boolean checkIfRealPerson(JobSeeker jobSeeker) {
  
  KPSPublicSoapProxy client = new KPSPublicSoapProxy();
  
  boolean result = true;
  
	  try {
		  result=client.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalityId()),
				  jobSeeker.getFirstName().toUpperCase(new Locale("tr")),
				  jobSeeker.getLastName().toUpperCase(new Locale("tr")),
				  jobSeeker.getDateOfBirth().getYear());
		  } catch (RemoteException e) {
			  		e.printStackTrace(); }
  
  
	  	return result;
  
  }
  
  }
 
