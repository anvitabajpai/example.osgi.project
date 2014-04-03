package xspectra.getlist.serviceimpl;

import xspectra.getlist.service.CloudMinderTaskService;

public class CloudMinderTaskServiceImpl implements CloudMinderTaskService{

	@Override
	public String getTaskList() {
				
	    String jsonString ="[{\"Name\":\"Box\","+
				"\"URL\":\"http://cloudminder.mycroftcloud.com/chs/login/alexg001/Box/\","+
				"\"Image URL\":\"https://cloudminder.mycroftcloud.com/iam/im/alexg001/binaryattribute/?contentType=image&attribute=image&objectType=DIGITAL%20MANAGED%20OBJECT&uniqueValue=93f244a2_9b0d5750_76719bad_ceae31&uniqueAttr=tag&alternate=/ui/images/default.gif\"},"+
				
				"{\"Name\":\"Test Application 2\","+
				"\"URL\":\"http://cloudminder.mycroftcloud.com/chs/login/alexg001/Test Application 2/\","+
				"\"Image URL\":\"https://cloudminder.mycroftcloud.com/iam/im/alexg001/binaryattribute/?contentType=image&attribute=image&objectType=DIGITAL%20MANAGED%20OBJECT&uniqueValue=207d19ac_fe8a9db8_e3493240_a3a2ac&uniqueAttr=tag&alternate=/ui/images/default.gif\"},"+
				
				"{\"Name\":\"Request access to services\","+
				"\"URL\":\"https://cloudminder.mycroftcloud.com/iam/im/alexg001/ui7/index.jsp??facesViewId=/app/page/relationship/relationship.jsp\","+
				"\"Image URL\":\"https://cloudminder.mycroftcloud.com/iam/im/ui/services/my_services.gif\"}]";

		return jsonString;
	}

}
