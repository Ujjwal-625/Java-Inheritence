package MultiLevelinheritence;


class Course{
    String courseName,courseDuration;
    Course(String courseName,String courseDuration){
        this.courseName=courseName;
        this.courseDuration=courseDuration;
    }
}

class OnlineCourse extends Course{
    String platform ;
    boolean isRecorded;
    OnlineCourse(String courseName,String courseDuration,String platform,boolean isRecorded){
        super(courseName,courseDuration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse{
    double fee;
    int discount;
    PaidOnlineCourse(String courseName,String courseDuration,String platform,boolean isRecorded,double fee,int discount){
        super(courseName,courseDuration,platform,isRecorded);
        this.fee=fee;
        this.discount=discount;
    }

}

public class EducationCourse {
    public static void main(String[] args) {

    }
}
