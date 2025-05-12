
import java.util.ArrayList;
import java.util.List;
public class LeaveManager {
	private List<LeaveRequest> leaveRequests=new ArrayList<LeaveRequest>();


	   //method to submit a lave request
	    public void submitLeaveRequest(LeaveRequest request){
	        leaveRequests.add(request);
	        System.out.println("Leave request submitted for: "+request.getEmployee().getName());
	    }
	    //method to show all leave requests
	    public void showAllLeaveRequests(){
	        System.out.println("\nAll leave Requests:");
	        for(LeaveRequest request : leaveRequests ){
	            System.out.println(request);
	        }
	    }
	    //method to show leave request by status
	    public void showLeaveRequestByStatus(String status) {
	    	for(LeaveRequest request:leaveRequests) {
	    		if(request.getStatus().equalsIgnoreCase(status)) {
	    			System.out.println(request);
	    		}
	    	}
	    }
	    //method to approve leave by empoyee id
	    public void approveLeave(int employeeId) {
	    	for(LeaveRequest request : leaveRequests) {
	    		if(request.getEmployee().getId()==employeeId && request.getStatus().equals("pending")) {
	    			request.setStatus("Approved");
	    			System.out.println("Leave approve for : "+request.getEmployee().getName());
	    			return;
	    		}
	    	}
	    	System.out.println("no pending leave is found for EmployeeId"+employeeId);
	    }
	    public void rejectLeave(int employeeId) {
	    	for(LeaveRequest request : leaveRequests) {
	    		if(request.getEmployee().getId()==employeeId && request.getStatus().equals("pending")) {
	    			request.setStatus("Rejected");
	    			System.out.println("Leave Reject for : "+request.getEmployee().getName());
	    			return;
	    		}
	    	}
	    	System.out.println("no pending leave is found for EmployeeId"+employeeId);
	    }
}
