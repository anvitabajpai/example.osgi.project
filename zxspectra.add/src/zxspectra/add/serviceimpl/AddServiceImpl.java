package zxspectra.add.serviceimpl;
import zxspectra.add.AddService;

public class AddServiceImpl implements AddService {

	@Override
	public String add(int a, int b) {
		return String.valueOf(a+b);
		
	}

}
